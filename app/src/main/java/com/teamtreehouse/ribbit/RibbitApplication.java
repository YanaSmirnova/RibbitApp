package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, 
	    	"EiK2zlnCPYFlDQjRPDd8Zr6vyg3YYih8W90emAg3",
	    	"jZg8ziWROu6CydqOzFBbWjpkwyMb0nWEx2MVVGDg");
	}
}
