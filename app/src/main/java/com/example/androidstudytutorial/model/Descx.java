package com.example.androidstudytutorial.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Descx implements Parcelable {

    int id;
    String questions;
    String answers;

    public Descx() {}

    protected Descx(Parcel in) {
        id = in.readInt();
        questions = in.readString();
        answers = in.readString();
    }

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(questions);
        dest.writeString(answers);
    }

    public static final Creator<Descx> CREATOR = new Creator<Descx>() {
        @Override
        public Descx createFromParcel(Parcel in) {
            return new Descx(in);
        }

        @Override
        public Descx[] newArray(int size) {
            return new Descx[size];
        }
    };
}
