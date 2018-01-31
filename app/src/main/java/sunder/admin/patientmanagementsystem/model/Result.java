package sunder.admin.patientmanagementsystem.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Admin on 1/3/2018.
 */

public class Result {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("details")
    @Expose
    private List<Detail> details = null;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }
}
