package com.wilis.typeface;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class typeface extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		TextView tv = (TextView) findViewById(R.id.custom);
		Typeface face = Typeface.createFromAsset(getAssets(),
				"fonts/mistral.ttf");

		tv.setTypeface(face);

	}
}