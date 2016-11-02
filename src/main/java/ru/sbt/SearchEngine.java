package ru.sbt;

import java.util.List;

public interface SearchEngine {
    List<SearchResult> search(String filter);
}
