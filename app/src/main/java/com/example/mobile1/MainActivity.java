package com.example.mobile1;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.DrawerLayoutUtils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        showCostumeDialog();

        ArrayList<student> arrayStudents = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            student student = new student("abas" + i, "mohseni" + i, "android" + i, "age abas " + i, "ids = " + i);
            arrayStudents.add(student);
            Log.e("TAG", "onCreate: " + student.toString());
        }
        Log.i("TAG", "onCreate: " + arrayStudents.toString());

    }


    private void showCostumeDialog() {
        LayoutInflater layoutInflater = getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.costum_dialog, null);
        AlertDialog.Builder testDialog = new AlertDialog.Builder(this);
        testDialog.setView(view);
        TextView textView = view.findViewById(R.id.txt_test);
        textView.setText("this is android class");
        testDialog.show();
    }
}