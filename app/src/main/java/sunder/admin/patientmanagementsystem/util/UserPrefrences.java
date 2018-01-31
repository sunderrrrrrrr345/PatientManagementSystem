package sunder.admin.patientmanagementsystem.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;

public class UserPrefrences {
	public SharedPreferences preferences;
	public static UserPrefrences instance;
	public Context _context;
	public Bitmap barcodeimage;
	public	String admin_name,doctor_id,society_id,school_manager_email,school_manager_banner_image;
	public int badgeCount = 0;
	public Boolean rememberStatus;
	public static final String IS_LOGIN = "IsLoggedIn";
	public UserPrefrences(Context context) {
		if (context != null) {
			preferences = context.getSharedPreferences(
					"Drafting_prefrences7", Context.MODE_PRIVATE);
		}

	}
	public static synchronized UserPrefrences getInstance(Context context) {
		instance=instance==null?new UserPrefrences(context):instance;
		return instance;
	}

	public synchronized String getDoctorId() {
		doctor_id= preferences.getString(Constants.DOCTOR_ID, null);
		return doctor_id;
	}


	public synchronized void setDoctorId(String doctor_id) {
		SharedPreferences.Editor editor = preferences.edit();
		editor.putString(Constants.DOCTOR_ID, doctor_id);
		editor.apply();
	}
	public synchronized String getAdminName() {
		admin_name = preferences.getString(Constants.ADMIN_NAME, null);
		return admin_name;
	}


	public synchronized void setAdminName(String admin_name) {
		SharedPreferences.Editor editor = preferences.edit();
		editor.putString(Constants.ADMIN_NAME, admin_name);
		editor.apply();
	}



	public synchronized String getSocietyId() {
		society_id= preferences.getString(Constants.SOCIETY_ID, null);
		return society_id;
	}

	public synchronized void setSocietyId(String society_id) {
		SharedPreferences.Editor editor = preferences.edit();
		editor.putString(Constants.SOCIETY_ID, society_id);
		editor.apply();
	}
}