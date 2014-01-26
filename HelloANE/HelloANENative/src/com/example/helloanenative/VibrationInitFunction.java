package com.example.helloanenative;

import android.content.Context;
import android.os.Vibrator;
import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class VibrationInitFunction implements FREFunction {
	@Override
	public FREObject call(FREContext context, FREObject[] passedArgs) {
		Log.i(Config.TAG, "VibrationInitFunction.call()");
		VibrationExtensionContext vbc = (VibrationExtensionContext)context;
		vbc.mVibrator = (Vibrator) vbc.getActivity().getSystemService(Context.VIBRATOR_SERVICE);
		return null;
	}
}
