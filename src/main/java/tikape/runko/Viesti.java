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
public class Viesti {

    private Integer tunnus;
    private Integer keskustelu;
    private String lähettäjän_nimimerkki;
    private String sisältö;
    private String aika;

    public Viesti() {
    }

    public Viesti(Integer tunnus, String lähettäjän_nimimerkki, String sisältö, String aika) {
        this.tunnus = tunnus;
        this.keskustelu = keskustelu;
        this.lähettäjän_nimimerkki = lähettäjän_nimimerkki;
        this.sisältö = sisältö;
        this.aika = aika;
    }

    public Integer getTunnus() {
        return tunnus;
    }

    public void setTunnus(Integer tunnus) {
        this.tunnus = tunnus;
    }
    
    public Integer getKeskustelu() {
        return keskustelu;
    }

    public void setKeskustelu(Integer keskustelu) {
        this.keskustelu = keskustelu;
    }

    public String getNimi() {
        return lähettäjän_nimimerkki;
    }

    public void setNimi(String lähettäjän_nimimerkki) {
        this.lähettäjän_nimimerkki = lähettäjän_nimimerkki;
    }
    
    public String getKuvaus() {
        return sisältö;
    }
    
    public void setKuvaus(String sisältö) {
        this.sisältö = sisältö;
    }
    public String getAika() {
        return aika;
    }
    
    public void setAika(String aika) {
        this.aika = aika;
    }
}    

