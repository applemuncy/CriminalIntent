package org.bloominglabs.apple.criminalintent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import org.bloominglabs.apple.criminalintent.database.CrimeBaseHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by apple on 11/24/15.
 *
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;

    private List<Crime> mCrimes;
    private Context mContext;
    private SQLiteDatabase mDatabase;

    public static CrimeLab get(Context context){
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }
    private CrimeLab(Context context){
        mContext = context.getApplicationContext();
        mDatabase = new CrimeBaseHelper(mContext)
                .getWritableDatabase();
        mCrimes = new ArrayList<>();

    }

    public List<Crime> getCrimes(){
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for ( Crime crime : mCrimes){
            if (crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }

    public void addCrime(Crime c){
        mCrimes.add(c);
    }
}
