/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;
import Controllor.RadniNalog;

/**
 *
 * @author sm
 */
public class BazaPodataka {

    private static Connection conector = null;
    private static String url = "jdbc:mysql://localhost/se201-projekat";
    private static String query = "";
    private static Statement st;

    public static void konekcija() {
        try {
            conector = DriverManager.getConnection(url, "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(BazaPodataka.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void sacuvajRadniNalog(RadniNalog s) {
        try {
            query = "INSERT INTO nalog('ime','prezime') VALUES(?,?)";
            PreparedStatement ps = conector.prepareStatement(query);
            ps.setString(1, s.getMesto());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BazaPodataka.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    ;

    public void sacuvajDolazakNaPosao(String s) {
        try {
            query = "INSERT INTO dolazak('vreme') VALUES(?)";
            PreparedStatement ps = conector.prepareStatement(query);
            ps.setString(1, s);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BazaPodataka.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    ;
      public void sacuvajVremeIzlaskaNaTeren(String s) {
        try {
            query "INSERT INTO teren('vreme') VALUES(?)";
            PreparedStatement ps = conector.prepareStatement(query);
            ps.setString(1, s);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BazaPodataka.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ;
        public void sacuvajKrajRadnogVremena(String s) {
        try {
            query = ""INSERT INTO izlazak('vreme') VALUES(?)"";
            PreparedStatement ps = conector.prepareStatement(query);
            ps.setString(1, s);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BazaPodataka.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
        public RadniNalog getRadniNalogSaID(int redniBrojRN){
        RadniNalog rn = null;
        query = "SELECT * from radni nalog where id=?";
        try {
            Statement s = conector.createStatement();
            ResultSet sr = s.executeQuery(query);
            while (sr.next()) {
               // rn = new RadniNalog(sr.getString(1), sr.getString(2), sr.getString(3), sr.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BazaPodataka.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rn;
        
        }
;
        public ArrayList<RadniNalog> pokupiRadneNaloge(){
        query = "SELECT * FROM radniNalog";
        ArrayList<RadniNalog> listaRadnihNaloga = new ArrayList<>();
        try{
            conector = DriverManager.getConnection(url, "root", "");
            st = conector.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
               int id = rs.getInt("NastavnikID");
               String ime = rs.getString("imeN");
               String prezime = rs.getString("prezimeN");
               String zvanje = rs.getString("zvanjeN");
//               listaRadnihNaloga.add(new RadniNalog(*****));
            }
            conector.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return listaRadnihNaloga;
    
    }
         public static int login(String username, String password) {
        int p = 0;
        query = "select ovlascen from radno_mesto inner join zaduzenje on radno_mesto.RM_ID=zaduzenje.RM_ID where zaduzenje.ZADUZENJE_ID like(SELECT nalog.ZADUZENJE_ID from nalog where (nalog.USERNAME like ?) and (nalog.PASSWORD like ?));";
        try {
            PreparedStatement ps = conector.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                p = rs.getInt("sektor");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BazaPodataka.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

      /* public static void sacuvajRadnickiCrtez(String rc){
        
         try {
            query = "INSERT INTO `evidencija_porudzbine` (`ID_OSOBA`, `DATUM`) VALUES (?, ?)";
            PreparedStatement ps = conector.prepareStatement(query);
            ps.setInt(1, );
            ps.setDate(2, );
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BazaPodataka.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
       public static void sacuvajMaterijal(String mater){
        
         try {
            query = "INSERT INTO `evidencija_porudzbine` (`ID_OSOBA`, `DATUM`) VALUES (?, ?)";
            PreparedStatement ps = conector.prepareStatement(query);
            
            ps.setString(2, );
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BazaPodataka.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
       public static void sacuvajIzvestaj(String izv){
        
         try {
            query = "INSERT INTO `evidencija_porudzbine` (`ID_OSOBA`, `DATUM`) VALUES (?, ?)";
            PreparedStatement ps = conector.prepareStatement(query);
            
            ps.setString(2, );
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BazaPodataka.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }*/
}
