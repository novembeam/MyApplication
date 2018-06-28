package com.example.pc02.myapplication.GAME;

public class Question {
    private int ID;
    private String QUESTION;
    private String[] choice = new String[4];
    private String ANSWER;
    //private String quiz_sound;
    //private String choice_sound;

    public Question() {
    }

    public Question(String QUESTION, String[] choices, String ANSWER) {

       this.QUESTION = QUESTION;
       this.choice[0] = choices[0];
       this.choice[1] = choices[1];
       this.choice[2] = choices[2];
       this.choice[3] = choices[3];
       this.ANSWER = ANSWER;
    }

    //  Getter

    public int getID() {
        return ID;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public String getChoice(int i) {
        return choice[i];
    }

    public String getANSWER() {
        return ANSWER;
    }

    //  Setter

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setQUESTION(String QUESTION) {
        this.QUESTION = QUESTION;
    }

    public void setChoice(int i,String choice) {
        this.choice[i] = choice;
    }

    public void setANSWER(String ANSWER) {
        this.ANSWER = ANSWER;
    }
}
