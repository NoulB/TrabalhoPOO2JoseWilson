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

/**
 *
 * @author Raphael
 */
public class MedicamentoDAO {
    
    public void create(Medicamento m){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO medicamento(nome_med,id_med,descr_prod,ean,preco,preco_icms,exclusivo_hospital,med_tipo_id_tipo,substancia_cod_subs,tributacao_id,fabricante_cnpj)VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,m.getNome_med());
            stmt.setString(2,m.getId_med());
            stmt.setString(3,m.getDescr_prod());
            stmt.setString(4,m.getEan());
            stmt.setDouble(5,m.getPreco());
            stmt.setDouble(6,m.getPreco_icms());
            stmt.setString(7,m.getExclusivo_hospital());
            stmt.setInt(8,m.getMed_tipo_id_tipo());
            stmt.setString(9,m.getSubstancia_cod_subs());
            stmt.setString(10,m.getTributacao_id());
            stmt.setString(11,m.getFabricante_cnpj());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Medicamento cadastrado!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar."+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
            
        }
    
    
        
    }    
    
    public List<Medicamento> read(){
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt =null;
        ResultSet rs = null;
        
        List<Medicamento> medicamentos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Medicamento m, Fabricante");
            rs = stmt.executeQuery();
            
            
            while (rs.next()){
                
                Medicamento medicamento = new Medicamento();
                
                medicamento.setId_med(rs.getString("id_med"));
                medicamento.setNome_med(rs.getString("Nome_med"));
                medicamento.setDescr_prod(rs.getString("Descr_prod"));
                medicamento.setPreco(rs.getDouble("preco"));
                medicamentos.add(medicamento);
              
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a busca."+ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt, rs);
    }
        
        return medicamentos;
       
    }
    
    public List<Medicamento> readForNome(String Nome){
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt =null;
        ResultSet rs = null;
        
        List<Medicamento> medicamentos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("select m.id_med as id_med, m.nome_med as nome_med, m.descr_prod as descr_prod, t.nome_tipo as nome_tipo, s.nome_subs as nome_subs from medicamento m, med_tipo t, substancia s where m.med_tipo_id_tipo = t.id_tipo and m.substancia_cod_subs = s.cod_subs and m.nome_med like ?");

            stmt.setString(1, "%"+Nome+"%");
            rs = stmt.executeQuery();
            
            
            while (rs.next()){
                
                Medicamento medicamento = new Medicamento();
                
                //medicamento.setId_med(rs.getString("m.id_med"));
                medicamento.setNome_med(rs.getString("m.Nome_med"));
                medicamento.setDescr_prod(rs.getString("m.Descr_prod"));
                medicamento.setNome_tipo(rs.getString("t.nome_tipo"));
                medicamento.setSubstancias(rs.getString("s.nome_subs"));
                medicamentos.add(medicamento);
              
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a busca."+ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt, rs);
    }
        
        return medicamentos;
       
    }
    public List<Medicamento> readForPrincipio(String Prin){
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt =null;
        ResultSet rs = null;
        
        List<Medicamento> medicamentos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("select m.id_med as id_med, m.nome_med as nome_med, m.descr_prod as descr_prod, t.nome_tipo as nome_tipo, s.nome_subs as nome_subs from medicamento m, med_tipo t, substancia s where m.med_tipo_id_tipo = t.id_tipo and m.substancia_cod_subs = s.cod_subs and s.nome_subs like ?");

            stmt.setString(1, "%"+Prin+"%");
            rs = stmt.executeQuery();
            
            
            while (rs.next()){
                
                Medicamento medicamento = new Medicamento();
                
                //medicamento.setId_med(rs.getString("m.id_med"));
                medicamento.setNome_med(rs.getString("m.Nome_med"));
                medicamento.setDescr_prod(rs.getString("m.Descr_prod"));
                medicamento.setNome_tipo(rs.getString("t.nome_tipo"));
                medicamento.setSubstancias(rs.getString("s.nome_subs"));
                medicamentos.add(medicamento);
              
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a busca."+ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt, rs);
    }
        
        return medicamentos;
       
    }
    
public List<Medicamento> readForTipo(String Tipos){
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt =null;
        ResultSet rs = null;
        
        List<Medicamento> medicamentos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("select m.id_med as id_med, m.nome_med as nome_med, m.descr_prod as descr_prod, t.nome_tipo as nome_tipo, s.nome_subs as nome_subs from medicamento m, med_tipo t, substancia s where m.med_tipo_id_tipo = t.id_tipo and m.substancia_cod_subs = s.cod_subs and nome_tipo like ?");

            stmt.setString(1, "%"+Tipos+"%");
            rs = stmt.executeQuery();
            
            
            while (rs.next()){
                
                Medicamento medicamento = new Medicamento();
                
                //medicamento.setId_med(rs.getString("m.id_med"));
                medicamento.setNome_med(rs.getString("m.Nome_med"));
                medicamento.setDescr_prod(rs.getString("m.Descr_prod"));
                medicamento.setNome_tipo(rs.getString("t.nome_tipo"));
                medicamento.setSubstancias(rs.getString("s.nome_subs"));
                medicamentos.add(medicamento);
              
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a busca."+ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt, rs);
    }
        
        return medicamentos;
       
    }
}
