package services.probenservice.core;
import services.benutzerservice.core.Benutzername;
import services.benutzerservice.core.type.BenutzerArt;

public class Benutzer {

    Benutzername benutzername;
    String vorname;
    String nachname;
    String passwort;
    BenutzerArt benutzerArt;

    public Benutzer() {

    }

    public Benutzer(Benutzername benutzername, String vorname, String nachname, String passwort, BenutzerArt benutzerArt) {
        this.benutzername = benutzername;
        this.vorname = vorname;
        this.nachname = nachname;
        this.passwort = passwort;
        this.benutzerArt = benutzerArt;
    }

    public void benutzerAendern(Benutzer benutzer, String vorname, String nachname) {
        benutzer.setVorname(vorname);
        benutzer.setNachname(nachname);
    }

    public Benutzername getBenutzername() {
        return benutzername;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public BenutzerArt getBenutzerArt() {
        return benutzerArt;
    }

    public void setBenutzerArt(BenutzerArt benutzerArt) {
        this.benutzerArt = benutzerArt;
    }
}