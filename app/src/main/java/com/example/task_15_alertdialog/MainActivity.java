package com.example.task_15_alertdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("ボタンを押しましたね？")
                        .setTitle("ドロイド君より")
                        .setIcon(R.drawable.dialog_icon)
                        .setPositiveButton("戻る", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // ボタンをクリックしたときの動作
                            }
                        });
                builder.show();

            }
        });
    }
}
