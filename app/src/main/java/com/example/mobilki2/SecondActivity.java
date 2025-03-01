package com.example.mobilki2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView nameView, groupView, ageView, markView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        String name, group, mark;
        int age;
        Bundle extras = getIntent().getExtras();
        assert extras != null;
        this.nameView = findViewById(R.id.name_field);
        this.groupView = findViewById(R.id.group_field);
        this.ageView = findViewById(R.id.age_field);
        this.markView = findViewById(R.id.mark_field);
        name = extras.getString("name");
        group = extras.getString("group");
        String _age = extras.getString("age");
        mark = extras.getString("mark");
        assert _age != null && name != null && group != null && mark != null;
        age = Integer.parseInt(_age);

        this.nameView.setText(name);
        this.ageView.setText(String.valueOf(age));
        this.groupView.setText(group);
        this.markView.setText(mark);
    }

    public void toMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}
