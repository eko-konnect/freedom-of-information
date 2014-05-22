package com.FOI.freedomofinformation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;

public class ActsSections extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_acts_sections);
		// Show the Up button in the action bar.
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.acts_sections, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void Section1(View v)
	{
		Intent i = new Intent(this,Section1.class );
		startActivity(i);
	
	}
	
	public void Section2(View v)
	{
		Intent i = new Intent(this,Section2.class );
		startActivity(i);
	
	}
	
	public void Section3(View v)
	{
		Intent i = new Intent(this,Section3.class );
		startActivity(i);
	
	}
	
	public void Section4(View v)
	{
		Intent i = new Intent(this,Section4.class );
		startActivity(i);
	
	}
	
	public void Section5(View v)
	{
		Intent i = new Intent(this,Section5.class );
		startActivity(i);
	
	}
	
	public void Section6(View v)
	{
		Intent i = new Intent(this,Section6.class );
		startActivity(i);
	
	}
	
	public void Section7(View v)
	{
		Intent i = new Intent(this,Section7.class );
		startActivity(i);
	
	}
	
	public void Section8(View v)
	{
		Intent i = new Intent(this,Section8.class );
		startActivity(i);
	
	}
	
	public void Section9(View v)
	{
		Intent i = new Intent(this,Section9.class );
		startActivity(i);
	
	}
	
	public void Section10(View v)
	{
		Intent i = new Intent(this,Section10.class );
		startActivity(i);
	
	}
	
	public void Section11(View v)
	{
		Intent i = new Intent(this,Section11.class );
		startActivity(i);
	
	}
	
	public void Section12(View v)
	{
		Intent i = new Intent(this,Section12.class );
		startActivity(i);
	
	}
	
	public void Section13(View v)
	{
		Intent i = new Intent(this,Section13.class );
		startActivity(i);
	
	}
	
	public void Section14(View v)
	{
		Intent i = new Intent(this,Section14.class );
		startActivity(i);
	
	}
	
	public void Section15(View v)
	{
		Intent i = new Intent(this,Section15.class );
		startActivity(i);
	
	}
	
	public void Section16(View v)
	{
		Intent i = new Intent(this,Section16.class );
		startActivity(i);
	
	}
	
	public void Section17(View v)
	{
		Intent i = new Intent(this,Section17.class );
		startActivity(i);
	
	}
	
	public void Section18(View v)
	{
		Intent i = new Intent(this,Section18.class );
		startActivity(i);
	
	}
	
	public void Section19(View v)
	{
		Intent i = new Intent(this,Section19.class );
		startActivity(i);
	
	}
	
	public void Section20(View v)
	{
		Intent i = new Intent(this,Section20.class );
		startActivity(i);
	
	}
	
	public void Section21(View v)
	{
		Intent i = new Intent(this,Section21.class );
		startActivity(i);
	
	}
	
	public void Section22(View v)
	{
		Intent i = new Intent(this,Section22.class );
		startActivity(i);
	
	}
	
	public void Section23(View v)
	{
		Intent i = new Intent(this,Section23.class );
		startActivity(i);
	
	}
	
	public void Section24(View v)
	{
		Intent i = new Intent(this,Section24.class );
		startActivity(i);
	
	}
	
	public void Section25(View v)
	{
		Intent i = new Intent(this,Section25.class );
		startActivity(i);
	
	}
	
	public void Section26(View v)
	{
		Intent i = new Intent(this,Section26.class );
		startActivity(i);
	
	}
	
	public void Section27(View v)
	{
		Intent i = new Intent(this,Section27.class );
		startActivity(i);
	
	}
	
	public void Section28(View v)
	{
		Intent i = new Intent(this,Section28.class );
		startActivity(i);
	
	}
	
	public void Section29(View v)
	{
		Intent i = new Intent(this,Section29.class );
		startActivity(i);
	
	}
	
	public void Section30(View v)
	{
		Intent i = new Intent(this,Section30.class );
		startActivity(i);
	
	}
	
	public void Section31(View v)
	{
		Intent i = new Intent(this,Section31.class );
		startActivity(i);
	
	}
	
	public void Section32(View v)
	{
		Intent i = new Intent(this,Section32.class );
		startActivity(i);
	
	}
	
	public void Section33(View v)
	{
		Intent i = new Intent(this,Section33.class );
		startActivity(i);
	
	}
	
	public void Section34(View v)
	{
		Intent i = new Intent(this,Section34.class );
		startActivity(i);
	
	}

}
