package com.finestweber.crud;

import com.finestweber.crud.QLite.Conexao;
import com.finestweber.crud.dao.UsuarioDao;
import com.finestweber.crud.entity.Usuario;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	public void salvar(View view){
		EditText txtnome = (EditText)findViewById(R.id.txtnome);
		EditText txtlogin = (EditText)findViewById(R.id.txtlogin);
		EditText txtsenha = (EditText)findViewById(R.id.txtsenha);
		//encapsula dentro do Usuario
		Usuario usuario = new Usuario();
		usuario.setNome(txtnome.getText().toString());
		usuario.setLogin(txtlogin.getText().toString());
		usuario.setSenha(txtsenha.getText().toString());
		
		UsuarioDao usuarioDao =new UsuarioDao();
		usuarioDao.salvar(usuario);
		
		//Toast.makeText(this, "Estrutura dao correta", Toast.LENGTH_LONG).show();
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		int version = 1;
		new Conexao(getApplicationContext(), "crud.db", null, version );
	}

}
