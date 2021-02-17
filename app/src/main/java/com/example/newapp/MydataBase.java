package com.example.newapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;

public class MydataBase extends SQLiteAssetHelper
{
    public static final  String DB_NAME="cars.db";
    public static final int DB_VERSION=1;
    public static final String car_tb_NAME="Car";
    public static final String car_cln_id="id";
    public static final String car_cln_model="model";
    public static final String car_cln_color="color";
    public static final String car_cln_distance="distance";

    public  MydataBase(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    };

//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        db.execSQL("CREATE TABLE "+car_tb_NAME+" ("+car_cln_id+" INTEGER primary key autoincrement,"+car_cln_model+" TEXT ,"+car_cln_color+" TEXT,"+car_cln_distance+" REAL )");
//
//
//
//
//
//    }

//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//
//    }
//    // داله الاضافه
    public  boolean insertCar(Car car)
    {
        SQLiteDatabase DP=getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(car_cln_model,car.getModel());
        values.put(car_cln_color,car.getColor());
        values.put(car_cln_distance,car.getDistane());

        long result = DP.insert(car_tb_NAME, null, values);
        if(result==-1)
            return false;
        else
            return  true;

    }
    //داله التعديل
    public  boolean updateCar(Car car)
    {
        SQLiteDatabase DP=getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(car_cln_model,car.getModel());
        values.put(car_cln_color,car.getColor());
        values.put(car_cln_distance,car.getDistane());
        String arg []=new String[] {String.valueOf(car.getId())};

        int result = DP.update(car_tb_NAME,values,"id=?",arg);
        return  result>0;

    }
    //داله معرفه عدد عناصر الجدول
    public  long getcarCount()
    {
        SQLiteDatabase DP =getReadableDatabase();
       return  DatabaseUtils.queryNumEntries(DP,car_tb_NAME);
    }
    //داله مسح
    public  boolean deletCar(Car car)
    {
        SQLiteDatabase DP = getWritableDatabase();

        String args[] = new String[]{String.valueOf(car.getId())};

        int result = DP.delete(car_tb_NAME, "id=?", args);
        return result > 0;
    }
    //استرجاع بيانات من الجدول
    public ArrayList<Car> getAllCars()
    {
        ArrayList<Car> cars =new ArrayList<>();
        SQLiteDatabase dp= getReadableDatabase();
        Cursor cursor = dp.rawQuery("SELECT * FROM " + car_tb_NAME, null);
        if (cursor.moveToFirst())
        {
            do {
                String id=cursor.getString( cursor.getColumnIndex(car_cln_id));
                String model=cursor.getString(cursor.getColumnIndex(car_cln_model));
                String color=cursor.getString(cursor.getColumnIndex(car_cln_color));
                double dpl=cursor.getDouble(cursor.getColumnIndex(car_cln_distance));
                Car c=new Car(id,model,color,dpl);
                cars.add(c);
               }
            while (cursor.moveToNext());
            cursor.close();

        }
        return  cars;

    }
    //بحث  بيانات من الجدول
    public ArrayList<Car> getCars(String modelSearch)
    {
        ArrayList<Car> cars =new ArrayList<>();
        SQLiteDatabase dp= getReadableDatabase();
        Cursor cursor = dp.rawQuery("SELECT * FROM  " + car_tb_NAME+" WHERE "+ car_cln_model+ " =? ", new String[]{modelSearch});
        if (cursor.moveToFirst())
        {
            do {
                String id=cursor.getString( cursor.getColumnIndex(car_cln_id));
                String model=cursor.getString(cursor.getColumnIndex(car_cln_model));
                String color=cursor.getString(cursor.getColumnIndex(car_cln_color));
                double dpl=cursor.getDouble(cursor.getColumnIndex(car_cln_distance));
                Car c=new Car(id,model,color,dpl);
                cars.add(c);
            }
            while (cursor.moveToNext());
            cursor.close();

        }
        return  cars;

    }

}
