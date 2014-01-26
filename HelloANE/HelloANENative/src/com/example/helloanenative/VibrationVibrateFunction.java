package com.example.helloanenative;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class VibrationVibrateFunction implements FREFunction {
	@Override
	public FREObject call(FREContext context, FREObject[] passedArgs) {
		Log.i(Config.TAG, "VibrationVibrateFunction.call()");
		FREObject result = null;
		VibrationExtensionContext vbc = (VibrationExtensionContext) context;
		
		if (vbc.mVibrator != null) {
			FREObject fro = passedArgs[0];
			try {
				int duration = fro.getAsInt();
				vbc.mVibrator.vibrate(duration);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
