package com.example.solene.galidog;

import com.google.android.gms.maps.model.LatLng;

public class Point {

    private LatLng coordonnees;
    private int idPoint;
    private static int id = 0;
    private int idCommande;

    public Point() {
        this.idPoint = id ++;
    }

    public Point(LatLng coordonnees, int idCommande) {
        this.coordonnees = coordonnees;
        this.idCommande = idCommande ;
        this.idPoint = id ++;
    }

    public LatLng getCoordonnees() {
        return coordonnees;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setCoordonnees(LatLng coordonnees) {
        this.coordonnees = coordonnees;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
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
                ", idCommande=" + idCommande +
                '}';
    }
}
