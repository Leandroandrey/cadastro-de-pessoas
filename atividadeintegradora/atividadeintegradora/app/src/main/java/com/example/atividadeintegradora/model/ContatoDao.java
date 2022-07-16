package com.example.atividadeintegradora.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

public class ContatoDao {
    private static String Table_cadastro = "CADASTRO";
    private DBGateway dbG;

    public ContatoDao(Context ctx) {
        this.dbG = DBGateway.getInstance(ctx);

    }
    public boolean update(Contato contato){
        ContentValues cv = new ContentValues();

        cv.put( "NOME", contato.getNome());
        cv.put( "NOMESOCIAL", contato.getNomesocial());
        cv.put( "GENERO", contato.getGenero());
        cv.put( "PAI", contato.getPai());
        cv.put( "MAE", contato.getMae());
        cv.put( "RENDA", contato.getRenda());

        return this.dbG.getDatabase().update(Table_cadastro, cv, "id=?", new String[] {contato.getId()+""}) >0;

    }
    public boolean delete(int id) {
        return this.dbG.getDatabase().delete(Table_cadastro, "ID=?", new String[] {id+"" }) > 0;
    }
    public boolean isExist(int id){
        Cursor cursor = dbG.getDatabase().rawQuery("SELECT * FROM AGENDA WHERE ID=" +id, null);

        return cursor.moveToFirst();
    }

    public boolean save(Contato contato){
        ContentValues cv = new ContentValues();

        cv.put( "NOME", contato.getNome());
        cv.put( "NOMESOCIAL", contato.getNomesocial());
        cv.put( "GENERO", contato.getGenero());
        cv.put( "PAI", contato.getPai());
        cv.put( "MAE", contato.getMae());
        cv.put( "RENDA", contato.getRenda());

        return this.dbG.getDatabase().insert(Table_cadastro, null, cv) >0;

    }
}
