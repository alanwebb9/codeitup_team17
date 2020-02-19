package com.jj.happymother;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientDetails extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paitient_details);

        Button buttonOne = (Button) findViewById(R.id.button);
        Button buttonTwo = (Button) findViewById(R.id.button2);
        Button buttonThree = (Button) findViewById(R.id.button3);
        //  Button buttonTwo = (Button) findViewById(R.id.button);
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        //deleteButton.setOnClickListener(this);

        /*public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button:
                    //insertRecords();
                    break;
                case R.id.button2:
                   // readRecords();
                    break;
                case R.id.button3:
                  //  updateRecords();
                    break;

            }
        }*/

       /* buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

              //  Intent activity2Intent = new Intent(getApplicationContext(), Demographic.class);
                startActivity(activity2Intent);
            }
        });

        Button buttonTwo = (Button) findViewById(R.id.button);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

             //   Intent activity2Intent = new Intent(getApplicationContext(), Activity2.class);
                startActivity(activity2Intent);
            }
        });*/


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                button();
                break;
            case R.id.button2:
                button2();
                break;
            case R.id.button3:
                button3();
                break;
        }
    }

    public void button()
    {
        Intent activity2Intent = new Intent(getApplicationContext(), PatientDemography.class);
        startActivity(activity2Intent);
    }
    public void button2()
    {

    }
    public void button3()
    {

    }

}
