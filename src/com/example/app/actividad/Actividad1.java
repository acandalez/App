package com.example.app.actividad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app.R;

public class Actividad1 extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		String nombre = getIntent().getExtras().getString("nombre");
		// Muestra el nombre una vez registrado.
		String fecha = getIntent().getExtras().getString("fecha");
		String password = getIntent().getExtras().getString("password");

		Toast.makeText(
				getApplicationContext(),
				"Te haz registrado correctamente con: " + nombre + fecha
						+ password, 20).show();
		// muestra lo que le pases por pantalla durante 20 segundos

		TextView tv = (TextView) findViewById(R.id.parametros);
		tv.setText(nombre + "" + fecha + "" + password);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		int id = item.getItemId();

		if (id == R.id.action_settings) {

			finish();
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

}
