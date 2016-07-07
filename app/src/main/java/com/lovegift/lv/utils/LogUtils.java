package com.lovegift.lv.utils;

import android.util.Log;

public class LogUtils {
	private static boolean safe=true;

	public static void i(String tag,String msg){
		if (safe) {
			Log.v("TAG-"+tag, msg);
		}
		
	}
	public static void e(String tag,String msg){
		if (safe) {
			Log.e("TAG-"+tag, msg);
		}
		
	}

}
