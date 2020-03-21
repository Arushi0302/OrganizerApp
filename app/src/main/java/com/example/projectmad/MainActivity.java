package com.example.projectmad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e1,e2,e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button)findViewById(R.id.button);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText3);
        e3=(EditText)findViewById(R.id.editText2);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=e1.getText().toString();
                if(username.matches(""))
                {
                    Toast.makeText(MainActivity.this,"no username",Toast.LENGTH_SHORT).show();
                }
                else
                    {
                        Toast.makeText(MainActivity.this,"Welcome: "+username,Toast.LENGTH_LONG).show();
                        Intent i = new Intent(MainActivity.this, Main3Activity.class);
                        i.putExtra("value1", e1.getText().toString());
                        i.putExtra("value2", e3.getText().toString());

                        startActivity(i);
                }
            }
        });
    }

}
