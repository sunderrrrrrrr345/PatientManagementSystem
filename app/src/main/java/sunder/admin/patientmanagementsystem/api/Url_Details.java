package sunder.admin.patientmanagementsystem.api;


import sunder.admin.patientmanagementsystem.retrofit.RetrofitClient;

/**
 * Created by Admin on 3/18/2017.
 */
public class Url_Details {
    public static final String BASE_URL = "http://iiieyehealth.com/gtb-vms/web-api/";
    //http://iiieyehealth.com/gtb-vms/web-api/validateVisitorInfo.php?mobile=7835906404&clinic_id=1
    //http://iiieyehealth.com/gtb-vms/web-api/validateClinicCode?clinic_code=555555♦

//http://iiieyehealth.com/gtb-vms/web-api/managerPatientList?clinic_id=1


    public static final String UploadImage = "http://iiieyehealth.com/gtb-vms/web-api/uploadImage.php";
    public static final String UniqueImagePath = "http://iiieyehealth.com/gtb-vms/manager/uploads/";
    //Lalit, 12:41 PM
   // http://iiieyehealth.com/gtb-vms/web-api/patientInfo?clinic_id=1&patient_id=44
    //
    public static APIService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
