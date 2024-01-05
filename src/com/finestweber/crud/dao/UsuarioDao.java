package com.finestweber.crud.dao;

import java.util.List;

import com.finestweber.crud.QLite.Conexao;
import com.finestweber.crud.QLite.Contact;
import com.finestweber.crud.entity.Usuario;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class UsuarioDao {
	
	public void salvar(Usuario usuario) {
		ContentValues values = new ContentValues();
		values.put(Contact.Register.COLUMN_NAME_NOME, usuario.getNome());
		values.put(Contact.Register.COLUMN_NAME_LOGIN, usuario.getLogin());
		values.put(Contact.Register.COLUMN_NAME_SENHA, usuario.getSenha());
		SQLiteDatabase conexao = Conexao.getInstance();
		long resultadoInsercao = conexao.insert(Contact.Register.TABLE_NAME, null, values);
		
	}

	public void alterar(Usuario usuario) {
	}

	public List<Usuario> listar() {
		return null;
	}

	public void excluir(Integer id) {
	}
}
