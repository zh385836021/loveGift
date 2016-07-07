/**
 * 
 */
package com.lovegift.lv.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
	private static Toast toast;

	public static void show(Context context, String info) {
		if (toast==null) {
			toast=Toast.makeText(context, info, Toast.LENGTH_SHORT);
		}else {
			toast.setText(info);
		}
		toast.show();
	}

}
