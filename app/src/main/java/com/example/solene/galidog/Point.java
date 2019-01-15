package com.example.solene.galidog;

import com.google.android.gms.maps.model.LatLng;

public class Point {

    private double latitude;
    private double longitude;
    private double idPoint;
    private static double id = 0;

    public Point(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.idPoint = id ++;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setIdPoint(double idPoint) {
        this.idPoint = idPoint;
    }

    public double getIdPoint() {
        return idPoint;
    }


}
