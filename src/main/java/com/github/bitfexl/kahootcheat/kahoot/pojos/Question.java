package com.github.bitfexl.kahootcheat.kahoot.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Question {
    public enum Answer {
        RED(0), BLUE(1), YELLOW(2), GREEN(3);

        public final int index;

        Answer(int index) {
            this.index = index;
        }

        public static Answer fromIndex(int index) {
            return switch (index) {
                case 0 -> RED;
                case 1 -> BLUE;
                case 2 -> YELLOW;
                case 3 -> GREEN;
                default -> throw new IllegalArgumentException("Index " + index + " unknown.");
            };
        }
    }

    private String question;
    private String kahootId;
    private List<Answer> rightAnswers;
}
