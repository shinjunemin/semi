package com.example.billirdproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelperSales extends SQLiteOpenHelper {
    //Bean Class 가지고오기
    BeanSales bean;

    //생성자생성

    public DBHelperSales(Context context) {
        super(context, "playerDB", null, 1
        );
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE admintbl(SA_Num NUMBER NOT NULL," +
                "                            SA_Day DATE NOT NULL, " +
                "                            SA_Time NUMBER NOT NULL," +
                "                            SA_Money NUMBER NOT NULL);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS playertbl");
        onCreate(db);
    }

}
