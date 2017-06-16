/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tikape.runko;

/**
 *
 * @author jmkivine
 */
public class Aihealue {

    private Integer tunnus;
    private String nimi;
    private String kuvaus;

    public Aihealue() {
    }

    public Aihealue(Integer tunnus, String nimi, String kuvaus) {
        this.tunnus = tunnus;
        this.nimi = nimi;
        this.kuvaus = kuvaus;
    }

    public Integer getTunnus() {
        return tunnus;
    }

    public void setTunnus(Integer tunnus) {
        this.tunnus = tunnus;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public String getKuvaus() {
        return kuvaus;
    }
    
    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }
}    

