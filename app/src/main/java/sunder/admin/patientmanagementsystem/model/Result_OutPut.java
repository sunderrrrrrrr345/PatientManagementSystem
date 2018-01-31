package sunder.admin.patientmanagementsystem.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Admin on 1/3/2018.
 */

public class Result_OutPut {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("details")
    @Expose
    private String details;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
