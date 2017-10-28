package com.example.android.background.sync;

import android.content.Context;

import com.example.android.background.utilities.PreferenceUtilities;

// Completed (1) Create a class called ReminderTasks
public class ReminderTasks
{
    public static final String ACTION_INCREMENT_WATER_COUNT = "increment-water-count";

    public static void incrementWaterCount(Context context){
        PreferenceUtilities.incrementWaterCount(context);
    }

    public static void executeTask(Context context, String action){
        if(action.equals(ACTION_INCREMENT_WATER_COUNT))
        {
            incrementWaterCount(context);
        }

}
}

// Completed (2) Create a public static constant String called ACTION_INCREMENT_WATER_COUNT

// Completed (6) Create a public static void method called executeTask
// Completed (7) Add a Context called context and String parameter called action to the parameter list

// Completed (8) If the action equals ACTION_INCREMENT_WATER_COUNT, call this class's incrementWaterCount

// Completed (3) Create a private static void method called incrementWaterCount
// Completed (4) Add a Context called context to the argument list
// Completed (5) From incrementWaterCount, call the PreferenceUtility method that will ultimately update the water count