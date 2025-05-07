package com.example.demo.dto;

public class BookResponse {
    private String title;
    private String summary;

    public BookResponse(String title, String summary) {
        this.title = title;
        this.summary = summary;
    }

    public String getTitle() { return title; }
    public String getSummary() { return summary; }
}
