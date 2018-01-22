package Controllor;



class RadnickiCrtez {

    private String opis;
    private int brojCrteza;

    public RadnickiCrtez(String opis, int brojCrteza) {
        this.opis = opis;
        this.brojCrteza = brojCrteza;
    }

    public RadnickiCrtez() {
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getBrojCrteza() {
        return brojCrteza;
    }

    public void setBrojCrteza(int brojCrteza) {
        this.brojCrteza = brojCrteza;
    }

    @Override
    public String toString() {
        return "RadnickiCrtez{" + "opis=" + opis + ", brojCrteza=" + brojCrteza + '}';
    }

}
