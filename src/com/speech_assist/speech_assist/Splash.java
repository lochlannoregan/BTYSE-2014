package com.speech_assist.speech_assist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Splash extends Activity{
	
	@Override
	public void onCreate(Bundle SplashScreen){
		super.onCreate(SplashScreen);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
	            WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    this.getWindow().getDecorView()
	    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION); 
		setContentView(R.layout.activity_splash);
		Thread logoTimer = new Thread(){
			public void run(){
				try{
					sleep(3000); //3 seconds
					Intent mainIntent = new Intent ("com.speechassist.speechassist.MAIN");
					startActivity(mainIntent);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally{
					finish();
				}
				
			
			}
	
	
	};
	logoTimer.start();

	}

}
