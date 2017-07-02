package com.innolat.crash;

import com.innolat.crash.R;

//import com.example.myanimation.MyView;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		MyGame game = new MyGame(this);
		setContentView(game);
		
	}
	
}
