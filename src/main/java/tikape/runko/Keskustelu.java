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
public class Keskustelu {

    private Integer tunnus;
    private Integer aihealue;
    private String lähettäjän_nimimerkki;
    private String otsikko;

    public Keskustelu() {
    }

    public Keskustelu(Integer tunnus, String lähettäjän_nimimerkki, String otsikko) {
        this.tunnus = tunnus;
        this.aihealue = aihealue;
        this.lähettäjän_nimimerkki = lähettäjän_nimimerkki;
        this.otsikko = otsikko;
    }

    public Integer getTunnus() {
        return tunnus;
    }

    public void setTunnus(Integer tunnus) {
        this.tunnus = tunnus;
    }
    
    public Integer getAihealue() {
        return aihealue;
    }

    public void setAihealue(Integer aihealue) {
        this.aihealue = aihealue;
    }

    public String getLähettäjän_nimimerkki() {
        return lähettäjän_nimimerkki;
    }

    public void setLähettäjän_nimimerkki(String lähettäjän_nimimerkki) {
        this.lähettäjän_nimimerkki = lähettäjän_nimimerkki;
    }
    
    public String getOtsikko() {
        return otsikko;
    }
    
    public void setOtsikko(String otsikko) {
        this.otsikko = otsikko;
    }
}    

