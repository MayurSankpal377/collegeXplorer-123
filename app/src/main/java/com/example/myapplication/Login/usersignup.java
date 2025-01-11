package com.example.myapplication.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class usersignup extends AppCompatActivity {
    EditText sname,smobile,semail,spassword;

    Button signup;
    FirebaseAuth firebaseAuth;
    DatabaseReference db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usersignup);

        sname = findViewById(R.id.fullName);
        semail = findViewById(R.id.email);
        smobile = findViewById(R.id.signnumber);
        spassword = findViewById(R.id.password);
        signup=findViewById(R.id.signUpButton);
        firebaseAuth = FirebaseAuth.getInstance();
        db= FirebaseDatabase.getInstance().getReference().child("USER");



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NAME=sname.getText().toString();
                String MOBILE=smobile.getText().toString();
                String EMAIL=semail.getText().toString();
                String PASSWORD = spassword.getText().toString();


                String message="Name:"+NAME+"\nMobille:"+MOBILE+"\nEmail:"+EMAIL+"\nPassword"+PASSWORD;
                userinfo u=new userinfo(NAME,MOBILE,EMAIL,PASSWORD);
                db.child(NAME).setValue(u);
                createuser();

            }
        });
    }
    private void createuser(){
        String user_email=semail.getText().toString();
        String user_passsword=spassword.getText().toString();
        EditText nameEditText=findViewById(R.id.fullName);
        firebaseAuth.createUserWithEmailAndPassword(user_email,user_passsword).addOnCompleteListener(task -> {
            if(task.isSuccessful()){
                String user_name=nameEditText.getText().toString();
                Toast.makeText(usersignup.this,"Account created successfully", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(usersignup.this, userlogin.class);
                i.putExtra("USER_NAME", user_name);


                startActivity(i);
                finish();
            }
            if(task.isCanceled()){
                Toast.makeText(usersignup.this,"Enter Valid value", Toast.LENGTH_LONG).show();
            }
        });
    }
}