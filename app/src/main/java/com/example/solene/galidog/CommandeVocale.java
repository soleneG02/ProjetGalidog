package com.example.solene.galidog;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.net.Uri;

import com.google.android.gms.maps.model.LatLng;

import java.io.IOException;

public class CommandeVocale {

    private MediaPlayer commandeMP3;
    private int idCommande;
    private static int id = 0;
    private LatLng coordonnees;

    public CommandeVocale(String direction, LatLng coord, Context context) throws IOException {
        this.idCommande = id ++;
        this.coordonnees = coord;
        if (direction == "D") {
            commandeMP3 = MediaPlayer.create(context, R.raw.droite);
            commandeMP3.start();
        }
        else if (direction == "G") {
            commandeMP3 = MediaPlayer.create(context, R.raw.gauche);
            commandeMP3.start();
        }
        else if (direction == "H") {
            commandeMP3 = MediaPlayer.create(context, R.raw.halte);
            commandeMP3.start();
        }
        else if (direction == "A") {
            commandeMP3 = MediaPlayer.create(context, R.raw.activez);
            commandeMP3.start();
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

    public MediaPlayer getCommandeMP3() {
        return commandeMP3;
    }

    public void setCommandeMP3(MediaPlayer commandeMP3) {
        this.commandeMP3 = commandeMP3;
    }

    @Override
    public String toString() {
        return "CommandeVocale{" +
                "idCommande=" + idCommande +
                ", coordonnees=" + coordonnees +
                '}';
    }
}
