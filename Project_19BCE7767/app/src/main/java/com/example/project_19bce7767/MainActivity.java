package com.example.project_19bce7767;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user,pass;
    Button b;
    String[] username = {"19BCE7767","Vishesh","Mittal","admin"};
    String[] password = {"7767","vish","mittal","admin"};
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.name);
        pass = findViewById(R.id.pass);
        b = findViewById(R.id.button);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0;i< username.length; i++) {
                    if (user.getText().toString().equals(username[i]) && pass.getText().toString().equals(password[i])) {
                        Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), ListActivity.class);
                        startActivity(intent);
                        //flag = 1;
                        break;
                    }
                }
                /*
                if (flag == 1){
                    Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                } else{
                    Toast.makeText(getApplicationContext(), "Incorrect Details", Toast.LENGTH_SHORT).show();
                }
                 */
            }
        });
    }
}