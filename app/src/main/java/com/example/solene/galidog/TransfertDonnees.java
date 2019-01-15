package com.example.solene.galidog;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class TransfertDonnees implements Parcelable {

    private CommandeVocale[] listeCommandes;
    private Point[] listePoints;
    private int indicePoint;


    public TransfertDonnees(CommandeVocale[] comVoc, Point[] pt) {
        this.listeCommandes = comVoc;
        this.listePoints = pt;
    }

    protected TransfertDonnees(Parcel in) {
    }

    public static final Creator<TransfertDonnees> CREATOR = new Creator<TransfertDonnees>() {
        @Override
        public TransfertDonnees createFromParcel(Parcel in) {
            return new TransfertDonnees(in);
        }

        @Override
        public TransfertDonnees[] newArray(int size) {
            return new TransfertDonnees[size];
        }
    };

    public CommandeVocale[] getListeCommandes() {
        return listeCommandes;
    }

    public void setListeCommandes(CommandeVocale[] listeCommandes) {
        this.listeCommandes = listeCommandes;
    }

    public Point[] getListePoints() {
        return listePoints;
    }

    public void setListePoints(Point[] listePoints) {
        this.listePoints = listePoints;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeArray(listeCommandes);
        dest.writeArray(listePoints);
    }
}
