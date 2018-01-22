/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllor;

import java.util.Date;

public class RadniNalog {

    private String preduzece;
    private String sektor;
    private String odgovornoLice;
    private int redniBrojNaloga;
    private Date darumKreiranja;
    private String mesto;
    private String porucilacUsluge;
    private String opisRadnogNaloga;
    private boolean statusRadnogNaloga;

    public void kreirajRadniNalog() {
    }


    public RadniNalog() {
    }

    public String getPreduzece() {
        return preduzece;
    }

    public void setPreduzece(String newPreduzece) {
        preduzece = newPreduzece;
    }

    public String getSektor() {
        return sektor;
    }

    public void setSektor(String newSektor) {
        sektor = newSektor;
    }

    public String getOdgovornoLice() {
        return odgovornoLice;
    }

    public void setOdgovornoLice(String newOdgovornoLice) {
        odgovornoLice = newOdgovornoLice;
    }

    public int getRedniBrojNaloga() {
        return redniBrojNaloga;
    }

    public void setRedniBrojNaloga(int newRedniBrojNaloga) {
        redniBrojNaloga = newRedniBrojNaloga;
    }

    public Date getDarumKreiranja() {
        return darumKreiranja;
    }

    public void setDarumKreiranja(Date newDarumKreiranja) {
        darumKreiranja = newDarumKreiranja;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String newMesto) {
        mesto = newMesto;
    }

    public String getPorucilacUsluge() {
        return porucilacUsluge;
    }

    public void setPorucilacUsluge(String newPorucilacUsluge) {
        porucilacUsluge = newPorucilacUsluge;
    }

    public String getOpisRadnogNaloga() {
        return opisRadnogNaloga;
    }

    public void setOpisRadnogNaloga(String newOpisRadnogNaloga) {
        opisRadnogNaloga = newOpisRadnogNaloga;
    }

    public boolean getStatusRadnogNaloga() {
        return statusRadnogNaloga;
    }

    public static boolean isValidDate(String datum) {
        int year, day, month;

        if (datum == null || datum.length() != "yyyy/MM/dd".length()) {
            return false;
        }

        try {
            year = Integer.parseInt(datum.substring(0, datum.indexOf("/")));
            month = Integer.parseInt(datum.substring(datum.indexOf("/") + 1, datum.lastIndexOf("/")));
            day = Integer.parseInt(datum.substring(datum.lastIndexOf("/") + 1));;
        } catch (NumberFormatException e) {
            return false;
        }

        // izračunavanje prelaznih godina nije važilo pre 1581
        boolean yearOk = (year >= 1581) && (year <= 2500);
        boolean monthOk = (month >= 1) && (month <= 12);
        boolean dayOk = (day >= 1) && (day <= daysInMonth(year, month));

        return (yearOk && monthOk && dayOk);
    }

    private static int daysInMonth(int year, int month) {
        int daysInMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 2:
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                daysInMonth = 30;
        }
        return daysInMonth;
    }
}
