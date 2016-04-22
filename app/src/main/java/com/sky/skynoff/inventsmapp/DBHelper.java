package com.sky.skynoff.inventsmapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by personal on 22/04/2016.
 */
public class DBHelper extends SQLiteOpenHelper {
    private static final String name="Company_Inventary";
    private static final int version=1;
    public DBHelper(Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //db.execSQL(Manejador.crear_tabla);
        //db.execSQL(Manejador.crear_tabla2);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
