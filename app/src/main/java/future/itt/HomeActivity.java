package future.itt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {

    Button btnCursos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnCursos = (Button) findViewById(R.id.btncursos);

        btnCursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent dap = new Intent(HomeActivity.this,CursosActivity.class);
                    startActivity(dap);
                    finish();
                }
        });



    }
}