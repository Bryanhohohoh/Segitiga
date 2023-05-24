package com.example.segitiga;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View; import android.widget.Button; import android.widget.EditText; import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ealas, etinggi; Button bthitung; TextView tvhasil;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);

        ealas=(EditText)findViewById(R.id.editTextAls);
        etinggi=(EditText)findViewById(R.id.editTextTgg);
        tvhasil=(TextView) findViewById(R.id.textViewHasil);
        bthitung=(Button) findViewById(R.id.btnHitung);

        bthitung.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) { double bilangan1,bilangan2, hasil;
            bilangan1=Double.valueOf(ealas.getText().toString().trim()); bilangan2=Double.valueOf(etinggi.getText().toString().trim());

            hasil = (bilangan1 / 2) * bilangan2; String hasil1 = String.valueOf(hasil);

            tvhasil.setText(hasil1);

        }
        });

    }
}
