package ru.kpfu.itis.akhmetova.dto;

public class ArticleDto {
    private String subject;
    private String title;
    private String content;

    public ArticleDto(String subject, String title, String content) {
        this.subject = subject;
        this.title = title;
        this.content = content;
    }

    public ArticleDto() {
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
}
