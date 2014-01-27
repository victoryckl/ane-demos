package com.example.helloanenative;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class VibrationExtension implements FREExtension {

	@Override
	public FREContext createContext(String contextType) {
		Log.i(Config.TAG, "VibrationExtension.createContext(), type: "+contextType);
		return new VibrationExtensionContext();
	}

	@Override
	public void dispose() {
		Log.i(Config.TAG, "VibrationExtension.dispose()");
	}

	@Override
	public void initialize() {
		Log.i(Config.TAG, "VibrationExtension.initialize()");
	}

}
