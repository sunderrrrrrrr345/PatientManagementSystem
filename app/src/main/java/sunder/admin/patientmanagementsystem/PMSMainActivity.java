package sunder.admin.patientmanagementsystem;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import sunder.admin.patientmanagementsystem.CustomViewPager.CustomViewPager;
import sunder.admin.patientmanagementsystem.fragment.DoctorLoginFragment;
import sunder.admin.patientmanagementsystem.fragment.DoctorPatientEmergencyUpcomingFragment;
import sunder.admin.patientmanagementsystem.fragment.DoctorPatientListFragment;
import sunder.admin.patientmanagementsystem.fragment.DoctorPatientTypeFragment;
import sunder.admin.patientmanagementsystem.fragment.HomeFragment;
import sunder.admin.patientmanagementsystem.fragment.PatientDetailsFragment;
import sunder.admin.patientmanagementsystem.fragment.PatientExistingFragment;
import sunder.admin.patientmanagementsystem.fragment.PatientListFragment;
import sunder.admin.patientmanagementsystem.fragment.PatientLoginFragment;
import sunder.admin.patientmanagementsystem.fragment.PatientTrackRecordDetailsFragment;
import sunder.admin.patientmanagementsystem.fragment.PatientTrackRecordListFragment;
import sunder.admin.patientmanagementsystem.fragment.PatientTypeFragment;


public class PMSMainActivity extends AppCompatActivity {
    // private Toolbar toolbar;
    private TabLayout tabLayout;
    public CustomViewPager viewPager;
    public ViewPagerAdapter adapter;
    TextView tv_toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pms);
        //   toolbar=findViewById(R.id.toolbar);
        //  tv_toolbar=findViewById(R.id.tv_toolbar);
        viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        viewPager.setPagingEnabled(false);






      /*  if (viewPager.getCurrentItem() == 0) {
            tv_toolbar.setText("Hi");
        } else if(viewPager.getCurrentItem()==1) {
            tv_toolbar.setText("Hi1");
        } else if(viewPager.getCurrentItem()==2) {
            tv_toolbar.setText("Hi2");
        } else if(viewPager.getCurrentItem()==3) {
            tv_toolbar.setText("Hi3");
        } else if(viewPager.getCurrentItem()==4) {
            tv_toolbar.setText("Hi4");
        }
        tabLayout = findViewById(R.id.tabs);*/
        //tabLayout.setupWithViewPager(viewPager);
        /*tabLayout = findViewById(R.id.tabs);*/
        /*toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (viewPager.getCurrentItem() == 1) {
                    viewPager.setCurrentItem(viewPager.getCurrentItem() - 1, false);
                } else if(viewPager.getCurrentItem()==2) {
                    viewPager.setCurrentItem(viewPager.getCurrentItem() - 2, false);
                } else if(viewPager.getCurrentItem()==3) {
                    viewPager.setCurrentItem(viewPager.getCurrentItem() - 3, false);
                }else{
                    finish();
                }
            }
        });*/

        //diasable tablayout
       /* LinearLayout tabStrip = ((LinearLayout) tabLayout.getChildAt(0));
        tabStrip.setEnabled(false);
        for (int i = 0; i < tabStrip.getChildCount(); i++) {
            tabStrip.getChildAt(i).setClickable(false);
            tv_toolbar.setText("Hi"+i);
        }*/
    }

    private void setupViewPager(ViewPager viewPager) {
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(), "");
        adapter.addFragment(new PatientLoginFragment(), "");
        adapter.addFragment(new PatientTypeFragment(), "");
        adapter.addFragment(new PatientDetailsFragment(), "");
        adapter.addFragment(new PatientExistingFragment(), "");
        adapter.addFragment(new PatientTrackRecordListFragment(), "");
        adapter.addFragment(new PatientTrackRecordDetailsFragment(), "");
        adapter.addFragment(new PatientListFragment(), "");
        adapter.addFragment(new DoctorPatientListFragment(), "");
        adapter.addFragment(new DoctorLoginFragment(), "");
        adapter.addFragment(new DoctorPatientTypeFragment(), "");
        adapter.addFragment(new DoctorPatientEmergencyUpcomingFragment(), "");
        viewPager.setAdapter(adapter);

    }

   /* @Override
    public void sendData(String id,String message,String name) {
        String tag = "android:switcher:" + R.id.viewpager + ":" + 3;
        VMSDetailsFragment f = (VMSDetailsFragment) getSupportFragmentManager().findFragmentByTag(tag);
        f.displayReceivedData(id,message,name);
    }

    @Override
    public void sendDataDetails(String name, String total, String flat,String image) {
        String tag = "android:switcher:" + R.id.viewpager + ":" + 5;
        VMSGatePassFragment f1 = (VMSGatePassFragment) getSupportFragmentManager().findFragmentByTag(tag);
        f1.displayReceivedDataDetails(name,total,flat,image);
    }


    @Override
    public void sendDataSocietyName(String name) {
        String tag = "android:switcher:" + R.id.viewpager + ":" + 1;
        VMSHomeFragment f1 = (VMSHomeFragment) getSupportFragmentManager().findFragmentByTag(tag);
        f1.displayReceivedDataSocietyName(name);
    }



    @Override
    public void sendDataSocietyNameforMobile(String name) {
        String tag = "android:switcher:" + R.id.viewpager + ":" + 2;
        VMSMobileFragment f1 = (VMSMobileFragment) getSupportFragmentManager().findFragmentByTag(tag);
        f1.displayReceivedDataSocietyNameforMobile(name);
    }
*/


    public class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // todo: goto back activity from here
               /* Intent intent = new Intent(VMSReceptionActivity.this, SecurityHomeLoginActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();*/
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 1) {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1, false);
        } else if (viewPager.getCurrentItem() == 2) {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1, false);
        } else if (viewPager.getCurrentItem() == 3) {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 3, false);
        } else if (viewPager.getCurrentItem() == 4) {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 4, false);
        } else if (viewPager.getCurrentItem() == 5) {
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 5, false);
        } else {

            AlertDialog.Builder build = new AlertDialog.Builder(PMSMainActivity.this);
            build.setTitle("Confirmation");
            build.setMessage("Kindly Rate it with 5 star to support our hard work.");
            build.setCancelable(true);
            build.setPositiveButton("Rate", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=sunder.com.khstm.iiieyevmsreception.sunder.sharma")));
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

}

