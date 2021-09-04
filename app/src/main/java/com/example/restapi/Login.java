package com.example.restapi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;
import android.widget.Toast;
import androidx.room.Dao;


import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity implements View.OnClickListener {
    EditText etUsername;
    EditText etPassword;

    List<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        users = new ArrayList<>();
        users.add(new User("mandu", "peach", "1"));
        users.add(new User("jennie","1234","2"));
        users.add(new User("rosie", "posie", "3"));
        users.add(new User("blackpink", "blink", "4"));
        users.add(new User("reveluv", "12345", "5"));
        View btnSubmit = findViewById(R.id.submitBtn);
        btnSubmit.setOnClickListener(this);
    }

    public void onClick(View v) {
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        String userText = etUsername.getText().toString();
        String passText = etPassword.getText().toString();
        if (v.getId() == R.id.submitBtn) {
            if(userText.isEmpty() || passText.isEmpty()){
                Toast.makeText(getApplicationContext(),"Fill all fields!",Toast.LENGTH_LONG);
            }
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }

    private boolean checkUser(String username){
        for(User u:users){
            if(u.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }
}
