package com.example.helloanenative;

import java.util.HashMap;
import java.util.Map;

import android.os.Vibrator;
import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;

public class VibrationExtensionContext extends FREContext {
	public Vibrator mVibrator;
	@Override
	public void dispose() {
		Log.i(Config.TAG, "VibrationExtensionContext.dispose()");
	}

	@Override
	public Map<String, FREFunction> getFunctions() {
		Log.i(Config.TAG, "VibrationExtensionContext.getFunctions()");
		Map<String, FREFunction> funcMap = new HashMap<String, FREFunction>();
		funcMap.put("initMe", new VibrationInitFunction());
		funcMap.put("isSupported", new VibrationSupportedFunction());
		funcMap.put("vibrateMe", new VibrationVibrateFunction());
		return funcMap;
	}
}
