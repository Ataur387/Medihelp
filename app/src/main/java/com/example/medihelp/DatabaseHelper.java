package com.example.medihelp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "user.db";
    public static final String TABLE_NAME = "user_table";
    public static final String EMAIL = "EMAIL";
    public static final String PASSWORD = "PASSWORD";
    public static final String ID = "ID";
    private Object Context;
    // private static final String CREATE_TABLE = "CREATE TABLE "+ TABLE_NAME + "("+ID+"INTEGER PRIMARY KEY AUTOINCREMENT ," +EMAIL+" TEXT ,"+PASSWORD+" TEXT );";


    public DatabaseHelper(@Nullable android.content.Context context) {
        super(context, DATABASE_NAME, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ TABLE_NAME + "("+ID+" INTEGER PRIMARY KEY AUTOINCREMENT ,"
                +EMAIL+" TEXT ,"+PASSWORD+" TEXT );");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
    public boolean insertData(String EMAIL,String PASSWORD) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(this.EMAIL,EMAIL);
        contentValues.put(this.PASSWORD,PASSWORD);
        long result = db.insert(TABLE_NAME,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }
    public boolean findpassword(String un,String pas)
    {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + TABLE_NAME,null);
        boolean result = false;
        if(cursor.getCount() == 0)
        {
            // Toast.makeText(,"No Data is found",Toast.LENGTH_LONG).show();
        }
        else
        {
            while(cursor.moveToNext())
            {
                String u = cursor.getString(1);
                String p = cursor.getString(2);
                if(un.equals(u) && pas.equals(p))
                {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
