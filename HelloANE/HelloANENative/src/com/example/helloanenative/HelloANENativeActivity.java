package com.example.helloanenative;

import android.os.Bundle;
import android.os.Vibrator;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class HelloANENativeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_anenative);
		
		init();
	}

	private void init() {
		findViewById(R.id.btn_vibrate).setOnClickListener(mClickListener);
		findViewById(R.id.btn_multi_vibrate).setOnClickListener(mClickListener);
	}
	
	private OnClickListener mClickListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btn_vibrate:
				doVibrate();
				break;
			case R.id.btn_multi_vibrate:
				doMultiVibrate();
				break;
			default:
				break;
			}
		}
	};

	protected void doVibrate() {
		Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		vibrator.vibrate(1000);
	}

	protected void doMultiVibrate() {
		Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		long[] pattern = {200, 500, 200, 500, 200, 1000}; // OFF/ON/OFF/ON 
		vibrator.vibrate(pattern, -1);
	}
}
