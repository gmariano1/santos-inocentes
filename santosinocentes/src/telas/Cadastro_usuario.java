/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;
import connectionDB.connection;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import usuario.Usuario;
import usuario.UsuarioConecta;

/**
 *
 * @author Pedro Humberto Sylvestre Nunes, Guilherme Mendes Mariano, Jorge Danillo Pereira, Jaffer da Silva Camacam Santos e Alexandre Morais Borges
 */
public class Cadastro_usuario extends javax.swing.JFrame {
    String cpflogin;
    String senhalogin;
    private static final String URL = "jdbc:mysql://localhost:3306/santos_inocentes?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "ong";
    private static final String PASS = "santos123@";
    /**
     * Creates new form NewJFrame
     */
    public Cadastro_usuario() {
        setResizable(false);
        initComponents();
        cpf.setToolTipText("CPF deve conter 11 dígitos númericos como: 111.222.333-45");
        nascimento.setToolTipText("Data de Nascimento deve conter 8 dígitos númericos como: 01/01/1900");
        telefone.setToolTipText("Telefone deve conter DDD e 8 dígitos númericos como: (61) 3000-1111");
        senha.setToolTipText("A senha deve possuir no mínimo 8 dígitos.");
        nome.setToolTipText("Digite o nome do usuário.");
        email.setToolTipText("Exemplo de E-mail: usuario@provedor.com");
        celular.setToolTipText("Celular deve conter DDD e 9 dígitos númericos como: (61)91111-1111");
        jComboBox1.addItem("Administrador");
        jComboBox1.addItem("Usuário");
        setIcon();
        this.setTitle("Controle de Estoque - Cadastro");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jL_Cpf = new javax.swing.JLabel();
        jL_CADASTRO = new javax.swing.JLabel();
        jL_Nome = new javax.swing.JLabel();
        jL_telefone = new javax.swing.JLabel();
        jL_nacimento = new javax.swing.JLabel();
        jL_Senha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jL_Celular = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jB_Voltar = new javax.swing.JButton();
        cpf = new javax.swing.JFormattedTextField();
        nascimento = new javax.swing.JFormattedTextField();
        celular = new javax.swing.JFormattedTextField();
        telefone = new javax.swing.JFormattedTextField();
        senha = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        confirma = new javax.swing.JPasswordField();
        jL_ComfirmacaoSenha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jB_Cadastro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jL_Cpf.setBackground(new java.awt.Color(204, 204, 204));
        jL_Cpf.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_Cpf.setForeground(new java.awt.Color(51, 51, 51));
        jL_Cpf.setText("CPF:");

        jL_CADASTRO.setBackground(new java.awt.Color(204, 204, 204));
        jL_CADASTRO.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_CADASTRO.setForeground(new java.awt.Color(51, 51, 51));
        jL_CADASTRO.setText("Cadastro");
        jL_CADASTRO.setMaximumSize(new java.awt.Dimension(63, 17));
        jL_CADASTRO.setMinimumSize(new java.awt.Dimension(63, 17));
        jL_CADASTRO.setPreferredSize(new java.awt.Dimension(63, 17));

        jL_Nome.setBackground(new java.awt.Color(204, 204, 204));
        jL_Nome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_Nome.setForeground(new java.awt.Color(51, 51, 51));
        jL_Nome.setText("Nome:");

        jL_telefone.setBackground(new java.awt.Color(204, 204, 204));
        jL_telefone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_telefone.setForeground(new java.awt.Color(51, 51, 51));
        jL_telefone.setText("Telefone:");

        jL_nacimento.setBackground(new java.awt.Color(204, 204, 204));
        jL_nacimento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_nacimento.setForeground(new java.awt.Color(51, 51, 51));
        jL_nacimento.setText("Data de Nascimento:");

        jL_Senha.setBackground(new java.awt.Color(204, 204, 204));
        jL_Senha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_Senha.setForeground(new java.awt.Color(51, 51, 51));
        jL_Senha.setText("Senha:");

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("E-mail:");

        jL_Celular.setBackground(new java.awt.Color(204, 204, 204));
        jL_Celular.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_Celular.setForeground(new java.awt.Color(51, 51, 51));
        jL_Celular.setText("Celular:");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jB_Voltar.setBackground(new java.awt.Color(204, 204, 204));
        jB_Voltar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jB_Voltar.setForeground(new java.awt.Color(0, 153, 255));
        jB_Voltar.setText("Voltar");
        jB_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_VoltarActionPerformed(evt);
            }
        });

        try{ MaskFormatter cpfFormatter = new MaskFormatter("###.###.###-##");
            cpfFormatter.setPlaceholderCharacter('_');
            cpf = new JFormattedTextField(cpfFormatter);
            cpfFormatter.setValidCharacters("0123456789");
            cpf.setColumns(14);
            cpf.setFocusLostBehavior(JFormattedTextField.COMMIT);

        }
        catch(Exception e){}
        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });

        try{ MaskFormatter bdayFormatter = new MaskFormatter("##/##/####");
            bdayFormatter.setPlaceholderCharacter('_');
            nascimento = new JFormattedTextField(bdayFormatter);
            bdayFormatter.setValidCharacters("0123456789");
            nascimento.setColumns(10);
            nascimento.setFocusLostBehavior(JFormattedTextField.COMMIT);

        }
        catch(Exception e){}
        nascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nascimentoActionPerformed(evt);
            }
        });

        try{ MaskFormatter number2Formatter = new MaskFormatter("(##)#####-####");
            number2Formatter.setPlaceholderCharacter('_');
            celular = new JFormattedTextField(number2Formatter);
            number2Formatter.setValidCharacters("0123456789");
            celular.setColumns(14);
            celular.setFocusLostBehavior(JFormattedTextField.COMMIT);

        }
        catch(Exception e){}
        celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularActionPerformed(evt);
            }
        });

        try{ MaskFormatter numberFormatter = new MaskFormatter("(##)####-####");
            numberFormatter.setPlaceholderCharacter('_');
            telefone = new JFormattedTextField(numberFormatter);
            numberFormatter.setValidCharacters("0123456789");
            telefone.setColumns(14);
            telefone.setFocusLostBehavior(JFormattedTextField.COMMIT);

        }
        catch(Exception e){}
        telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneActionPerformed(evt);
            }
        });

        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(220, 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/santos_4.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));
        jPanel4.setPreferredSize(new java.awt.Dimension(96, 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaActionPerformed(evt);
            }
        });

        jL_ComfirmacaoSenha.setBackground(new java.awt.Color(204, 204, 204));
        jL_ComfirmacaoSenha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_ComfirmacaoSenha.setForeground(new java.awt.Color(51, 51, 51));
        jL_ComfirmacaoSenha.setText("Confirmar Senha:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tipo de Usuário");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jB_Cadastro.setBackground(new java.awt.Color(204, 204, 204));
        jB_Cadastro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jB_Cadastro.setForeground(new java.awt.Color(0, 153, 255));
        jB_Cadastro.setText("Cadastrar");
        jB_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jL_nacimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jL_telefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jL_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2))
                        .addComponent(cpf)
                        .addComponent(senha)
                        .addComponent(jL_CADASTRO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jL_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_Celular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(confirma)
                        .addGap(33, 33, 33)
                        .addComponent(jB_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jB_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jL_ComfirmacaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(email)
                                .addGap(20, 20, 20)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(23, 23, 23)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jL_CADASTRO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jL_Cpf)
                                    .addComponent(jL_Nome)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpf)))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_nacimento)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nascimento)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_telefone)
                    .addComponent(jL_Celular))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celular)
                    .addComponent(telefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Senha)
                    .addComponent(jL_ComfirmacaoSenha))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jB_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed


                                               

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String cpfInsert = cpf.getText();
        String cpfInsert2 = cpfInsert.replace("-","");
        String cpfFinal = cpfInsert2.replace(".","");
        String nascimentoInsert = nascimento.getText();
        String nascimento1 = nascimentoInsert.substring(0,2);
        String nascimento2 = nascimentoInsert.substring(3,5);
        String nascimento3 = nascimentoInsert.substring(6);
        String nascimentoInsert2 = nascimento3 + nascimento2 + nascimento1;
        System.out.println(nascimentoInsert2);
        String nascimentoFinal = nascimentoInsert2.replace("/","");
        String telefoneInsert = telefone.getText();
        String telefoneInsert2 = telefoneInsert.replace("(","");
        String telefoneInsert3 = telefoneInsert2.replace("-","");
        String telefoneFinal = telefoneInsert3.replace(")","");
        String celularInsert = celular.getText();
        String celularInsert2 = celularInsert.replace("(","");
        String celularInsert3 = celularInsert2.replace("-","");
        String celularFinal = celularInsert3.replace(")","");
        String itemSelecionado = jComboBox1.getSelectedItem().toString();
        String nomeFinal = nome.getText();
        String emailFinal = email.getText();
        String senhaFinal = senha.getText();
        if (itemSelecionado.equals("Administrador")){
        String perfil = "a";
        try{
        Connection con = connection.getConnection();
        Statement st = con.createStatement();
        st.executeUpdate("INSERT INTO usuario(cpf,nome,email,perfil_usuario,data_nascimento,telefone,celular,senha) values ('"+cpfFinal+"','"+nomeFinal+"','"+emailFinal+"',"+perfil+"','"+nascimentoFinal+"','"+telefoneFinal+"','"+celularFinal+"','"+senhaFinal+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastro_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        if (itemSelecionado.equals("Usuario")){
        String perfil = "u";
        try{
        Connection con = connection.getConnection();
        Statement st = con.createStatement();
        st.executeUpdate("INSERT INTO usuario(cpf,nome,email,perfil_usuario,data_nascimento,telefone,celular,senha) values ('"+cpfFinal+"','"+nomeFinal+"','"+emailFinal+"',"+perfil+"','"+nascimentoFinal+"','"+telefoneFinal+"','"+celularFinal+"','"+senhaFinal+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastro_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
       

       Tela_Principal Tela_Principal = new Tela_Principal();
        Tela_Principal.setLocationRelativeTo(null);
        Tela_Principal.setVisible(true);
        Tela_Principal.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE ); 
        Tela_Principal.setResizable(false);
        this.dispose();
    }                                           

    private void jB_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_VoltarActionPerformed
        Tela_Principal Tela_Principal = new Tela_Principal();
        Tela_Principal.setLocationRelativeTo(null);
        Tela_Principal.setVisible(true);
        Tela_Principal.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE ); 
        Tela_Principal.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_jB_VoltarActionPerformed

    private void confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmaActionPerformed

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfActionPerformed

    private void nascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nascimentoActionPerformed

    private void celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celularActionPerformed

    private void telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jB_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CadastroActionPerformed
        String cpfInsert = cpf.getText();
        String cpfInsert2 = cpfInsert.replace("-","");
        String cpfFinal = cpfInsert2.replace(".","");
        String nascimentoInsert = nascimento.getText();
        String nascimento1 = nascimentoInsert.substring(0,2);
        String nascimento2 = nascimentoInsert.substring(3,5);
        String nascimento3 = nascimentoInsert.substring(6);
        String nascimentoInsert2 = nascimento3 + nascimento2 + nascimento1;
        System.out.println(nascimentoInsert2);
        String nascimentoFinal = nascimentoInsert2.replace("/","");
        String telefoneInsert = telefone.getText();
        String telefoneInsert2 = telefoneInsert.replace("(","");
        String telefoneInsert3 = telefoneInsert2.replace("-","");
        String telefoneFinal = telefoneInsert3.replace(")","");
        String celularInsert = celular.getText();
        String celularInsert2 = celularInsert.replace("(","");
        String celularInsert3 = celularInsert2.replace("-","");
        String celularFinal = celularInsert3.replace(")","");
        String itemSelecionado = jComboBox1.getSelectedItem().toString();
        String nomeFinal = nome.getText();
        String emailFinal = email.getText();
        String senhaFinal = senha.getText();
        if (itemSelecionado.equals("Administrador")){
        String perfil = "a";
        try{
        Connection con = connection.getConnection();
        Statement st = con.createStatement();
        st.executeUpdate("INSERT INTO usuario(cpf,nome,email,perfil_usuario,data_nascimento,telefone,celular,senha) values ('"+cpfFinal+"','"+nomeFinal+"','"+emailFinal+"','"+perfil+"','"+nascimentoFinal+"','"+telefoneFinal+"','"+celularFinal+"','"+senhaFinal+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastro_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else{
        String perfil = "u";
        try{
        Connection con = connection.getConnection();
        Statement st = con.createStatement();
        st.executeUpdate("INSERT INTO usuario(cpf,nome,email,perfil_usuario,data_nascimento,telefone,celular,senha) values ('"+cpfFinal+"','"+nomeFinal+"','"+emailFinal+"','"+perfil+"','"+nascimentoFinal+"','"+telefoneFinal+"','"+celularFinal+"','"+senhaFinal+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastro_usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        JOptionPane.showMessageDialog(null,"Concluído!");
    }//GEN-LAST:event_jB_CadastroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_usuario().setVisible(true);
            }
        });
    }
    
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Santos_2.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField celular;
    private javax.swing.JPasswordField confirma;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JButton jB_Cadastro;
    private javax.swing.JButton jB_Voltar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jL_CADASTRO;
    private javax.swing.JLabel jL_Celular;
    private javax.swing.JLabel jL_ComfirmacaoSenha;
    private javax.swing.JLabel jL_Cpf;
    private javax.swing.JLabel jL_Nome;
    private javax.swing.JLabel jL_Senha;
    private javax.swing.JLabel jL_nacimento;
    private javax.swing.JLabel jL_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JFormattedTextField nascimento;
    private javax.swing.JTextField nome;
    private javax.swing.JPasswordField senha;
    private javax.swing.JFormattedTextField telefone;
    // End of variables declaration//GEN-END:variables
}