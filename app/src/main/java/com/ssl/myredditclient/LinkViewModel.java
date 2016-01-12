package com.ssl.myredditclient;

public class LinkViewModel {

    private String titleText;
    private String submittedText;
    private String commentText;

    public LinkViewModel(String titleText, String submittedText, String commentText) {
        this.titleText = titleText;
        this.submittedText = submittedText;
        this.commentText = commentText;
    }

    public String getCommentText() {
        return commentText;
    }

    public String getSubmittedText() {
        return submittedText;
    }

    public String getTitleText() {
        return titleText;
    }
}
