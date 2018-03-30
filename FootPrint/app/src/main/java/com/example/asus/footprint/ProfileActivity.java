package com.example.asus.footprint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_layout);

    }

    public void imgButtonClick_process(View view) {
        Intent intent = new Intent(ProfileActivity.this, ProcessActivity.class);
        startActivity(intent);
    }

    public void imgButtonClick_activity(View view) {
        Intent intent = new Intent(ProfileActivity.this, ActivityActivity.class);
        startActivity(intent);
    }

    public void imgButtonClick_plan(View view) {
        Intent intent = new Intent(ProfileActivity.this, PlanActivity.class);
        startActivity(intent);
    }

    public void imgButtonClick_profile(View view) {

    }
}
