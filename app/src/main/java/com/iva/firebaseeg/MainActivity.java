package com.iva.firebaseeg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText et,et2;
    FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
    DatabaseReference root=firebaseDatabase.getReference();
    DatabaseReference child1=root.child("name");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button2);
        et=findViewById(R.id.editText);
        et2=findViewById(R.id.editText2);
    }
    public void doThis(View v)
    {
        String name=et.getText().toString();
        String pass=et2.getText().toString();
        HashMap<String,String>hm = new HashMap<>();
        hm.put("name",name);
        hm.put("Password",pass);
        child1.setValue(hm);
        child1.child("emails").child("mailValue").setValue("mailid");
        //child1.push().setValue(name);
    }
}
