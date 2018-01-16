package com.example.nathaniel_k_blanquel.drawingapp;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private GLSurfaceView mGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*Create a GLSurfaceView instance and set it
          as the content view for this Activity
        */
        mGLView = new MyGLSurfaceView(this);
        setContentView(mGLView);
    }
}
