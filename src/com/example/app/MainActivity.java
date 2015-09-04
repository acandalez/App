package com.example.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.app.actividad.Actividad1;

public class MainActivity extends ActionBarActivity {

	private static EditText et;
	private static TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// onCreate sirve para dibujar, poner un listener e inicializar los
		// atributos de la clase.
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button boton1 = (Button) findViewById(R.id.registro);

		boton1.setOnClickListener(new Acciones());
		// asocia a las id nuestros metodos.
		et = (EditText) findViewById(R.id.nombre);
		tv = (TextView) findViewById(R.id.textView1);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {

			switch (id)// recoge todos los parametros de la app y les
			// pone un nombre
			{// casos:
				// 1. ir a una web.
			case R.id.action_go:
				Intent i = new Intent("android.intent.action.VIEW",
						Uri.parse("http://www.grupoalecantor.com"));
				startActivity(i);
				break;

			case R.id.action_actividad1:
				Intent actividad1 = new Intent(this, Actividad1.class);
				startActivity(actividad1);
			case R.id.action_close:
				finish();

				// default:
				// break;
			}

			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	public void mostrar(View v) {

		Intent i = new Intent(this, Actividad1.class);

		i.putExtra("nombre", et.getText().toString());
		startActivity(i);

	}

	public static EditText getEt() {
		return et;
	}

	public void setEt(EditText et) {
		this.et = et;
	}

	public static TextView getTv() {
		return tv;
	}

	public void setTv(TextView tv) {
		this.tv = tv;
	}

}
