package org.bloominglabs.apple.criminalintent;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


import org.bloominglabs.apple.criminalintent.database.CrimeBaseHelper;
import org.bloominglabs.apple.criminalintent.database.CrimeDbSchema.CrimeTable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.bloominglabs.apple.criminalintent.database.CrimeDbSchema.CrimeTable.*;

/**
 * Created by apple on 11/24/15.
 *
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;

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

    }

    public List<Crime> getCrimes(){

        return new ArrayList<>();
    }

    public Crime getCrime(UUID id){

        return null;
    }

    public void addCrime(Crime c){

        ContentValues values = getContentValues(c);
        mDatabase.insert(CrimeTable.NAME, null, values);

    }

    public void updateCrime(Crime crime){

        String uuidString = crime.getId().toString();
        ContentValues values = getContentValues(crime);

        mDatabase.update(CrimeTable.NAME, values,
                Cols.UUID + " ?",
                new String[]{ uuidString });

    }

    private static ContentValues getContentValues(Crime crime){

        ContentValues values = new ContentValues();
        values.put(Cols.UUID, crime.getId().toString());
        values.put(Cols.TITLE, crime.getTitle());
        values.put(Cols.DATE, crime.getDate().getTime());
        values.put(Cols.SOLVED, crime.isSolved()? 1 : 0);

        return values;

    }
}
