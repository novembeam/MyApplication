package com.example.pc02.myapplication;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.os.Environment;
import android.util.Log;

import com.example.pc02.myapplication.GAME.Question;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static String DB_NAME = "Kid_App.db";
    private static String DB_PATH = "";
    private SQLiteDatabase myDatabase;
    private final Context myContext;


/*
    private static String TABLE_QUIZ_01 = "Quiz_01";
    private static String TABLE_QUIZ_02 = "Quiz_02";
    private static String TABLE_QUIZ_03 = "Quiz_03";
    private static String TABLE_QUIZ_04 = "Quiz_04";
    private static String TABLE_QUIZ_05 = "Quiz_05";
    private static String TABLE_QUIZ_06 = "Quiz_06";
    private static String TABLE_QUIZ_07 = "Quiz_07";
    private static String TABLE_QUIZ_08 = "Quiz_08";

    private static String COL_1_QUIZ_01 = "quiz_01_ID";
    private static String COL_1_QUIZ_02 = "quiz_02_ID";
    private static String COL_1_QUIZ_03 = "quiz_03_ID";
    private static String COL_1_QUIZ_04 = "quiz_04_ID";
    private static String COL_1_QUIZ_05 = "quiz_05_ID";
    private static String COL_1_QUIZ_06 = "quiz_06_ID";
    private static String COL_1_QUIZ_07 = "quiz_07_ID";
    private static String COL_1_QUIZ_08 = "quiz_08_ID";


    //private static String COL_2 = "question";// picture quiz path
    //private static String COL_3 = "answer";
    //private static String COL_4 = "choice1";
    //private static String COL_5 = "choice2";
    //private static String COL_6 = "choice3";
    //private static String COL_7 = "choice4";
    */
//------------------new--------------------
    private static String TABLE_QUIZ_GAME = "Quiz_Game";
    private static String ID_QUIZ_GAME = "quizID";
    private static String COL_2 = "question";// picture quiz path
    private static String COL_3 = "question_type";
    private static String COL_4 = "quiz_sound";// sound quiz path
    private static String COL_5 = "answer";
    private static String COL_6 = "choice1";
    private static String COL_7 = "choice2";
    private static String COL_8 = "choice3";
    private static String COL_9 = "choice4";

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, 1);
        if (Build.VERSION.SDK_INT >= 16) {
            DB_PATH = context.getApplicationInfo().dataDir + "/databases/";
        } else {
            DB_PATH = Environment.getDataDirectory() + "/data/" + context.getPackageName() + "/databases/";
        }
        this.myContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void checkAndCopyDatabase() {
        boolean dbExist = checkDatabase();
        if (dbExist) {
            Log.d("TAG", "database already exist");
        } else {
            this.getReadableDatabase();
        }
        try {
            copyDatabase();
        } catch (IOException e) {
            Log.d("TAG", "Error copy database");
        }
    }

    public boolean checkDatabase() {
        SQLiteDatabase checkDB = null;
        try {
            String myPath = DB_PATH + DB_NAME;
            checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READWRITE);
        } catch (SQLiteException e) {
        }
        if (checkDB != null) {
            checkDB.close();
        }
        return checkDB != null ? true : false;
    }

    public void copyDatabase() throws IOException {
        InputStream myInput = myContext.getAssets().open(DB_NAME);
        String outFileName = DB_PATH + DB_NAME;
        OutputStream myOutput = new FileOutputStream(outFileName);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer)) > 0) {
            myOutput.write(buffer, 0, length);
        }
        myOutput.flush();
        myOutput.close();
        myInput.close();
    }

    public void openDatabase() {
        String myPath = DB_PATH + DB_NAME;
        myDatabase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READWRITE);
    }

    public synchronized void close() {
        if (myDatabase != null) {
            myDatabase.close();
        }
        super.close();
    }

    public Cursor QueryData(String query) {
        return myDatabase.rawQuery(query, null);
    }

