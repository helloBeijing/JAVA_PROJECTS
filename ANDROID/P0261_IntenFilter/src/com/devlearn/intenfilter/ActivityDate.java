package com.devlearn.intenfilter;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityDate extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.date);
	    
	    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
	    String date = sdf.format(new Date(System.currentTimeMillis()));
	    
	    TextView tvDate = (TextView) findViewById(R.id.tvDate);
	    tvDate.setText(date);
	}
}
