package com.example.billirdproject;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class DBHelperAdmin extends SQLiteOpenHelper {

    //Bean Class 가지고오기
    BeanAdmin bean;

    //생성자생성

    public DBHelperAdmin(Context context) {
        super(context, "adminDB", null, 1
        );
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE admintbl(AD_Id NVARCHAR2(50) NOT NULL, " +
                "                            AD_Pass NUMBER NOT NULL, " +
                "                            AD_Name NVARCHAR2(50) NOT NULL," +
                "                            AD_Phone NUMBER NOT NULL);");
    }

     @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS admintbl");
        onCreate(db);
    }

    //


}

