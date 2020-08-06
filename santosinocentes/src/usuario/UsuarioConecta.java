/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import connectionDB.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author Guilherme
 */
public class UsuarioConecta extends Usuario{
    int action;
    
    public List<Usuario> read(String nomeDB) throws SQLException, ClassNotFoundException {  
        Connection con = connection.getConnection();
        PreparedStatement prepare = null;
        Statement st = con.createStatement();
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();
        try{
            String sql = "INSERT INTO usuarios values(idproduto, nome)";
            prepare = con.prepareStatement(sql);
            rs = prepare.executeQuery();
            Usuario usuario = new Usuario();
            usuario.setIdusuario(1);
            usuario.setNome(nomeDB);
            prepare.execute();
            //rs = prepare.executeQuery();
        }catch (SQLException ex) {
            Logger.getLogger(UsuarioConecta.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            connection.closeConnection(con, prepare, rs);
        }
        return usuarios;
    }
}
