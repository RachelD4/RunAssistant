package com.example.damilola.runassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button Login = (Button) findViewById(R.id.bLogin);
        final Button SignUp = (Button) findViewById(R.id.bSignUp);

        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent LoginIntent = new Intent(MainActivity.this, LoginActivity.class);
                MainActivity.this.startActivity(LoginIntent);
    }
}

    }
}
