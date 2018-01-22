/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllor;

import Controllor.IKorisnikAkcije;

/**
 *
 * @author sm
 */
public class Korisnik implements IKorisnikAkcije{
  

   private String username;
   private int sektorRada;
   private String lozinka;

    public Korisnik(String username, int sektorRada, String lozinka) {
        this.username = username;
        this.sektorRada = sektorRada;
        this.lozinka = lozinka;
    }

    public Korisnik() {
    }

    @Override
    public boolean evidentirajPoscetakRadnogVremena(String s) {
        return true;
    }

    @Override
    public boolean evidentirajVremeIzlaskaNaTeren(String s) {
        return true;
    }

    @Override
    public boolean evidentirajKrajRadnogVremena(String s) {return true;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSektorRada() {
        return sektorRada;
    }

    public void setSektorRada(int sektorRada) {
        this.sektorRada = sektorRada;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    @Override
    public String toString() {
        return "Korisnik{" + "username=" + username + ", sektorRada=" + sektorRada + ", lozinka=" + lozinka + '}';
    }
   
   

}

