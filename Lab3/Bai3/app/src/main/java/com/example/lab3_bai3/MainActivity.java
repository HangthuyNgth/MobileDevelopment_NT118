package com.example.lab3_bai3;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private DbAdapter dbAdapter;
    private Cursor cursor;
    private List<Contact> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        dbAdapter = new DbAdapter(this);
        dbAdapter.open();
        dbAdapter.deleteAllContact();

        // Inserting Contacts
        dbAdapter.addContact(new Contact("Ravi", "9100000000"));
        dbAdapter.addContact(new Contact("Srinivas", "9199999999"));
        dbAdapter.addContact(new Contact("Tommy", "9522222222"));
        dbAdapter.addContact(new Contact("Karthik", "9533333333"));

        list = dbAdapter.getAllContacts();

        ListView lv = (ListView) findViewById(R.id.ListContact);
        ArrayAdapter<Contact> Adapter = new ArrayAdapter<Contact>(MainActivity.this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(Adapter);

        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Contact item = list.get(position);
                list.remove(item);
                dbAdapter.deleteContact(item);
                Adapter.notifyDataSetChanged();
                return false;
            }
        });
    }


}