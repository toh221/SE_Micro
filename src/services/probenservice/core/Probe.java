package services.probenservice.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Probe {

    ProbenId probennummer;
    String ort;
    Date datum;
    Collection<String> musikstuecke;
    Collection<String> teilnehmer;

    public Probe() {

    }

    public Probe(ProbenId nummer, String ort, Date datum) {
        this.probennummer = nummer;
        this.ort = ort;
        this.datum = datum;
        this.musikstuecke = new ArrayList<String>();
        this.teilnehmer = new ArrayList<String>();
    }

    public ProbenId getProbennummer() {
        return probennummer;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getOrt() {
        return ort;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Date getDatum() {
        return this.datum;
    }

    public Collection<String> getTeilnehmer() {
        return this.teilnehmer;
    }

    public void addTeilnehmer(String teilnehmer) {
        this.teilnehmer.add(teilnehmer);
    }

    public Collection<String> getMusikstuecke() {
        return this.teilnehmer;
    }

    public void addMusikstuecke(String musikstueck) {
        this.musikstuecke.add(musikstueck);
    }
}