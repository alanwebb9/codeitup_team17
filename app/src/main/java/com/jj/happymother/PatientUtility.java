package com.jj.happymother;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by Prashant on 19/02/2020.
 */
public class PatientUtility {

    public static final String DB_NAME = "patient.db";
    public static final String TABLE_NAME = "PatientDetails";
    public static final int DB_VERSION = 1;
    private PaitientDatabaseUtility databaseUtility;
    private SQLiteDatabase sqLiteDatabase;
    private Context mContext;
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_AGE = "age";
    public static final String COLUMN_CONTACT = "contact";
    public static final String COLUMN_WOP = "wop";
    public static final String COLUMN_NOP = "nop";
    public static final String COLUMN_INCOME = "income";
    public static final String COLUMN_OCCUPATION = "occupation";



   // DemographyModel demographyModel;
    public void newfunc(){
        System.out.println("abc");
    }

    private static final String TABLE_CREATE_QUERY =
            "create table " + TABLE_NAME + "(" + COLUMN_ID + " integer primary key autoincrement," + COLUMN_NAME + " text," + COLUMN_AGE + " text,"+COLUMN_CONTACT+"text,"+COLUMN_WOP+"text,"+COLUMN_NOP+"text,"+COLUMN_INCOME+"text,"+COLUMN_OCCUPATION+"text,);";

    public PatientUtility(Context context) {
        mContext = context;
        databaseUtility = new PaitientDatabaseUtility(context);
    }

    public void addPatientDemography(DemographyModel demographyModel) {
        ContentValues values = new ContentValues();

        values.put(COLUMN_NAME, demographyModel.name);
        values.put(COLUMN_AGE, demographyModel.age);
        values.put(COLUMN_NAME, demographyModel.contact);
        values.put(COLUMN_AGE, demographyModel.wop);
        values.put(COLUMN_NAME, demographyModel.nop);
        values.put(COLUMN_AGE, demographyModel.income);
        values.put(COLUMN_AGE, demographyModel.occupation);

        long id = sqLiteDatabase.
                insert(TABLE_NAME, null, values);
        if (-1 != id) {
            Toast.makeText(mContext
                    , "Insert Success " + id, Toast.LENGTH_SHORT).
                    show();
        }
    }

    public void open() {
        sqLiteDatabase = databaseUtility
                .getWritableDatabase();
    }

    public void close() {
        sqLiteDatabase.close();
    }

    public void getPatientDemography() {

    }
   // public void setPatientDemography() {

   // }

    public void getPatientHistory() {

    }
    public void getPatientEssential() {

    }

    private class PaitientDatabaseUtility extends SQLiteOpenHelper {

        public PaitientDatabaseUtility(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

            db.execSQL(TABLE_CREATE_QUERY);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }
}
