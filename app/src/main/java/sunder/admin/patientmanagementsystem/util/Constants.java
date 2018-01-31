package sunder.admin.patientmanagementsystem.util;


import android.content.SharedPreferences;

public class Constants {
	public static final String LOCATION_URL="http://sigmawebit.com/drafting_application/api/draftsmanList?min_lat=50.09876&min_lng=50.09876&max_lat=97.09876&max_lng=57.09876";
	/**
	 * 10 MB size in cache directory.
	 */
	public static final int CACHE_SIZE = 10 * 1024 * 1024;

	public static final String EVENT = "event";

	public static final String DATE = "date";
	
	public static final String DATE_SEPARATOR ="-";

	public static final String GET_LOCATION = "get_location";

	public static final String LOCATION_DATA = "location_data";

	public static final String GET_VIDEO = "getVideo";
	public final static int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
	public static final String EXTRA_MESSAGE = "message";
	public static final String PROPERTY_REG_ID = "registration_id";
	public static final String PROPERTY_APP_VERSION = "appVersion";

	public static final String SENDER_ID = "615600291761";
	public static final String ANDROID_ID = "androidId";
	public static final String DEVICE_TYPE = "A";


	// Font Used
	public static final String MYRAIAD_REGULAR = "fonts/myraiad_rgular.otf";
	public static final String MYRAIAD_BOLD = "fonts/MyriadPro-Bold.otf";
	public static final String IMAPCT_FONT_PATH = "fonts/Impact.otf";

	// USER PREFRENCES

	//Admin
	public static final String DOCTOR_ID = "doctor_id";
	public static final String ADMIN_NAME = "admin_name";


	//security
	public static final String SOCIETY_ID = "society_id";
	public static final String SOCIETY_NAME = "society_name";
	public static final String VALUE = "value";





}
