package com.example.buttonexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//This will draw our layout from the xml file for us.
		setContentView(R.layout.activity_main);
		
		//Once the layout has been drawn we can find our button
		Button theBtn = (Button)findViewById(R.id.theBtn); //this id must be same in layout xml.
		
		//define a clickListener method that will get called when the user presses the button
		theBtn.setOnClickListener(new OnClickListener() {
			public void onClick(View v){
				Toast.makeText(v.getContext(), "You pressed the button", Toast.LENGTH_SHORT).show();
			}
		});
		
	}

}
