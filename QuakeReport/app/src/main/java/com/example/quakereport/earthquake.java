package com.example.quakereport;

public class earthquake {

    private double mMagnitude;
    private long mTimeInMillisec;
    private String mLocation;
    private String mURL;

    public earthquake(double Magnitude,long Date,String Location,String url)
    {
        mMagnitude = Magnitude;
        mLocation = Location;
        mTimeInMillisec = Date;
        mURL = url;
    }

    public  String getmURL()
    {
        return mURL;
    }
    public double getmMagnitude() {
        return mMagnitude;
    }

    public long getmDate()
    {
        return mTimeInMillisec;
    }
    public String getmLocation()
    {
        return mLocation;
    }
}
