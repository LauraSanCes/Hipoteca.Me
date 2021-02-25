package com.example.consumirapi.screen_credits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.consumirapi.R;

public class Screen_credits extends AppCompatActivity {

    ImageView hechoPor, names;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_credits);

        hechoPor = findViewById(R.id.imgHecho);
        names = findViewById(R.id.imgNames);

        hechoPor.animate().alpha(1).translationXBy(0).rotationBy(1080).scaleX(1).scaleY(1).setDuration(800).start();

        names.animate().alpha(1).translationXBy(0).rotationBy(1080).scaleX(1).scaleY(1).setDuration(800).start();
    }

    public void onClickHecho(View b)
    {
        hechoPor.animate().alpha(1).translationXBy(0).rotationBy(1080).scaleX(1).scaleY(1).setDuration(800).start();
    }

    public void onClickNames(View b)
    {
        names.animate().alpha(1).translationXBy(0).rotationBy(1080).scaleX(1).scaleY(1).setDuration(800).start();
    }
}