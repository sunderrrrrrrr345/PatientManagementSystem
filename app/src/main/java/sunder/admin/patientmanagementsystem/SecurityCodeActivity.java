package sunder.admin.patientmanagementsystem;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.rampo.updatechecker.UpdateChecker;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sunder.admin.patientmanagementsystem.api.APIService;
import sunder.admin.patientmanagementsystem.api.Url_Details;
import sunder.admin.patientmanagementsystem.model.Result;
import sunder.admin.patientmanagementsystem.util.UserPrefrences;


public class SecurityCodeActivity extends AppCompatActivity {
    public EditText ed_security_code;
    private UserPrefrences userPrefrences;
    private APIService apiServices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_code);
        ed_security_code = findViewById(R.id.ed_security_code);
        userPrefrences = new UserPrefrences(this);
        ConnectivityManager connec = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
        // Check for network connections
        if (connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTED ||
                connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTED) {

            userPrefrences = new UserPrefrences(this);
            UpdateChecker update=new UpdateChecker(this);
            update.start();

            ed_security_code.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    ed_security_code.setFocusable(true);
                    ed_security_code.setFocusableInTouchMode(true);
                    return false;
                }
            });


            ed_security_code.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(SecurityCodeActivity.this,PMSMainActivity.class));
                    finish();
                }
            });

        /* ed_security_code.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                }

                @Override
                public void afterTextChanged(Editable s) {
                    if (ed_security_code.getText().length() == 6) {
                        //societyVerification(this, ed_security_code.getText().toString());
                    }
                }
            });*/

        } else if (
                connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.DISCONNECTED || connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.DISCONNECTED) {
            Internet();
        }

    }

    private void Internet() {
        AlertDialog.Builder build = new AlertDialog.Builder(SecurityCodeActivity.this);
        build.setMessage("No Internet found.Check your connection or try again.");
        build.setTitle("Oh no!");
        build.setCancelable(true);
        build.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        AlertDialog alert = build.create();
        alert.show();
    }

    /*private void societyVerification(TextWatcher textWatcher, String s) {
            final ProgressDialog progressDialog = new ProgressDialog(SecurityCodeActivity.this);
            progressDialog.setMessage("Please wait...");
            progressDialog.show();
            apiServices = Url_Details.getSOService();
            apiServices.validateClinicCode(s).enqueue(new Callback<Result>() {
                @Override
                public void onResponse(Call<Result> call, Response<Result> response) {
                    progressDialog.dismiss();
                    if (response.isSuccessful()) {
                        for (int i = 0; i < response.body().getDetails().size(); i++) {
                            userPrefrences.setSocietyId(response.body().getDetails().get(i).getCaId());
                            userPrefrences.setSocietyName(response.body().getDetails().get(i).getCaClinicName());
                            Toast.makeText(getApplicationContext(), "Welcome to "+response.body().getDetails().get(i).getCaClinicName()+" !", Toast.LENGTH_LONG).show();
                           // startActivity(new Intent(SecurityCodeActivity.this, ClinicsDetailsActivity.class));
                           // finish();
                        }
                    }
                }

                @Override
                public void onFailure(Call<Result> call, Throwable t) {
                    progressDialog.dismiss();
                   // Toast.makeText(getApplicationContext(), "Enter Valid Clinic Code!", Toast.LENGTH_LONG).show();
                    AlertDialog.Builder build = new AlertDialog.Builder(SecurityCodeActivity.this);
                    build.setMessage("Please check your connection & Enter Valid Clinic Code!");
                    build.setCancelable(false);
                    build.setIcon(R.mipmap.alert_icon);
                    build.setTitle("Error !");
                    build.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ed_security_code.clearFocus();
                            ed_security_code.setText("");
                        }
                    });
                    AlertDialog alert = build.create();
                    alert.show();
                }
            });





    }*/


    public void onBackPressed(){
      //  super.onBackPressed();
        AlertDialog.Builder build = new AlertDialog.Builder(SecurityCodeActivity.this);
        build.setTitle("Confirmation");
        build.setMessage("Kindly Rate it with 5 star to support our hard work.");
        build.setCancelable(false);
        build.setPositiveButton("Rate", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=sunder.com.khstm.zeetv&hl=en")));
            }

        });

        build.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                finish();
            }
        });


        build.setNeutralButton("Rate later", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                finish();
            }
        });
        AlertDialog alert = build.create();
        alert.show();
    }


}
