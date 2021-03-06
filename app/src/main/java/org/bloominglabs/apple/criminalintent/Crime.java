package org.bloominglabs.apple.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by apple on 11/22/15.
 *
 */


public class Crime {

    private UUID    mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }



    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Crime (){
        //generate unique identifier
        this(UUID.randomUUID());

    }

    public Crime(UUID id){
        mId = id;
        mDate = new Date();
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public  String getPhotoFilename(){
        return "IMG_" + getId().toString() + ".jpg";
    }

}
