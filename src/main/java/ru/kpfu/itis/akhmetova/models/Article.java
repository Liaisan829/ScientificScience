package ru.kpfu.itis.akhmetova.models;

public class Article {
    int id;
    String subject;
    String title;
    String content;

    public Article(int id, String subject, String title, String content) {
        this.id = id;
        this.subject = subject;
        this.title = title;
        this.content = content;
    }

    public Article() {
    }

    public Article(String subject, String title, String content) {
        this.subject = subject;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
