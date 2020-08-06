/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

import connectionDB.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Batata
 */
public class ProdutoConecta {
    public List<Produto> read() throws ClassNotFoundException{
        
        Connection con = connection.getConnection();
        
        PreparedStatement prepare= null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try {
               String sql = "SELECT idproduto, nome, quantidade, quantidade_min FROM produtos";
               prepare = con.prepareStatement(sql);
               rs = prepare.executeQuery();
               
               while (rs.next()) {
                   
                   Produto produto =new Produto();
                   produto.setId(rs.getInt("idproduto"));
                   produto.setNome(rs.getString("nome"));
                   produtos.add(produto);
               }
        }
        catch (SQLException ex){
              Logger.getLogger(ProdutoConecta.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
        connection.closeConnection(con,prepare,rs);
        }
        return produtos;
    }
                
    }

