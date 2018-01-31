package sunder.admin.patientmanagementsystem.fragment;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.cookie.SM;
import org.json.JSONException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sunder.admin.patientmanagementsystem.PMSMainActivity;
import sunder.admin.patientmanagementsystem.R;
import sunder.admin.patientmanagementsystem.SecurityCodeActivity;
import sunder.admin.patientmanagementsystem.api.APIService;
import sunder.admin.patientmanagementsystem.api.Url_Details;
import sunder.admin.patientmanagementsystem.util.UserPrefrences;


public class PatientLoginFragment extends Fragment {
    public TextView tv_continue;
    private EditText ed_name_mobile_reg_no;
    private APIService apiServices;
    private Dialog myDialog_others;
    private UserPrefrences userPrefrences;
    private Toolbar toolbar;
    private Button ed_security_code;

    // public SendPatientData SM;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        Hello(view);
        return view;
    }

    private void Hello(final View view) {
        // userPrefrences=new UserPrefrences(view.getContext());
        tv_continue = view.findViewById(R.id.tv_continue);
        //  ed_name_mobile_reg_no=view.findViewById(R.id.ed_name_mobile_reg_no);
        //   tv_continue.setOnClickListener(this);
        tv_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myDialog_others = new Dialog(getActivity());
                myDialog_others.setContentView(R.layout.customdialog_others);
                EditText ed_search = myDialog_others.findViewById(R.id.ed_search);
                TextView tv_back = myDialog_others.findViewById(R.id.tv_back);
                TextView tv_done = myDialog_others.findViewById(R.id.tv_done);
                tv_back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog_others.dismiss();
                    }
                });
                tv_done.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ((PMSMainActivity) view.getContext()).viewPager.setCurrentItem(2);
                        myDialog_others.dismiss();
                    }
                });
                myDialog_others.setCancelable(false);
                myDialog_others.show();
            }
        });
        toolbar = view.findViewById(R.id.toolbar);
        //for crate home button
        final AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolbar);
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((PMSMainActivity) view.getContext()).viewPager.setCurrentItem(1);
            }
        });
    }

    /*@Override
    public void onClick(final View v) {
        switch (v.getId()){
            case R.id.tv_continue:
                final ProgressDialog progressDialog = new ProgressDialog(v.getContext());
                progressDialog.setMessage("Please wait...");
                progressDialog.show();
                apiServices = Url_Details.getSOService();
                apiServices.validateVisitorInfo(ed_name_mobile_reg_no.getText().toString(),userPrefrences.getSocietyId()).enqueue(new Callback<Result>() {
                    @Override
                    public void onResponse(Call<Result> call, final Response<Result> response) {
                        progressDialog.dismiss();
                        if (response.isSuccessful()) {
                            for ( int i = 0; i < response.body().getDetails().size(); i++) {
                               SM.sendPatientData(response.body().getDetails().get(i).getId(),response.body().getDetails().get(i).getMobile(),response.body().getDetails().get(i).getClinicId(),response.body().getDetails().get(i).getRegistrationNo());
                                myDialog_others = new Dialog(getActivity());
                                myDialog_others.setContentView(R.layout.customdialog_others);
                                TextView tv_title = myDialog_others.findViewById(R.id.tv_title);
                                final EditText ed_search = myDialog_others.findViewById(R.id.ed_search);
                                TextView tv_back = myDialog_others.findViewById(R.id.tv_back);
                                ed_name_mobile_reg_no.setText("");
                                tv_back.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        myDialog_others.dismiss();
                                    }
                                });
                                ed_search.setHint("Security Code");
                                TextView tv_done = myDialog_others.findViewById(R.id.tv_done);
                                tv_done.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if (ed_search.getText().toString().trim().length() == 0) {
                                            new AlertDialog.Builder(getActivity())
                                                    .setTitle("Error!")
                                                    .setIcon(R.mipmap.alert_icon)
                                                    .setMessage("Enter Security Code !")
                                                    .setCancelable(false)
                                                    .setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                                                        public void onClick(DialogInterface dialog, int id) {
                                                            //getActivity().finish();
                                                            dialog.dismiss();
                                                        }
                                                    })
                                                    .show();
                                        }else if(response.body().getDetails().get(0).getEntryOtp().equalsIgnoreCase(ed_search.getText().toString())){
                                                ((ClinicsDetailsActivity)getActivity()).viewPager.setCurrentItem(2);
                                                myDialog_others.dismiss();
                                            }else{
                                                new AlertDialog.Builder(getActivity())
                                                        .setTitle("Error!")
                                                        .setIcon(R.mipmap.alert_icon)
                                                        .setMessage("Network Problem.Security Code is not Correct!")
                                                        .setCancelable(false)
                                                        .setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                                                            public void onClick(DialogInterface dialog, int id) {
                                                                //getActivity().finish();
                                                                ed_search.setText("");
                                                                dialog.dismiss();
                                                            }
                                                        })
                                                        .show();
                                            }

                                    }
                                });
                                tv_title.setText("Security Code Verification");
                                myDialog_others.setCancelable(false);
                                myDialog_others.show();
                            }

                        }
                    }

                    @Override
                    public void onFailure(Call<Result> call, Throwable t) {
                        progressDialog.dismiss();
                        AlertDialog.Builder build = new AlertDialog.Builder(v.getContext());
                        build.setMessage("Please check your connection & Enter Valid Mobile Number!");
                        build.setCancelable(false);
                        build.setIcon(R.mipmap.alert_icon);
                        build.setTitle("Error !");
                        build.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        AlertDialog alert = build.create();
                        alert.show();
                    }
                });
                break;

        }



    }*/
/*
    public interface SendPatientData{
        void sendPatientData(String id, String mobile, String clinic_id, String registration_no);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            SM = (SendPatientData) getActivity();

        } catch (ClassCastException e) {
            throw new ClassCastException("Error in retrieving data. Please try again");
        }
    }
*/

}
