package com.example.helloanenative;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;

public class VibrationSupportedFunction implements FREFunction {
	@Override
	public FREObject call(FREContext context, FREObject[] passedArgs) {
		Log.i(Config.TAG, "VibrationSupportedFunction.call()");
		FREObject result = null;
		VibrationExtensionContext vbc = (VibrationExtensionContext) context;
		try {
			result = FREObject.newObject(
					vbc.mVibrator == null ? false : true);
		} catch (FREWrongThreadException e) {
			e.printStackTrace();
		}
		return result;
	}
}
