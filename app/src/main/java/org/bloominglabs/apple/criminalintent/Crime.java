package org.bloominglabs.apple.criminalintent;

import java.util.UUID;

/**
 * Created by apple on 11/22/15.
 *
 */


public class Crime {

    private UUID    mId;
    private String mTitle;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Crime (){
        //generate unique identifier
        mId = UUID.randomUUID();
    }

}
