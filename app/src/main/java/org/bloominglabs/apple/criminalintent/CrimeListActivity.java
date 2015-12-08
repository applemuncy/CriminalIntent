package org.bloominglabs.apple.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by apple on 11/25/15.
 *
 */
public class CrimeListActivity extends  SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }

    @Override
    protected int getLayoutResId(){
        return R.layout.activity_masterdetail;
    }
}
