package com.mtheodorides.android.criminalintent;

import java.util.UUID;

/**
 * Created by Michael Theodorides on 12/22/2016.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getId() {
        return mId;
    }

    public Crime() {


        // Generate unique identifier
        mId = UUID.randomUUID();
    }
}
