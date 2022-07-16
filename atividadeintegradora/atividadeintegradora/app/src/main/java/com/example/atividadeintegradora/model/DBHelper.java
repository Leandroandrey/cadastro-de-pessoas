package com.example.atividadeintegradora.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="DBCadastro.db";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_TABLE_CADASTRO= "CREATE TABLE CADASTRO(ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
            " NOME TEXT NOT NULL, NOMESOCIAL TEXT NOT NULL, GENERO TEXT NOT NULL, PAI TEXT NOT NULL, MAE TEXT NOT NULL, RENDA TEXT NOT NULL)";

    public  DBHelper (@Nullable Context ctx) {

        super(ctx, DATABASE_NAME, null , DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_CADASTRO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }
}
