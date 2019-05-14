package com.example.billirdproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView[] imgT = new ImageView[6];

    final int imgid[] = { R.id.bil1,R.id.bil2,R.id.bil3,R.id.bil4,R.id.bil5,R.id.bil6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_main);


    }//onCreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);


        MenuInflater mif = getMenuInflater();

        mif.inflate(R.menu.menu, menu);



        return true;
    }





    public  void onClick(View v){
        switch (v.getId()){
            case R.id.bil1 :
                imgT[0].setImageResource(R.drawable.tablecli);
                break;
            case R.id.bil2 :
                imgT[1].setImageResource(R.drawable.tablecli);
                break;
            case R.id.bil3 :
                imgT[2].setImageResource(R.drawable.tablecli);
                break;
            case R.id.bil4 :
                imgT[3].setImageResource(R.drawable.tablecli);
                break;
            case R.id.bil5 :
                imgT[4].setImageResource(R.drawable.tablecli);
                break;
            case R.id.bil6 :
                imgT[5].setImageResource(R.drawable.tablecli);
                break;
        }

    }



}//Main
