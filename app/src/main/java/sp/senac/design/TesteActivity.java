package sp.senac.design;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class TesteActivity extends AppCompatActivity {
FloatingActionButton btnFlout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste);

        Toolbar mBarra = (Toolbar)findViewById(R.id.tldprincipal);
        setSupportActionBar(mBarra);

        btnFlout = (FloatingActionButton)findViewById(R.id.botaoflutuante);

        btnFlout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TesteActivity.this, "Clique no botão", Toast.LENGTH_SHORT).show();
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_principal,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mBusca:
                Toast.makeText(getApplicationContext(), "mBusca",
                        Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}

