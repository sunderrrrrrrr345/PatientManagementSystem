package sunder.admin.patientmanagementsystem.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 1/3/2018.
 */

public class Detail{


    //Security Code
    @SerializedName("ca_id")
    @Expose
    private String caId;
    @SerializedName("ca_clinic_name")
    @Expose
    private String caClinicName;
    @SerializedName("ca_clinic_logo")
    @Expose
    private Object caClinicLogo;
    @SerializedName("banner")
    @Expose
    private String banner;

    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    public String getCaClinicName() {
        return caClinicName;
    }

    public void setCaClinicName(String caClinicName) {
        this.caClinicName = caClinicName;
    }

    public Object getCaClinicLogo() {
        return caClinicLogo;
    }

    public void setCaClinicLogo(Object caClinicLogo) {
        this.caClinicLogo = caClinicLogo;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }





    //patient login


    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("registration_no")
    @Expose
    private String registrationNo;
    @SerializedName("clinic_id")
    @Expose
    private String clinicId;
    @SerializedName("mobile")
    @Expose
    private String mobile;
    @SerializedName("entry_otp")
    @Expose
    private String entryOtp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getClinicId() {
        return clinicId;
    }

    public void setClinicId(String clinicId) {
        this.clinicId = clinicId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEntryOtp() {
        return entryOtp;
    }

    public void setEntryOtp(String entryOtp) {
        this.entryOtp = entryOtp;
    }



    //Department Name
    @SerializedName("dm_id")
    @Expose
    private String dmId;
    @SerializedName("dm_name")
    @Expose
    private String dmName;

    public String getDmId() {
        return dmId;
    }

    public void setDmId(String dmId) {
        this.dmId = dmId;
    }

    public String getDmName() {
        return dmName;
    }

    public void setDmName(String dmName) {
        this.dmName = dmName;
    }


    //doctor
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("complete_name")
    @Expose
    private String completeName;
    @SerializedName("designation")
    @Expose
    private String designation;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("photo")
    @Expose
    private Object photo;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getPhoto() {
        return photo;
    }

    public void setPhoto(Object photo) {
        this.photo = photo;
    }



    //patient list on cmo

    @SerializedName("ml_id")
    @Expose
    private String mlId;
    @SerializedName("ml_registration_no")
    @Expose
    private String mlRegistrationNo;
    @SerializedName("ml_patient_category")
    @Expose
    private String mlPatientCategory;
    @SerializedName("ml_patient_name")
    @Expose
    private String mlPatientName;
    @SerializedName("ml_doctor_name")
    @Expose
    private String mlDoctorName;

    public String getMlId() {
        return mlId;
    }

    public void setMlId(String mlId) {
        this.mlId = mlId;
    }

    public String getMlRegistrationNo() {
        return mlRegistrationNo;
    }

    public void setMlRegistrationNo(String mlRegistrationNo) {
        this.mlRegistrationNo = mlRegistrationNo;
    }

    public String getMlPatientCategory() {
        return mlPatientCategory;
    }

    public void setMlPatientCategory(String mlPatientCategory) {
        this.mlPatientCategory = mlPatientCategory;
    }

    public String getMlPatientName() {
        return mlPatientName;
    }

    public void setMlPatientName(String mlPatientName) {
        this.mlPatientName = mlPatientName;
    }

    public String getMlDoctorName() {
        return mlDoctorName;
    }

    public void setMlDoctorName(String mlDoctorName) {
        this.mlDoctorName = mlDoctorName;
    }

    //Doctor_lst

    @SerializedName("dd_id")
    @Expose
    private String ddId;
    @SerializedName("dd_doctor_name")
    @Expose
    private String ddDoctorName;

    public String getDdId() {
        return ddId;
    }

    public void setDdId(String ddId) {
        this.ddId = ddId;
    }

    public String getDdDoctorName() {
        return ddDoctorName;
    }

    public void setDdDoctorName(String ddDoctorName) {
        this.ddDoctorName = ddDoctorName;
    }




    //aptient details on cmo
    @SerializedName("pi_id")
    @Expose
    private String piId;
    @SerializedName("pi_registration_no")
    @Expose
    private String piRegistrationNo;
    @SerializedName("pi_clinic_id")
    @Expose
    private String piClinicId;
    @SerializedName("pi_patient_name")
    @Expose
    private String piPatientName;
    @SerializedName("pi_patient_mobile")
    @Expose
    private String piPatientMobile;
    @SerializedName("pi_patient_address")
    @Expose
    private String piPatientAddress;
    @SerializedName("pi_visit_date")
    @Expose
    private String piVisitDate;
    @SerializedName("pi_doctor_name")
    @Expose
    private String piDoctorName;
    @SerializedName("pi_dept_name")
    @Expose
    private String piDeptName;
    @SerializedName("pi_disease_info")
    @Expose
    private String piDiseaseInfo;
    @SerializedName("pi_patient_photo")
    @Expose
    private String piPatientPhoto;

    @SerializedName("pi_patient_visit")
    @Expose
    private String piPatientVisit;


    @SerializedName("pi_patient_category")
    @Expose
    private String piPatientCategory;

    public String getPiId() {
        return piId;
    }

    public void setPiId(String piId) {
        this.piId = piId;
    }

    public String getPiRegistrationNo() {
        return piRegistrationNo;
    }

    public void setPiRegistrationNo(String piRegistrationNo) {
        this.piRegistrationNo = piRegistrationNo;
    }

    public String getPiClinicId() {
        return piClinicId;
    }

    public void setPiClinicId(String piClinicId) {
        this.piClinicId = piClinicId;
    }

    public String getPiPatientName() {
        return piPatientName;
    }

    public void setPiPatientName(String piPatientName) {
        this.piPatientName = piPatientName;
    }

    public String getPiPatientMobile() {
        return piPatientMobile;
    }

    public void setPiPatientMobile(String piPatientMobile) {
        this.piPatientMobile = piPatientMobile;
    }

    public String getPiPatientAddress() {
        return piPatientAddress;
    }

    public void setPiPatientAddress(String piPatientAddress) {
        this.piPatientAddress = piPatientAddress;
    }

    public String getPiVisitDate() {
        return piVisitDate;
    }

    public void setPiVisitDate(String piVisitDate) {
        this.piVisitDate = piVisitDate;
    }

    public String getPiDoctorName() {
        return piDoctorName;
    }

    public void setPiDoctorName(String piDoctorName) {
        this.piDoctorName = piDoctorName;
    }

    public String getPiDeptName() {
        return piDeptName;
    }

    public void setPiDeptName(String piDeptName) {
        this.piDeptName = piDeptName;
    }

    public String getPiDiseaseInfo() {
        return piDiseaseInfo;
    }

    public void setPiDiseaseInfo(String piDiseaseInfo) {
        this.piDiseaseInfo = piDiseaseInfo;
    }

    public String getPiPatientPhoto() {
        return piPatientPhoto;
    }

    public void setPiPatientPhoto(String piPatientPhoto) {
        this.piPatientPhoto = piPatientPhoto;
    }

    public String getPiPatientVisit() {
        return piPatientVisit;
    }



    public void setPiPatientVisit(String piPatientVisit) {
        this.piPatientVisit = piPatientVisit;
    }
    public void setPiPatientCategory(String piPatientCategory) {
        this.piPatientCategory = piPatientCategory;
    }

    public String getPiPatientCategory() {
        return piPatientCategory;
    }




    //Patoent List on Doctor panel

    @SerializedName("pl_id")
    @Expose
    private String plId;
    @SerializedName("pl_registration_no")
    @Expose
    private String plRegistrationNo;
    @SerializedName("pl_patient_category")
    @Expose
    private String plPatientCategory;
    @SerializedName("pl_patient_name")
    @Expose
    private String  plPatientName;
    @SerializedName("pl_doctor_name")
    @Expose
    private String plDoctorName;

    public String getPlId() {
        return plId;
    }

    public void setPlId(String plId) {
        this.plId = plId;
    }

    public String getPlRegistrationNo() {
        return plRegistrationNo;
    }

    public void setPlRegistrationNo(String plRegistrationNo) {
        this.plRegistrationNo = plRegistrationNo;
    }

    public String getPlPatientCategory() {
        return plPatientCategory;
    }

    public void setPlPatientCategory(String plPatientCategory) {
        this.plPatientCategory = plPatientCategory;
    }

    public String getPlPatientName() {
        return plPatientName;
    }

    public void setPlPatientName(String plPatientName) {
        this.plPatientName = plPatientName;
    }

    public String getPlDoctorName() {
        return plDoctorName;
    }

    public void setPlDoctorName(String plDoctorName) {
        this.plDoctorName = plDoctorName;
    }


    //patient detaions on doctor layout

    @SerializedName("pd_id")
    @Expose
    private String pdId;
    @SerializedName("pd_registration_no")
    @Expose
    private String pdRegistrationNo;
    @SerializedName("pd_clinic_admin_id")
    @Expose
    private String pdClinicAdminId;
    @SerializedName("pd_patient_name")
    @Expose
    private String pdPatientName;
    @SerializedName("pd_patient_mobile")
    @Expose
    private String pdPatientMobile;
    @SerializedName("pd_patient_address")
    @Expose
    private String pdPatientAddress;
    @SerializedName("pd_visit_date")
    @Expose
    private String pdVisitDate;
    @SerializedName("pd_doctor_name")
    @Expose
    private String pdDoctorName;
    @SerializedName("pd_patient_dept_name")
    @Expose
    private String pdPatientDeptName;
    @SerializedName("pd_disease_details")
    @Expose
    private String pdDiseaseDetails;
    @SerializedName("pd_patient_visit")
    @Expose
    private String pdPatientVisit;
    @SerializedName("pd_patient_category")
    @Expose
    private String pdPatientCategory;
    @SerializedName("pd_patient_photo")
    @Expose
    private String pdPatientPhoto;

    public String getPdId() {
        return pdId;
    }

    public void setPdId(String pdId) {
        this.pdId = pdId;
    }

    public String getPdRegistrationNo() {
        return pdRegistrationNo;
    }

    public void setPdRegistrationNo(String pdRegistrationNo) {
        this.pdRegistrationNo = pdRegistrationNo;
    }

    public String getPdClinicAdminId() {
        return pdClinicAdminId;
    }

    public void setPdClinicAdminId(String pdClinicAdminId) {
        this.pdClinicAdminId = pdClinicAdminId;
    }

    public String getPdPatientName() {
        return pdPatientName;
    }

    public void setPdPatientName(String pdPatientName) {
        this.pdPatientName = pdPatientName;
    }

    public String getPdPatientMobile() {
        return pdPatientMobile;
    }

    public void setPdPatientMobile(String pdPatientMobile) {
        this.pdPatientMobile = pdPatientMobile;
    }

    public String getPdPatientAddress() {
        return pdPatientAddress;
    }

    public void setPdPatientAddress(String pdPatientAddress) {
        this.pdPatientAddress = pdPatientAddress;
    }

    public String getPdVisitDate() {
        return pdVisitDate;
    }

    public void setPdVisitDate(String pdVisitDate) {
        this.pdVisitDate = pdVisitDate;
    }

    public String getPdDoctorName() {
        return ddDoctorName;
    }

    public void setPdDoctorName(String pdDoctorName) {
        this.pdDoctorName = pdDoctorName;
    }

    public String getPdPatientDeptName() {
        return pdPatientDeptName;
    }

    public void setPdPatientDeptName(String pdPatientDeptName) {
        this.pdPatientDeptName = pdPatientDeptName;
    }

    public String getPdDiseaseDetails() {
        return pdDiseaseDetails;
    }

    public void setPdDiseaseDetails(String pdDiseaseDetails) {
        this.pdDiseaseDetails = pdDiseaseDetails;
    }

    public String getPdPatientVisit() {
        return pdPatientVisit;
    }

    public void setPdPatientVisit(String pdPatientVisit) {
        this.pdPatientVisit = pdPatientVisit;
    }





    public String getPdPatientCategory() {
        return pdPatientCategory;
    }

    public void setPdPatientCategory(String pdPatientCategory) {
        this.pdPatientCategory = pdPatientCategory;
    }




    public String getPdPatientPhoto() {
        return pdPatientPhoto;
    }

    public void setPdPatientPhoto(String pdPatientPhoto) {
        this.pdPatientPhoto = pdPatientPhoto;
    }
}
