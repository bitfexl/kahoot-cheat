package com.github.bitfexl.kahootcheat.services;

import com.github.bitfexl.kahootcheat.kahoot.DataOrganizer;
import com.github.bitfexl.kahootcheat.kahoot.KahootClient;
import com.github.bitfexl.kahootcheat.kahoot.pojos.Kahoot;
import com.github.bitfexl.kahootcheat.kahoot.pojos.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchService {
    private final KahootClient kahootClient;
    private final DataOrganizer dataOrganizer = new DataOrganizer();

    public List<Kahoot> search(String query) {
        return dataOrganizer.kahoots(kahootClient.search(query));
    }

    public List<Question> details(String kahootId) {
        return dataOrganizer.questions(kahootClient.details(kahootId));
    }
}
