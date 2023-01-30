package com.example.androidstudytutorial.model;

import java.io.Serializable;

public class Descx implements Serializable {

    int id;
    String questions;
    String answers;

    public Descx(int id, String questions, String answers) {
        this.id = id;
        this.questions = questions;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Descx{" +
                "id=" + id +
                ", questions='" + questions + '\'' +
                ", answers='" + answers + '\'' +
                '}';
    }
}
