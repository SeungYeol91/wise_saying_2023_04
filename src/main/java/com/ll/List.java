package com.ll;

public class List {
    private String content;
    private String authorName;
    private int count;

    public List(String content, String authorName, int count) {
        this.content = content;
        this.authorName = authorName;
        this.count = count;
    }

    public String getContent() {
        return content;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getCount() {
        return count;
    }
}
