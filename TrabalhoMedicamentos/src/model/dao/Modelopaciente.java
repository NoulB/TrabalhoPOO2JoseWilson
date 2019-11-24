/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Medicamento;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Substancias;
import model.bean.Med_tipo;
import model.bean.Paciente;

public class Modelopaciente {
    public void salvar(Paciente mod){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO paciente(nome,telefone,cpf)VALUES(?,?,?)");
            stmt.setString(1,mod.getnome());
            stmt.setString(2,mod.gettelefone());
            stmt.setString(3,mod.getcpf());
         
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Paciente cadastrado!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar."+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
            
        }
    
}
    
    public List<Paciente> read(){
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt =null;
        ResultSet rs = null;
        
        List<Paciente> Pacientes = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Paciente p");
            rs = stmt.executeQuery();
            
            
            while (rs.next()){
                
                Paciente paciente = new Paciente();
                
                paciente.setid(rs.getInt("id"));
                paciente.setnome(rs.getString("nome"));
                paciente.settelefone(rs.getString("telefone"));
                paciente.settelefone(rs.getString("cpf"));
                Pacientes.add(paciente);
              
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a busca."+ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt, rs);
    }
        
        return Pacientes;
       
    }
}