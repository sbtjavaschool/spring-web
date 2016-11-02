package ru.sbt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GoogleController {
    @Autowired
    private SearchEngine searchEngine;

    @RequestMapping(value = "google")
    public String run() {
        return "google";
    }

    @RequestMapping(value = "search")
    @ResponseBody
    public List<SearchResult> search(String filter) {
        return searchEngine.search(filter);

    }
}