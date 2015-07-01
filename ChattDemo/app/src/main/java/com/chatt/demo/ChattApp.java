package com.chatt.demo;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseUser;

import android.app.Application;

/**
 * The Class ChattApp is the Main Application class of this app. The onCreate
 * method of this class initializes the Parse.
 */
public class ChattApp extends Application
{

	/* (non-Javadoc)
	 * @see android.app.Application#onCreate()
	 */
	@Override
	public void onCreate()
	{
		super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "LVnlbA5VacAF89HY44D3LSEky4v4yGEycbyeeUX7",
                "jq474HAsh4Ur0f6cuObKpIjbzOXb8KznTU88YouU");

	}
}
