package com.example.helloanenative;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class VibrationExtension implements FREExtension {

	@Override
	public FREContext createContext(String contextType) {
		return new VibrationExtensionContext();
	}

	@Override
	public void dispose() {
	}

	@Override
	public void initialize() {
	}

}
