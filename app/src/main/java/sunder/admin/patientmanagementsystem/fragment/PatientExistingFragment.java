package sunder.admin.patientmanagementsystem.fragment;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import sunder.admin.patientmanagementsystem.PMSMainActivity;
import sunder.admin.patientmanagementsystem.R;
import sunder.admin.patientmanagementsystem.SecurityCodeActivity;
import sunder.admin.patientmanagementsystem.api.APIService;
import sunder.admin.patientmanagementsystem.util.UserPrefrences;


public class PatientExistingFragment extends Fragment  {
   public TextView tv_patient_panel,tv_cmo,tv_doctor_panel;
   public Dialog myDialog;
   private APIService apiServices;
   private UserPrefrences userPrefrences;
   private String doctor_id;
   private Toolbar toolbar;
   private Button ed_security_code;
   private TextView tv_book_an_appointment,tv_track;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_patient_exsiting, container, false);
        Hello(view);
        return view;
    }

    private void Hello(final View view) {
        toolbar=view.findViewById(R.id.toolbar);
        //for crate home button
        tv_book_an_appointment=view.findViewById(R.id.tv_book_an_appointment);
        tv_track=view.findViewById(R.id.tv_track);
        final AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolbar);
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tv_book_an_appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ((PMSMainActivity)view.getContext()).viewPager.setCurrentItem(3);
            }
        });

        tv_track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((PMSMainActivity)view.getContext()).viewPager.setCurrentItem(5);
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), SecurityCodeActivity.class));
                (getActivity()).finish();
            }
        });
      /*  ed_security_code =view.findViewById(R.id.btn);

        ed_security_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((PMSMainActivity)view.getContext()).viewPager.setCurrentItem(1);
            }
        });*/
     /*   userPrefrences=new UserPrefrences(view.getContext());
        tv_patient_panel=view.findViewById(R.id.tv_patient_panel);
        tv_patient_panel.setOnClickListener(this);
        tv_cmo=view.findViewById(R.id.tv_cmo);
        tv_doctor_panel=view.findViewById(R.id.tv_doctor_panel);
        tv_doctor_panel.setOnClickListener(this);
        tv_cmo.setOnClickListener(this);*/

    }

/*
    @Override
    public void onClick(final  View v) {
        switch (v.getId()){
            case R.id.tv_patient_panel:
                ((ClinicsDetailsActivity)v.getContext()).viewPager.setCurrentItem(1);
                break;

            case R.id.tv_cmo:
               startActivity(new Intent(v.getContext(), CMOActivity.class));
                break;
            case R.id.tv_doctor_panel:
              //  startActivity(new Intent(v.getContext(), DoctorActivity.class));

                final List<Doctor_List> array = new ArrayList<>();
                myDialog = new Dialog(getActivity());
                myDialog.setContentView(R.layout.customdialog_doctor_list);
                TextView tv_title = myDialog.findViewById(R.id.tv_title);
                ListView listView = myDialog.findViewById(R.id.list_view);
                final RelativeLayout relative = myDialog.findViewById(R.id.relative);
                final MaterialProgressBar material_progress_bar = myDialog.findViewById(R.id.material_progress_bar);
                PurposeFlatTower(array, material_progress_bar, relative);
                Adapter_Doctor_List adapter = new Adapter_Doctor_List(getActivity(), array);
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        doctor_id = array.get(position).getId();
                        userPrefrences.setDoctorId(doctor_id);
                        //tv_department_name.setText(array.get(position).getName());
                      //  ((ClinicsDetailsActivity)v.getContext()).viewPager.setCurrentItem(0);
                        startActivity(new Intent(view.getContext(),DoctorActivity.class));
                        myDialog.dismiss();
                    }
                });
                tv_title.setText("Doctor List");
                myDialog.setCancelable(true);
                myDialog.show();
                break;
        }
    }

    private void PurposeFlatTower(final List<Doctor_List> array,final MaterialProgressBar material_progress_bar,final RelativeLayout relative) {
        apiServices = Url_Details.getSOService();
        material_progress_bar.setVisibility(View.VISIBLE);
        relative.setVisibility(View.GONE);
        apiServices.doctorList(userPrefrences.getSocietyId()).enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, final Response<Result> response) {
                if (response.isSuccessful()) {
                    for (int i = 0; i < response.body().getDetails().size(); i++) {
                        Doctor_List select = new Doctor_List();
                        select.setName(response.body().getDetails().get(i).getDdDoctorName());
                        select.setId(response.body().getDetails().get(i).getDdId());
                        array.add(select);
                        material_progress_bar.setVisibility(View.GONE);
                        relative.setVisibility(View.VISIBLE);
                    }
                }
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {
                material_progress_bar.setVisibility(View.GONE);
                relative.setVisibility(View.VISIBLE);
                AlertDialog.Builder build = new AlertDialog.Builder(getContext());
                build.setMessage("No Data Found!");
                build.setCancelable(true);
                build.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                AlertDialog alert = build.create();
                alert.show();
            }
        });

    }*/

}
