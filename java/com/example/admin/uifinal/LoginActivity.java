package com.example.admin.uifinal;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = (Button) findViewById(R.id.btn_LoginPage);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), HomeActivity.class );
                startActivity(intent);
            }
        });

//        TextInputLayout usernameWrapper = (TextInputLayout) findViewById(R.id.text_input_layout);
//        usernameWrapper.setHint("Email Address");
//        usernameWrapper = (TextInputLayout) findViewById(R.id.text_input_layout2);
//        usernameWrapper.setHint("Password");
    }
}
