package com.example.learninglibrary;

import android.content.Context;
import android.widget.Toast;

public class LibraryMessage {
    public  static void lib(Context c, String message){
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }
}
