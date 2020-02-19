package com.jj.happymother;

import android.provider.BaseColumns;

public class DatabaseHelper implements BaseColumns{

    //Data Fields used to Represent Patient Demographics
    private static String tableName = "Happy Mother";
    private  static String patientName;
    private  static int age=1;
    private  static String contactNumber ;
    private  static int WeekOfPregnancy;
    private  static double YearlyIncome;

// Table and Column names
        public static final String TABLE_NAME = tableName;
        public static final String COLUMN_NAME_TITLE = patientName;
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";
        public static final int WEEK_OF_PREGNANCY =WeekOfPregnancy;
        public static final String COLUMN_NAME_contacNumber = "subtitle";
        public static final Double COLUMN_NAME_yearlyIncome = YearlyIncome;


//Function to create table
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + DatabaseHelper.TABLE_NAME + " (" +
                    DatabaseHelper._ID + " INTEGER PRIMARY KEY," +
                    DatabaseHelper.COLUMN_NAME_TITLE + " TEXT," +
                    DatabaseHelper.COLUMN_NAME_SUBTITLE + " TEXT)";

// Deletes the table with given entry
    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + DatabaseHelper.TABLE_NAME;





}
