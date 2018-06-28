package com.example.pc02.myapplication.GAME;

import android.content.Context;
import android.database.sqlite.SQLiteException;

import com.example.pc02.myapplication.DatabaseHelper;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    private List<Question> list = new ArrayList<>();
    private DatabaseHelper myDataBaseHelper;


    public int getLength(){
        return list.size();// method returns number of questions in list
    }

    public String getQuestion(int a) {
        return list.get(a).getQUESTION();// method returns question from list based on list index
    }


    public String getChoice(int index, int num) {
        return list.get(index).getChoice(num-1);// method return a single multiple choice item for question based on list index,
        // based on number of multiple choice item in the list - 1, 2, 3 or 4
        // as an argument
    }


    public String getCorrectAnswer(int a) {
        return list.get(a).getANSWER(); //  method returns correct answer for the question based on list index
    }


    // pull data from db
    public void initQuestions(Context context) {
        myDataBaseHelper = new DatabaseHelper(context);

        try {
            myDataBaseHelper.checkAndCopyDatabase();
            myDataBaseHelper.openDatabase();
        }catch (SQLiteException e){
            e.printStackTrace();
        }
        list = myDataBaseHelper.getAllQuestions01();//get questions/choices/answers from database
    }

    public void initQuestions02(Context context) {
        myDataBaseHelper = new DatabaseHelper(context);
        list = myDataBaseHelper.getAllQuestions02();
    }

    public void initQuestions03(Context context) {
        myDataBaseHelper = new DatabaseHelper(context);
        list = myDataBaseHelper.getAllQuestions03();
    }

    public void initQuestions04(Context context) {
        myDataBaseHelper = new DatabaseHelper(context);
        list = myDataBaseHelper.getAllQuestions04();
    }

    public void initQuestions05(Context context) {
        myDataBaseHelper = new DatabaseHelper(context);
        list = myDataBaseHelper.getAllQuestions05();
    }

    public void initQuestions06(Context context) {
        myDataBaseHelper = new DatabaseHelper(context);
        list = myDataBaseHelper.getAllQuestions06();
    }

    public void initQuestions07(Context context) {
        myDataBaseHelper = new DatabaseHelper(context);
        list = myDataBaseHelper.getAllQuestions07();
    }

    public void initQuestions08(Context context) {
        myDataBaseHelper = new DatabaseHelper(context);
        list = myDataBaseHelper.getAllQuestions08();
    }
}

