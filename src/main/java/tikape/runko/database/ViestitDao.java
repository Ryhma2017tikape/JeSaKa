/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tikape.runko.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tikape.runko.Viesti;

public class ViestitDao implements Dao<Viesti, Integer> {

    private Database database;

    public ViestitDao(Database database) {
        this.database = database;
    }

    @Override
    public Viesti findOne(Integer key) throws SQLException {
        Connection connection = database.getConnection();
        PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Viestit WHERE tunnus = ?");
        stmt.setObject(1, key);

        ResultSet rs = stmt.executeQuery();
        boolean hasOne = rs.next();
        if (!hasOne) {
            return null;
        }

        Integer tunnus = rs.getInt("tunnus");
        String lähettäjän_nimimerkki = rs.getString("lähettäjän_nimimerkki");
        String sisältö = rs.getString("sisältö");
        String aika = rs.getString("aika");

        Viesti o = new Viesti(tunnus, lähettäjän_nimimerkki, sisältö, aika);

        rs.close();
        stmt.close();
        connection.close();

        return o;
    }

    @Override
    public List<Viesti> findAll() throws SQLException {

        Connection connection = database.getConnection();
        PreparedStatement stmt = connection.prepareStatement("SELECT * FROM Viestit");

        ResultSet rs = stmt.executeQuery();
        List<Viesti> viestit = new ArrayList<>();
        while (rs.next()) {
            Integer tunnus = rs.getInt("tunnus");
            String lähettäjän_nimimerkki = rs.getString("lähettäjän_nimimerkki");
            String sisältö = rs.getString("sisältö");
            String aika = rs.getString("aika");

            viestit.add(new Viesti(tunnus, lähettäjän_nimimerkki, sisältö, aika));
        }

        rs.close();
        stmt.close();
        connection.close();

        return viestit;
    }

    @Override
    public void delete(Integer key) throws SQLException {
        // ei toteutettu
    }

}
