package com.example.nathaniel_k_blanquel.drawingapp;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;


/**
 * Created by nathaniel_k_blanquel on 1/11/18.
 */

public class MyGLRenderer implements GLSurfaceView.Renderer{

    private Triangle mTriangle;

    public void onSurfaceCreated(GL10 unused, EGLConfig config) {
        // Set the background frame color
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        //Initialize a triangle
        mTriangle = new Triangle();
    }

    public void onDrawFrame(GL10 unused){
        //Redraw background color
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
        mTriangle.draw();
    }

    public void onSurfaceChanged(GL10 unused, int width, int height){
        GLES20.glViewport(0, 0, width, height);
    }

    public static int loadShader(int type, String shaderCode){

        /*Create a vertex shader type (GLES20.GL_VERTEX_SHADER)
          or a fragment shader type (GLES20.GL_FRAGMENT_SHADER)
        */
        int shader = GLES20.glCreateShader(type);

        //Add the source code to the shader and compile it
        GLES20.glShaderSource(shader, shaderCode);
        GLES20.glCompileShader(shader);

        return shader;
    }

}
