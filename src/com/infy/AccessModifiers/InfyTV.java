package com.infy.AccessModifiers;

public class InfyTV {
     private String photographer;
     private String newsReporter;
     private String correspondent;


    public InfyTV() {
    }

    public void documentaryFilm(){
        System.out.println("A hundred years ago there were 100,000 tigers in the world. Today there are as few as 3,200. Why are tigers disappearing?......\n" +
                "by Correspondent: \n" + correspondent+
                "Photographer: \n"  + photographer+
                "newsReporter: \n" + newsReporter);
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public String getNewsReporter() {
        return newsReporter;
    }

    public void setNewsReporter(String newsReporter) {
        this.newsReporter = newsReporter;
    }

    public String getCorrespondent() {
        return correspondent;
    }

    public void setCorrespondent(String correspondent) {
        this.correspondent = correspondent;
    }

    @Override
    public String toString() {
        return "InfyTV{" +
                "photographer='" + photographer + '\'' +
                ", newsReporter='" + newsReporter + '\'' +
                ", correspondent='" + correspondent + '\'' +
                '}';
    }
}
