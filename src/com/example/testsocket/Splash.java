package com.example.testsocket;

import java.security.PublicKey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {
	
	private final int SPLASH_DISPLAY_LENGHT = 2000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable(){
        	 public void  run(){
        		 Intent mainIntent = new Intent(Splash.this,FullscreenActivity.class);
        		 Splash.this.startActivity(mainIntent);
        		 Splash.this.finish();
        	 }
        },SPLASH_DISPLAY_LENGHT);
	}

}
