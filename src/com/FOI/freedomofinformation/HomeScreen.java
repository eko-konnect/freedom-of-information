package com.FOI.freedomofinformation;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class HomeScreen extends Activity {
	 public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home_screen, menu);
		return true;
	}
	
	
	public void actInSections(View v)
	{
		Intent i = new Intent(this,ActsSections.class );
		startActivity(i);
		
	
	}
	
	public void aboutFOI(View v)
	{
		Intent i = new Intent(this,AboutFOIApp.class );
		startActivity(i);
	
	}
	
	public void mediaRights(View v)
	{
		Intent i = new Intent(this,Mediarights.class );
		startActivity(i);
	
	}
	
	public void eko(View v)
	{
		Intent i = new Intent(this,Eko.class );
		startActivity(i);
	
	}
	
	public void ford(View v)
	{
		Intent i = new Intent(this,Ford.class );
		startActivity(i);
	}
	
	public void contacts(View v)
	{
		Intent i = new Intent(this,Contact.class );
		startActivity(i);
		
	
	}

}
