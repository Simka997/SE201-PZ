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
public class Materijal {

    private String specificiraniMaterijal;

    public Materijal() {
    }

    public Materijal(String specificiraniMaterijal) {
        this.specificiraniMaterijal = specificiraniMaterijal;
    }

    public String getSpecificiraniMaterijal() {
        return specificiraniMaterijal;
    }

    public void setSpecificiraniMaterijal(String specificiraniMaterijal) {
        this.specificiraniMaterijal = specificiraniMaterijal;
    }

    @Override
    public String toString() {
        return "Materijal{" + "specificiraniMaterijal=" + specificiraniMaterijal + '}';
    }

}
