package com.finestweber.crud.QLite;

import android.provider.BaseColumns;

public class Contact {
	private Contact(){}
	public static class Register implements BaseColumns{
		public static String TABLE_NAME = "usuario";
		public static String COLUMN_NAME_NOME = "nome";
		public static String COLUMN_NAME_LOGIN = "login";
		public static String COLUMN_NAME_SENHA = "senha";
		
	}
}
