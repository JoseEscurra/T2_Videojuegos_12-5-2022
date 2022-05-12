package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.adapters.StringAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("andrea", "OnCreate");
        setContentView(R.layout.activity_main);

        List<String> contacts = getContacts();
        StringAdapter adapter = new StringAdapter(contacts);

        RecyclerView rv = findViewById(R.id.listCont);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
    }

    private List<String> getContacts(){
        List<String> contacts = new ArrayList<>();
        contacts.add("Jose Miguel");
        contacts.add("Lionel Messi");
        contacts.add("Cristiano Ronaldo");
        contacts.add("Andrea Atoche");
        contacts.add("Peter Parker");
        contacts.add("Bruce Banner");
        contacts.add("Clark Kent");
        contacts.add("Diana Prince");
        contacts.add("Paolo Guerrero");
        contacts.add("Kun Aguero");
        return contacts;
    }


}