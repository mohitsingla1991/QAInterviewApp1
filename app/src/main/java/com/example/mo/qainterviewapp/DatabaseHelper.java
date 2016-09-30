package com.example.mo.qainterviewapp;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Mo on 30-09-2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String Database_Name="database_qainterview";
    public static final String Table_Name="table_qabasic";
    public static final String Col_1="Questions";
    public static final String Col_2="Answer";
    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);


    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
