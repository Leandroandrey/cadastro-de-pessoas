package com.example.atividadeintegradora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.atividadeintegradora.model.Contato;
import com.example.atividadeintegradora.model.ContatoDao;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        Button btGravar = (Button) findViewById(R.id.btGravar);
        Button btExcluir = (Button) findViewById(R.id.btExcluir);
        Button btAlterar = (Button) findViewById(R.id.btAlterar);
        EditText edNome = (EditText) findViewById(R.id.edNome);
        EditText edNomes = (EditText) findViewById(R.id.edNomes);
        EditText edGenero = (EditText) findViewById(R.id.edGenero);
        EditText edPai = (EditText) findViewById(R.id.edPai);
        EditText edMae = (EditText) findViewById(R.id.edMae);
        EditText edRenda = (EditText) findViewById(R.id.edRenda);
        EditText edId = (EditText) findViewById(R.id.edId);

        btExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContatoDao dao = new ContatoDao(getBaseContext());

                if (dao.delete(Integer.parseInt(edId.getText().toString()))) {
                    Toast.makeText(getBaseContext(), "Exclusão com sucesso", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(getBaseContext(), "Falha na exclusão", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Contato contato = new Contato(Integer.parseInt(edId.getText().toString()), edNome.getText().toString(), edNomes.getText().toString(), edGenero.getText().toString(), edPai.getText().toString(), edMae.getText().toString(), Double.parseDouble(edRenda.getText().toString()));
                ContatoDao dao = new ContatoDao(getBaseContext());

                if (dao.update(contato)) {
                    Toast.makeText(getBaseContext(), "Alterado com sucesso", Toast.LENGTH_SHORT).show();
                    finish();
                } else
                    Toast.makeText(getBaseContext(), "Falha na alteração", Toast.LENGTH_SHORT).show();
            }
        });
        btGravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Contato contato = new Contato(edNome.getText().toString(), edNomes.getText().toString(), edGenero.getText().toString(), edPai.getText().toString(), edMae.getText().toString(), Double.parseDouble(edRenda.getText().toString()));
                ContatoDao dao = new ContatoDao(getBaseContext());

                if (dao.save(contato)) {
                    Toast.makeText(getBaseContext(), "Gravado com sucesso", Toast.LENGTH_SHORT).show();
                    finish();
                }else
                    Toast.makeText(getBaseContext(), "Falha na gravação", Toast.LENGTH_SHORT).show();
            }
        });
    }
            }

