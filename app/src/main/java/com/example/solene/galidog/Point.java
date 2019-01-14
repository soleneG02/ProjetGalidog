package com.example.solene.galidog;

import com.google.android.gms.maps.model.LatLng;

public class Point {

    private LatLng coordonnees;
    private int idPoint;
    private static int id = 0;

    public Point(LatLng coordonnees) {
        this.coordonnees = coordonnees;
        this.idPoint = id ++;
    }

    public LatLng getCoordonnees() {
        return coordonnees;
    }

    public void setCoordonnees(LatLng coordonnees) {
        this.coordonnees = coordonnees;
    }

    public int getIdPoint() {
        return idPoint;
    }

    public void setIdPoint(int idPoint) {
        this.idPoint = idPoint;
    }

    @Override
    public String toString() {
        return "Point{" +
                "coordonnees=" + coordonnees +
                ", idPoint=" + idPoint +
                '}';
    }
}
