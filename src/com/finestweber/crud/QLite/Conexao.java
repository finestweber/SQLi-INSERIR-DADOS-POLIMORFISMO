package com.finestweber.crud.QLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexao extends SQLiteOpenHelper {
	private String name = "crud.db";
	private static SQLiteDatabase instance;
	public static SQLiteDatabase getInstance(){
		return instance;		
	}

	public Conexao(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
		instance = getReadableDatabase();
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String CREATE_DATABASE_ENTRIE = 
				"CREATE TABLE " 
				+ Contact.Register.TABLE_NAME + " ("
				+ Contact.Register._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ Contact.Register.COLUMN_NAME_NOME + " TEXT, "
				+ Contact.Register.COLUMN_NAME_LOGIN + " TEXT,"
				+ Contact.Register.COLUMN_NAME_SENHA + " TEXT)";
		// TODO Auto-generated method stub
		db.execSQL(CREATE_DATABASE_ENTRIE );
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
