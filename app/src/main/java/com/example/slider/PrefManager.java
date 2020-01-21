package com.example.slider;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {
    SharedPreferences pref;
    SharedPreferences .Editor editor;
    Context _context;

    int PRIVATE_MODE = 0;

    private static final String PREF_name ="introslider";
    private static final String IS_FIRST_TIME_LAUNCH="IsFirstTimeLaunch";
    public PrefManager(Context context){
        this._context=context;
        pref = _context.getSharedPreferences(PREF_name, PRIVATE_MODE);
        editor=pref.edit();
    }


    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

    public void setFirstTimeLaunch(boolean isFirstTimeLaunch) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTimeLaunch);
        editor.commit();
    }
}
