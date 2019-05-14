package com.example.billirdproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelperPlayer extends SQLiteOpenHelper {
    //Bean Class 가지고오기
    BeanPlayer bean;

    //생성자생성

    public DBHelperPlayer(Context context) {
        super(context, "playerDB", null, 1
        );
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE admintbl(PL_Id NVARCHAR2(50) NOT NULL, " +
                "                            PL_Pass NUMBER NOT NULL, " +
                "                            PL_Name NVARCHAR2(50) NOT NULL," +
                "                            PL_Win NUMBER," +
                "                            PL_Lose NUMBER);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS playertbl");
        onCreate(db);
    }


}
