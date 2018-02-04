package com.l.roottest;

import android.app.*;
import android.os.*;
import eu.chainfire.libsuperuser.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main);
    ((TextView)findViewById(R.id.RootString)).setText((new StringBuilder()).append(Shell.SU.available() ? getString(R.string.rooted):getString(R.string.notroot)).append((char)10).append(getString(R.string.suver)+" ").append(Shell.SU.version(false) == null ? "N/A" : Shell.SU.version(false)).append((char)10).append(getString(R.string.suintver)+" ").append(Shell.SU.version(true) == null ? "N/A" : Shell.SU.version(true)).append((char)10).toString());
    }
}
