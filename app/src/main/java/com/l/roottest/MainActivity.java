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
	TextView rootstr=(TextView)findViewById(R.id.RootString);
	//TextView rootstria=(TextView)findViewById(R.id.RootStringInteractive);
	Boolean hadsu=Shell.SU.available();
	String suVersion = Shell.SU.version(false);
	String suVersionInternal = Shell.SU.version(true);
	String notroot=getString(R.string.notroot);
	String rootenn=getString(R.string.rooted);
	StringBuilder sb = (new StringBuilder()).append
	(hadsu ? rootenn:notroot).append((char)10).
	append(getString(R.string.suver)).append(suVersion == null ? "N/A" : suVersion).append((char)10).
	append(getString(R.string.suintver)).append(suVersionInternal == null ? "N/A" : suVersionInternal).append((char)10);
	rootstr.setText(sb.toString());
	
    }
}
