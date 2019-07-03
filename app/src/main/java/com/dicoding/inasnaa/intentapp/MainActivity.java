package com.dicoding.inasnaa.intentapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);
        Button btnMoveWithData = findViewById(R.id.btnmove_withdata);
        btnMoveWithData.setOnClickListener(this);
        Button btnDialPhone = findViewById(R.id.btn_dialnumber);
        btnDialPhone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
            break;
            case R.id.btnmove_withdata:
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "inasnaa");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 22);
                startActivity(moveWithDataIntent);
            break;
            case R.id.btn_dialnumber:
                String phoneNumber = "08561478697";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel" +phoneNumber));
                startActivity(dialPhoneIntent);
            break;
        }
    }
}
