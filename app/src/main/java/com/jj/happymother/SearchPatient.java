package com.jj.happymother;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SearchPatient extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_patient);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }




        });

        final Button searchButon = findViewById(R.id.search_patient_btn);
        final EditText inputId = findViewById(R.id.input_patient_id);


        final String inputIdValue = inputId.getText().toString();

        searchButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                boolean resultFound = SearchPatient.searchCandidate(inputIdValue,res);
                if(resultFound){
                    // Launch New ACtivity
                    Intent patientIntent = new Intent(getApplicationContext(),PatientDetails.class);
                    startActivity(patientIntent);
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search_patient, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    // Search Candidate if present in the list
    public static boolean searchCandidate(String patientId,Resources resources) {
        // Delete White Spaces
        patientId.trim();
        Resources res = resources;
//        String[] clientPool = res.getStringArray(R.array.patient);
//        // Convert array to array list
//       // ArrayList client = (ArrayList) Arrays.asList(clientPool);
//
//
//        // Try if the list is empytp or not.
//        if(!client.isEmpty() && client!=null) {
//
//
//            return client.contains(patientId.toString());
//
//        }else return false;
//
        return true;

    }





}
