package com.example.android.touristguide;

/**
 * Created by lokesh on 27/6/16.
 */
public class Location {

    private String mLocatioName;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Location(String locationName) {
        mLocatioName = locationName;

    }

    public Location(String locationName,int imageResourceId) {
        mLocatioName = locationName;
        mImageResourceId = imageResourceId;
    }
    public String getLocationName() {
        return mLocatioName;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage() {
                return mImageResourceId != NO_IMAGE_PROVIDED;
          }

}
