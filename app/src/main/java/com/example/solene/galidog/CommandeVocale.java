package com.example.solene.galidog;

import com.google.android.gms.maps.model.LatLng;

public class CommandeVocale {

    //private ? commande
    private int idCommande = 0;
    private LatLng coordonnees;

    public CommandeVocale(){
        this.idCommande ++;
    }

    public CommandeVocale(String direction, LatLng coord) {
        super();
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
}
