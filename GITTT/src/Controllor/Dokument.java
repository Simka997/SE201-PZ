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
public class Dokument {

    private String izvestaj;

    public Dokument() {
    }

    public Dokument(String izestaj) {
        this.izvestaj = izestaj;
    }

    public String getIzvestaj() {
        return izvestaj;
    }

    public void napraviDokumentovaniZapis(String izestaj) {
        this.izvestaj = izestaj;
    }

    @Override
    public String toString() {
        return "Dokument{" + "izestaj=" + izvestaj + '}';
    }

}
