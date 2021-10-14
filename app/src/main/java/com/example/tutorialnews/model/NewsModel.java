package com.example.tutorialnews.model;

import java.util.ArrayList;

public class NewsModel {
    private String status;
    private int totalsResult;
    private ArrayList<Article> article;

    public NewsModel(String status, int totalsResult, ArrayList<Article> article) {
        this.status = status;
        this.totalsResult = totalsResult;
        this.article = article;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalsResult() {
        return totalsResult;
    }

    public void setTotalsResult(int totalsResult) {
        this.totalsResult = totalsResult;
    }

    public ArrayList<Article> getArticle() {
        return article;
    }

    public void setArticle(ArrayList<Article> article) {
        this.article = article;
    }
}
