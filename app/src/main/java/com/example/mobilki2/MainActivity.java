package com.example.mobilki2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity{
    TextInputEditText name, group, age, mark;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.name = findViewById(R.id.name);
        this.group = findViewById(R.id.group);
        this.age = findViewById(R.id.age);
        this.mark = findViewById(R.id.mark);
        this.button = findViewById(R.id.button);
        this.button.setOnClickListener(view -> toSecond());
        Log.d("Debug", "Start");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Debug", "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Debug", "Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Debug", "Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Debug", "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Debug", "Destroy");
    }

    private void toSecond(){
        if (this.name.getText() == null || this.age.getText() == null
                || this.mark.getText() == null || this.group.getText() == null) return;
        String nameStr = this.name.getText().toString();
        String groupStr = this.group.getText().toString();
        String ageStr = this.age.getText().toString();
        String markStr = this.mark.getText().toString();
        if (nameStr.isEmpty() || groupStr.isEmpty() || ageStr.isEmpty() || markStr.isEmpty()){
            return;
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name", nameStr);
        intent.putExtra("group", groupStr);
        intent.putExtra("age", ageStr);
        intent.putExtra("mark", markStr);
        startActivity(intent);
    }
}