package com.example.app;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class Acciones implements OnClickListener {

	@Override
	public void onClick(View v) {// esta clase es para procesar los eventos.
		// TODO cojemos el texto y lo ponemos en otra caja.

		String str = new String();

		EditText boxorigen;
		EditText boxsalida;

		boxorigen = MainActivity.getEt();

		// con getEditex conseguimos la caja de texto, con getText recogemos el
		// contenido de la caja(los caracteres), con toSring recogemos todos los
		// caracteres (chars).
		str = MainActivity.getEt().getText().toString();
		StringBuilder sb = new StringBuilder(str);// StringBuilder es una clase
													// que construye la palabra.
													// reconstruye cadenas.
		String reverse = sb.reverse().toString();// en reverse por medio de
													// stringbuilder damos la
													// vuelta a la palabra y la
													// unimos con tostring.
		MainActivity.getTv().setText(reverse);// entramos en MainActivity para
												// obtener el textview e
												// introducirle el texto
												// alreves.

	}

}
