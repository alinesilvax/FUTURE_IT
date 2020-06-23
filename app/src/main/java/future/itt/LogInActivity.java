package future.itt;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import future.itt.connection.ConnectionClass;

public class LogInActivity extends AppCompatActivity {

    EditText EmailLogin, PasswordLogin;
    Button btnLogin;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        EmailLogin = (EditText) findViewById(R.id.etEmail);
        PasswordLogin = (EditText) findViewById(R.id.etPass);
        btnLogin = (Button) findViewById(R.id.btLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String password = PasswordLogin.getText().toString();
                String passwordd = "future18";

                if (password == passwordd) {
                    Toast.makeText(LogInActivity.this, "Senha Inválida " + password + " senha " + passwordd, Toast.LENGTH_LONG).show();
                    PasswordLogin.setText("");
                } else {
                    Intent dap = new Intent(LogInActivity.this,HomeActivity.class);
                    startActivity(dap);
                    finish();
                }

            }
        });

    }
}