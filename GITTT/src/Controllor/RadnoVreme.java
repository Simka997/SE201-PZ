/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllor;

/**
 *
 * @author sm
 */
public class RadnoVreme {

    private String pocetakRadnogVremena;
    private String vremeIzlaskaNaTeren;
    private String krajRadnogVremena;

    public RadnoVreme() {
    }

    public RadnoVreme(String pocetakRadnogVremena, String vremeIzlaskaNaTeren, String krajRadnogVremena) {
        this.pocetakRadnogVremena = pocetakRadnogVremena;
        this.vremeIzlaskaNaTeren = vremeIzlaskaNaTeren;
        this.krajRadnogVremena = krajRadnogVremena;
    }

    public String getPocetakRadnogVremena() {
        return pocetakRadnogVremena;
    }

    public void setPocetakRadnogVremena(String pocetakRadnogVremena) {
        this.pocetakRadnogVremena = pocetakRadnogVremena;
    }

    public String getVremeIzlaskaNaTeren() {
        return vremeIzlaskaNaTeren;
    }

    public void setVremeIzlaskaNaTeren(String vremeIzlaskaNaTeren) {
        this.vremeIzlaskaNaTeren = vremeIzlaskaNaTeren;
    }

    public String getKrajRadnogVremena() {
        return krajRadnogVremena;
    }

    public void setKrajRadnogVremena(String krajRadnogVremena) {
        this.krajRadnogVremena = krajRadnogVremena;
    }

    @Override
    public String toString() {
        return "RadnoVreme{" + "pocetakRadnogVremena=" + pocetakRadnogVremena + ", vremeIzlaskaNaTeren=" + vremeIzlaskaNaTeren + ", krajRadnogVremena=" + krajRadnogVremena + '}';
    }

 
}
