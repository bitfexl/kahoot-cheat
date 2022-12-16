package com.github.bitfexl.kahootcheat.contorllers;

import com.github.bitfexl.kahootcheat.kahoot.KahootClient;
import com.github.bitfexl.kahootcheat.kahoot.pojos.Kahoot;
import com.github.bitfexl.kahootcheat.kahoot.pojos.Question;
import com.github.bitfexl.kahootcheat.services.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SearchController {
    private final KahootClient kahootClient;
    private final SearchService searchService;

    @GetMapping("/login")
    public void login() {
        kahootClient.login();
    }

    @GetMapping("/search")
    public List<Kahoot> search(@RequestParam(name = "query") String query) {
        return searchService.search(query);
    }

    @GetMapping("/details")
    public List<Question> details(@RequestParam(name = "id") String kahootId) {
        return searchService.details(kahootId);
    }
}
