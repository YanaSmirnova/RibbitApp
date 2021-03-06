package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.teamtreehouse.ribbit.utils.ParseConstants;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
        Parse.initialize(this,
                "EiK2zlnCPYFlDQjRPDd8Zr6vyg3YYih8W90emAg3",
                "jZg8ziWROu6CydqOzFBbWjpkwyMb0nWEx2MVVGDg");

        ParseInstallation.getCurrentInstallation().saveInBackground();
	}

    public static void updateParseInstallation(ParseUser user) {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();
    }
}
