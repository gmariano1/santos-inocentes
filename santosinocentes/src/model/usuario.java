/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import connection.connection;
*/
/**
 *
 * @author Hakki
 */
/*public class usuario {
    public boolean checkLogin(String login, String senha) {

//        Connection con = connection.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

                
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.closeConnection(con, stmt, rs);
        }

        return check;

    }
}
*/