package com.github.bitfexl.kahootcheat.kahoot;

import com.github.bitfexl.kahootcheat.kahoot.pojos.Kahoot;
import com.github.bitfexl.kahootcheat.kahoot.pojos.Question;
import com.github.bitfexl.kahootcheat.kahoot.pojos.details.Detail;
import com.github.bitfexl.kahootcheat.kahoot.pojos.search.Entity;
import com.github.bitfexl.kahootcheat.kahoot.pojos.search.Search;

import java.util.ArrayList;
import java.util.List;

public class DataOrganizer {
    public List<Kahoot> kahoots(Search search) {
        List<Kahoot> kahoots = new ArrayList<>();
        for (Entity entity : search.getEntities()) {
            kahoots.add(new Kahoot(
                    entity.getCard().getTitle(),
                    entity.getCard().getUuid(),
                    entity.getCard().getNumberOfQuestions())
            );
        }
        return kahoots;
    }

    public List<Question> questions(Detail detail) {
        List<Question> questions = new ArrayList<>();
        for (com.github.bitfexl.kahootcheat.kahoot.pojos.details.Question question : detail.getKahoot().getQuestions()) {
            questions.add(new Question(
                    question.getQuestion(),
                    detail.getCard().getUuid(),
                    rightAnswers(question))
            );
        }
        return questions;
    }

    private List<Question.Answer> rightAnswers(com.github.bitfexl.kahootcheat.kahoot.pojos.details.Question question) {
        List<Question.Answer> rightAnswers = new ArrayList<>();
        for (int i=0; i<question.getChoices().size(); i++) {
            if (question.getChoices().get(i).getCorrect()) {
                rightAnswers.add(Question.Answer.fromIndex(i));
            }
        }
        return rightAnswers;
    }
}
