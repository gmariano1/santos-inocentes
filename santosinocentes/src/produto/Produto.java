/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

/**
 *
 * @author Batata
 */
public class Produto {
    private int id;
    private String nome;
    private int qtd;
    private int min_qtd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getMin_qtd() {
        return min_qtd;
    }

    public void setMin_qtd(int min_qtd) {
        this.min_qtd = min_qtd;
    }
    
}
