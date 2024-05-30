package com.example.myapplication;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class DbAdapter {
    private static final int DATABASE_VERSION = 2;

    // Database Name
    private static final String DATABASE_NAME = "contactsManager";

    // Contacts table name
    private static final String TABLE_CONTACTS = "contacts";

    // Contacts Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_PH_NO = "phone_number";
    private String[] allColumns = {KEY_ID, KEY_NAME, KEY_PH_NO};
    private DatabaseHandler dbHelper;
    private SQLiteDatabase db;
    private final Context context;


    public DbAdapter(Context ctx) {
        this.context = ctx;
    }

    public DbAdapter open() {
        dbHelper = new DatabaseHandler(context, DATABASE_NAME, null,DATABASE_VERSION);
        db = dbHelper.getWritableDatabase();
        return this;
    }

    public void close() {
        dbHelper.close();
    }

    // Adding new contact
    public void addContact(Contact contact) {
        ContentValues value = new ContentValues();
        value.put(KEY_NAME, contact.getName());
        value.put(KEY_PH_NO, contact.getPhoneNumber());

        long insertID = db.insert(TABLE_CONTACTS, null, value);

    }

    // Getting single contact
//    public Contact getContact(int id) {}

    // Getting All Contacts
    public List<Contact> getAllContacts() {
        List<Contact> list = new ArrayList<Contact>();

        Cursor cursor = db.query(TABLE_CONTACTS, allColumns, null, null, null, null, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Contact contact = new Contact(cursor.getInt(0), cursor.getString(1), cursor.getString(2));
            list.add(contact);
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }


    // Updating single contact
//    public int updateContact(Contact contact) {}
//
    // Deleting single contact
    public void deleteContact(Contact contact) {
        long id = contact.getId();
        db.delete(TABLE_CONTACTS, KEY_ID + " = " + id, null);
    }

    public boolean deleteAllContact() {
        return db.delete(TABLE_CONTACTS, null, null) > 0;

    }
}
