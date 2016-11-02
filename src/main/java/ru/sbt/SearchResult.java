package ru.sbt;

public class SearchResult {
    private final String title;
    private final String url;
    private final String text;

    public SearchResult(String title, String url, String text) {
        this.title = title;
        this.url = url;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getText() {
        return text;
    }
}

