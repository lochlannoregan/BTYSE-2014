package com.speech_assist.speech_assist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

 
public class About extends Activity {
    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.getWindow().getDecorView()
        .setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION); 
       
        setContentView(R.layout.activity_about);
        
        
       
        Button change_keyboard =(Button) findViewById(R.id.change_keyboard);
        change_keyboard.setOnClickListener(new View.OnClickListener(){
            @Override
        	public void onClick(View v){
               Intent intent = new Intent(Settings.ACTION_INPUT_METHOD_SETTINGS);
               startActivity(intent);
               Toast.makeText(getApplicationContext(), "SELECT OPTIONS OPPOSITE YOUR SELECTED KEYBOARD AND THEN UNCHECK 'ENABLE GESTURE TYPING' ", Toast.LENGTH_LONG).show();
            }});
        Button longpress =(Button) findViewById(R.id.longpress);
        longpress.setOnClickListener(new View.OnClickListener(){
            @Override
        	public void onClick(View v){
               Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
               startActivity(intent);
               Toast.makeText(getApplicationContext(), "CHANGE 'TOUCH & HOLD DELAY' OPTION TO LONG", Toast.LENGTH_LONG).show();
            }});
        
}}