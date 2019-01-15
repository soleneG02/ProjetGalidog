package com.example.solene.galidog;

import android.media.MediaPlayer;

import com.google.android.gms.maps.model.LatLng;

public class CommandeVocale {

    private MediaPlayer commandeMP3;
    private int idCommande;
    private static int id = 0;
    private LatLng coordonnees;

    public CommandeVocale(String direction, LatLng coord) {
        this.idCommande = id ++;
        this.coordonnees = coord;
        if (direction == "D") {
            //commande = droite
        }
        else if (direction == "G") {
            //commande = gauche
        }
        else if (direction == "H") {
            //commande = halte
        }
        else if (direction == "A") {
            //commande = autre
        }
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int indiceCommande) {
        this.idCommande = indiceCommande;
    }

    public LatLng getCoordonnees() {
        return coordonnees;
    }

    public void setCoordonnees(LatLng coordonnees) {
        this.coordonnees = coordonnees;
    }

    @Override
    public String toString() {
        return "CommandeVocale{" +
                "idCommande=" + idCommande +
                ", coordonnees=" + coordonnees +
                '}';
    }
}

