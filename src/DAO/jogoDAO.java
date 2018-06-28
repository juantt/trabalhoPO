/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.ConnectionFactory;
import model.Jogo;

/**
 *
 * @author Marinke
 */
public class jogoDAO {
    PreparedStatement ps = null;
    private static Connection conexao;

    public jogoDAO(){
        try {
            conexao = ConnectionFactory.conectar();
        } catch (Exception ex) {
            Logger.getLogger(jogoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<String> findAllNames() {
        //banco de dados
        Jogo j1 = new Jogo(1, "PC","asdads");
        Jogo j2 = new Jogo(2, "PS4","asdasd");

        List jogos = new ArrayList<Jogo>();
        jogos.add(j1.getNome());
        jogos.add(j2.getNome());
        
        return jogos;
    }
    
    public List<Jogo> findAll() {
        Jogo j1 = new Jogo(1, "PC", "qweqwe");
        Jogo j2 = new Jogo(10, "PS4", "ASDASD");

        List jogos = new ArrayList<Jogo>();
        jogos.add(j1);
        jogos.add(j2);
        
        return jogos;
    }
    
    public boolean salvar(Jogo c1) {
        return true;
    }

   public void inserirjOGO(int CODJOGO, String NOMEJOGO, String CATJOGO) {
        try {
            conexao = ConnectionFactory.conectar();
            String sql = "insert into jogos (CODJOGO, NOMEJOGO, CATJOGO) values(?,?,?)";
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, CODJOGO);
            ps.setString(2, NOMEJOGO);
            ps.setString(3, CATJOGO);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Incluido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao incluir!");
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public ResultSet obterJogos() {
        ResultSet rs = null;
        try {
           conexao = ConnectionFactory.conectar();
            String sql = "select * from jogos";
            PreparedStatement ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("Erro ao obter jogos");
            System.out.println(e.getMessage());
        }
        return rs;
    }

   
    
    
    
}