//      NEW

    //  Example  Quiz_01
    public List<Question> getAllQuestions01() {
        List<Question> quesList = new ArrayList<>();
        String selectQuery = "SELECT * FROM "+ TABLE_QUIZ_GAME +" WHERE "+COL_3+" = 'payunchana' "+" ORDER BY RANDOM() LIMIT 20";// Select All Query

        myDatabase = this.getReadableDatabase();
        Cursor cursor = myDatabase.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question question = new Question();
                //question.setID(cursor.getInt(0));

                String questText = cursor.getString(cursor.getColumnIndex(COL_2));
                question.setQUESTION(questText);
                //new
                String quizSound = cursor.getString(cursor.getColumnIndex(COL_4));
                question.setQuiz_sound(quizSound);
                //new
                String answerText = cursor.getString(cursor.getColumnIndex(COL_5));
                question.setANSWER(answerText);

                String choice1Text = cursor.getString(cursor.getColumnIndex(COL_6));
                question.setChoice(0, choice1Text);

                String choice2Text = cursor.getString(cursor.getColumnIndex(COL_7));
                question.setChoice(1, choice2Text);

                String choice3Text = cursor.getString(cursor.getColumnIndex(COL_8));
                question.setChoice(2, choice3Text);

                String choice4Text = cursor.getString(cursor.getColumnIndex(COL_9));
                question.setChoice(3, choice4Text);

                quesList.add(question);

            } while (cursor.moveToNext());
            Collections.shuffle(quesList);
        }

        myDatabase.close();
        return quesList;
    }

    public List<Question> getAllQuestions02() {
        List<Question> quesList = new ArrayList<>();
        String selectQuery = "SELECT * FROM "+ TABLE_QUIZ_GAME +" WHERE "+COL_3+" = 'sara' "+" ORDER BY RANDOM() LIMIT 20";// Select All Query

        myDatabase = this.getReadableDatabase();
        Cursor cursor = myDatabase.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question question = new Question();
                //question.setID(cursor.getInt(0));

                String questText = cursor.getString(cursor.getColumnIndex(COL_2));
                question.setQUESTION(questText);

                //new
                String quizSound = cursor.getString(cursor.getColumnIndex(COL_4));
                question.setQuiz_sound(quizSound);
                //new

                String answerText = cursor.getString(cursor.getColumnIndex(COL_5));
                question.setANSWER(answerText);

                String choice1Text = cursor.getString(cursor.getColumnIndex(COL_6));
                question.setChoice(0, choice1Text);

                String choice2Text = cursor.getString(cursor.getColumnIndex(COL_7));
                question.setChoice(1, choice2Text);

                String choice3Text = cursor.getString(cursor.getColumnIndex(COL_8));
                question.setChoice(2, choice3Text);

                String choice4Text = cursor.getString(cursor.getColumnIndex(COL_9));
                question.setChoice(3, choice4Text);

                quesList.add(question);

            } while (cursor.moveToNext());
            Collections.shuffle(quesList);
        }

        myDatabase.close();
        return quesList;
    }

    public List<Question> getAllQuestions03() {
        List<Question> quesList = new ArrayList<>();
        String selectQuery = "SELECT * FROM "+ TABLE_QUIZ_GAME +" WHERE "+COL_3+" = 'abc' "+" ORDER BY RANDOM() LIMIT 20";// Select All Query

        myDatabase = this.getReadableDatabase();
        Cursor cursor = myDatabase.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question question = new Question();
                //question.setID(cursor.getInt(0));

                String questText = cursor.getString(cursor.getColumnIndex(COL_2));
                question.setQUESTION(questText);

                //new
                String quizSound = cursor.getString(cursor.getColumnIndex(COL_4));
                question.setQuiz_sound(quizSound);
                //new

                String answerText = cursor.getString(cursor.getColumnIndex(COL_5));
                question.setANSWER(answerText);

                String choice1Text = cursor.getString(cursor.getColumnIndex(COL_6));
                question.setChoice(0, choice1Text);

                String choice2Text = cursor.getString(cursor.getColumnIndex(COL_7));
                question.setChoice(1, choice2Text);

                String choice3Text = cursor.getString(cursor.getColumnIndex(COL_8));
                question.setChoice(2, choice3Text);

                String choice4Text = cursor.getString(cursor.getColumnIndex(COL_9));
                question.setChoice(3, choice4Text);

                quesList.add(question);

            } while (cursor.moveToNext());
            Collections.shuffle(quesList);
        }

        myDatabase.close();
        return quesList;
    }

    public List<Question> getAllQuestions04() {
        List<Question> quesList = new ArrayList<>();
        String selectQuery = "SELECT * FROM "+ TABLE_QUIZ_GAME +" WHERE "+COL_3+" = 'number' "+" ORDER BY RANDOM() LIMIT 20";// Select All Query

        myDatabase = this.getReadableDatabase();
        Cursor cursor = myDatabase.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question question = new Question();
                //question.setID(cursor.getInt(0));

                String questText = cursor.getString(cursor.getColumnIndex(COL_2));
                question.setQUESTION(questText);

                //new
                String quizSound = cursor.getString(cursor.getColumnIndex(COL_4));
                question.setQuiz_sound(quizSound);
                //new

                String answerText = cursor.getString(cursor.getColumnIndex(COL_5));
                question.setANSWER(answerText);

                String choice1Text = cursor.getString(cursor.getColumnIndex(COL_6));
                question.setChoice(0, choice1Text);

                String choice2Text = cursor.getString(cursor.getColumnIndex(COL_7));
                question.setChoice(1, choice2Text);

                String choice3Text = cursor.getString(cursor.getColumnIndex(COL_8));
                question.setChoice(2, choice3Text);

                String choice4Text = cursor.getString(cursor.getColumnIndex(COL_9));
                question.setChoice(3, choice4Text);

                quesList.add(question);

            } while (cursor.moveToNext());
            Collections.shuffle(quesList);
        }

        myDatabase.close();
        return quesList;
    }

    public List<Question> getAllQuestions05() {
        List<Question> quesList = new ArrayList<>();
        String selectQuery = "SELECT * FROM "+ TABLE_QUIZ_GAME +" WHERE "+COL_3+" = 'day' "+" ORDER BY RANDOM() LIMIT 10";// Select All Query

        myDatabase = this.getReadableDatabase();
        Cursor cursor = myDatabase.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question question = new Question();
                //question.setID(cursor.getInt(0));

                String questText = cursor.getString(cursor.getColumnIndex(COL_2));
                question.setQUESTION(questText);

                //new
                String quizSound = cursor.getString(cursor.getColumnIndex(COL_4));
                question.setQuiz_sound(quizSound);
                //new

                String answerText = cursor.getString(cursor.getColumnIndex(COL_5));
                question.setANSWER(answerText);

                String choice1Text = cursor.getString(cursor.getColumnIndex(COL_6));
                question.setChoice(0, choice1Text);

                String choice2Text = cursor.getString(cursor.getColumnIndex(COL_7));
                question.setChoice(1, choice2Text);

                String choice3Text = cursor.getString(cursor.getColumnIndex(COL_8));
                question.setChoice(2, choice3Text);

                String choice4Text = cursor.getString(cursor.getColumnIndex(COL_9));
                question.setChoice(3, choice4Text);

                quesList.add(question);

            } while (cursor.moveToNext());
            Collections.shuffle(quesList);
        }

        myDatabase.close();
        return quesList;
    }

    public List<Question> getAllQuestions06() {
        List<Question> quesList = new ArrayList<>();
        String selectQuery = "SELECT * FROM "+ TABLE_QUIZ_GAME +" WHERE "+COL_3+" = 'month' "+" ORDER BY RANDOM() LIMIT 12";// Select All Query

        myDatabase = this.getReadableDatabase();
        Cursor cursor = myDatabase.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question question = new Question();
                //question.setID(cursor.getInt(0));

                String questText = cursor.getString(cursor.getColumnIndex(COL_2));
                question.setQUESTION(questText);

                //new
                String quizSound = cursor.getString(cursor.getColumnIndex(COL_4));
                question.setQuiz_sound(quizSound);
                //new

                String answerText = cursor.getString(cursor.getColumnIndex(COL_5));
                question.setANSWER(answerText);

                String choice1Text = cursor.getString(cursor.getColumnIndex(COL_6));
                question.setChoice(0, choice1Text);

                String choice2Text = cursor.getString(cursor.getColumnIndex(COL_7));
                question.setChoice(1, choice2Text);

                String choice3Text = cursor.getString(cursor.getColumnIndex(COL_8));
                question.setChoice(2, choice3Text);

                String choice4Text = cursor.getString(cursor.getColumnIndex(COL_9));
                question.setChoice(3, choice4Text);

                quesList.add(question);

            } while (cursor.moveToNext());
            Collections.shuffle(quesList);
        }

        myDatabase.close();
        return quesList;
    }

    public List<Question> getAllQuestions07() {
        List<Question> quesList = new ArrayList<>();
        String selectQuery = "SELECT * FROM "+ TABLE_QUIZ_GAME +" WHERE "+COL_3+" = 'color' "+" ORDER BY RANDOM() LIMIT 15";// Select All Query

        myDatabase = this.getReadableDatabase();
        Cursor cursor = myDatabase.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question question = new Question();
                //question.setID(cursor.getInt(0));

                String questText = cursor.getString(cursor.getColumnIndex(COL_2));
                question.setQUESTION(questText);

                //new
                String quizSound = cursor.getString(cursor.getColumnIndex(COL_4));
                question.setQuiz_sound(quizSound);
                //new

                String answerText = cursor.getString(cursor.getColumnIndex(COL_5));
                question.setANSWER(answerText);

                String choice1Text = cursor.getString(cursor.getColumnIndex(COL_6));
                question.setChoice(0, choice1Text);

                String choice2Text = cursor.getString(cursor.getColumnIndex(COL_7));
                question.setChoice(1, choice2Text);

                String choice3Text = cursor.getString(cursor.getColumnIndex(COL_8));
                question.setChoice(2, choice3Text);

                String choice4Text = cursor.getString(cursor.getColumnIndex(COL_9));
                question.setChoice(3, choice4Text);

                quesList.add(question);

            } while (cursor.moveToNext());
            Collections.shuffle(quesList);
        }

        myDatabase.close();
        return quesList;
    }

    public List<Question> getAllQuestions08() {
        List<Question> quesList = new ArrayList<>();
        String selectQuery = "SELECT * FROM "+ TABLE_QUIZ_GAME +" WHERE "+COL_3+" = 'shape' "+" ORDER BY RANDOM() LIMIT 20";// Select All Query

        myDatabase = this.getReadableDatabase();
        Cursor cursor = myDatabase.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question question = new Question();
                //question.setID(cursor.getInt(0));

                String questText = cursor.getString(cursor.getColumnIndex(COL_2));
                question.setQUESTION(questText);

                //new
                String quizSound = cursor.getString(cursor.getColumnIndex(COL_4));
                question.setQuiz_sound(quizSound);
                //new

                String answerText = cursor.getString(cursor.getColumnIndex(COL_5));
                question.setANSWER(answerText);

                String choice1Text = cursor.getString(cursor.getColumnIndex(COL_6));
                question.setChoice(0, choice1Text);

                String choice2Text = cursor.getString(cursor.getColumnIndex(COL_7));
                question.setChoice(1, choice2Text);

                String choice3Text = cursor.getString(cursor.getColumnIndex(COL_8));
                question.setChoice(2, choice3Text);

                String choice4Text = cursor.getString(cursor.getColumnIndex(COL_9));
                question.setChoice(3, choice4Text);

                quesList.add(question);

            } while (cursor.moveToNext());
            Collections.shuffle(quesList);
        }

        myDatabase.close();
        return quesList;
    }

}
    //  Example  Quiz_02


