package org.bloominglabs.apple.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {

    public  static final String EXTRA_CRIME_ID =
            "org.bloominglabs.apple.criminalintent.crime_id" ;

    @Override
    protected Fragment createFragment(){
        return new CrimeFragment();
    }

    public static Intent newInent(Context packageContext, UUID crimeID){
        Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeID);
        return intent;
    }
}
