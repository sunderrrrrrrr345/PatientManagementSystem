package sunder.admin.patientmanagementsystem.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import sunder.admin.patientmanagementsystem.model.Result;
import sunder.admin.patientmanagementsystem.model.Result_OutPut;

/**
 * Created by Belal on 14/04/17.
 */

public interface APIService {

   /* @FormUrlEncoded
    @POST("register")
    Call<Result> createUser(
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password,
            @Field("gender") String gender);*/


    // @FormUrlEncoded
    @GET("validateClinicCode")
    Call<Result> validateClinicCode(@Query("clinic_code") String securitycode);

    @GET("validateVisitorInfo.php")
    Call<Result> validateVisitorInfo(@Query("mobile") String mobile, @Query("clinic_id") String clinic_id);


    @GET("departmentList")
    Call<Result> departmentName(@Query("clinic_id") String clinic_id);

    @GET("addPatientInfo")
    Call<Result_OutPut> addPatientInfo(@Query("clinic_id") String clinic_id, @Query("id") String id,
                                       @Query("patient_name") String patient_name, @Query("address") String address,
                                       @Query("diseases_details") String diseases_details, @Query("registration_no") String registration_no, @Query("dept_name") String dept_name
            , @Query("dept_id") String dept_id, @Query("patient_image") String patient_image, @Query("patient_category") String patient_category);

    @GET("medicalOfficerLogin")
    Call<Result> medicalOfficerLogin(@Query("username") String username, @Query("password") String password);



    @GET("managerPatientList")
    Call<Result> managerPatientList(@Query("clinic_id") String clinic_id);



    @GET("doctorList")
    Call<Result> doctorList(@Query("clinic_id") String clinic_id);


    @GET("patientInfo")
    Call<Result> patientInfo(@Query("clinic_id") String clinic_id, @Query("patient_id") String patient_id);

    @GET("doctorPatientList")
    Call<Result> doctorPatientList(@Query("clinic_id") String clinic_id, @Query("doctor_id") String doctor_id);


    @GET("doctorPatientDetails")
    Call<Result> doctorPatientDetails(@Query("clinic_id") String clinic_id, @Query("patient_id") String patient_id, @Query("doctor_id") String doctor_id);




    @GET("referPatient")
    Call<Result_OutPut> referPatient(@Query("clinic_id") String clinic_id, @Query("patient_id") String patient_id, @Query("doctor_name") String doctor_name, @Query("doctor_id") String doctor_id);



//    Call<SOAnswersResponse> getAnswers(@Query("tagged") String tags);

 /*   @GET("users")
    Call<Users> getUsers();

    @FormUrlEncoded
    @POST("sendmessage")
    Call<MessageResponse> sendMessage(
            @Field("from") int from,
            @Field("to") int to,
            @Field("title") String title,
            @Field("message") String message);

    @FormUrlEncoded
    @POST("update/{id}")
    Call<Result> updateUser(
            @Path("id") int id,
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password,
            @Field("gender") String gender
    );

    //getting messages
    @GET("messages/{id}")
    Call<Messages> getMessages(@Path("id") int id);*/
}
