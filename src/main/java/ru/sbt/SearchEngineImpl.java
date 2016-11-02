package ru.sbt;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class SearchEngineImpl implements SearchEngine {
    @Override
    public List<SearchResult> search(String filter) {
        List<SearchResult> results = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i < random.nextInt(10) + 1; i++) {
            results.add(new SearchResult("title" + random.nextInt(),
                    "url" + random.nextInt(),
                    String.valueOf(random.nextDouble())));
        }
        return results;
    }
}
