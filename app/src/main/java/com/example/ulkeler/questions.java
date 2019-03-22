package com.example.ulkeler;

public class questions {
    public String mQuestions[]={
            "aa",
            "bb",
            "cc",
            "dd",
            "ee",
            "ff",
            "gg",
            "hh",
            "ii"
    };
    private String mChoices[][]={
            {"a","b","c","d"},
            {"a","b","c","d"},
            {"a","b","c","d"},
            {"a","b","c","d"},
            {"a","b","c","d"},
            {"a","b","c","d"},
            {"a","b","c","d"},
            {"a","b","c","d"},
            {"a","b","c","d"}
    };
   public  String mCorrectAnswer[]={"a","b","c","d","a","b","c","d","b"};

    public String getQuestion(int a) {
        String questions = mQuestions[a];
        return questions;
    }
    public String getChoices1(int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoices2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoices3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoices4(int a){
        String choice = mChoices[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
