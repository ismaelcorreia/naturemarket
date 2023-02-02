package edu.ucan.naturemarket.dao;
 
import edu.ucan.naturemarket.model.enumerator.Status;
import edu.ucan.naturemarket.model.local.Endereco;
import edu.ucan.naturemarket.util.DateUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ismael Correia
 * @id 19802
 */
public class EnderecoDao extends GenericDao<Endereco>{

    public EnderecoDao() throws ClassNotFoundException, SQLException {
        super();
    }
    
    @Override
    public List<Endereco> findAll(String expression) {
         try(PreparedStatement ps = connection.prepareStatement("Select * from endereco where designacao like '%?%';")){
             
             ps.setString(1, expression);
             ResultSet rs = ps.executeQuery();
             List<Endereco> enderecos = new ArrayList<>();
             while(rs.next()) {
                 
                 enderecos.add(new Endereco(
                         rs.getLong("pkEndereco"),
                         rs.getInt("status")==0?Status.Activo:Status.Desactivo,
                         rs.getString("designacao"),
                         rs.getString("descricao"),
                         DateUtil.toLocalDateTime(rs.getDate("createdAt"))
                 ));
                 
                 return enderecos;
                 
             }
             
             
             
         }catch(SQLException sqlEx){
                System.err.println("Erro no servidor: "+sqlEx.getMessage());
             try {
                 connection.rollback();
             } catch (SQLException ex) {
                 Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         return null;
    }

    @Override
    public List<Endereco> findAll() {
        try(PreparedStatement ps = connection.prepareStatement("Select * from endereco where designacao;")){
             
             ResultSet rs = ps.executeQuery();
             List<Endereco> enderecos = new ArrayList<>();
             while(rs.next()) {
                 
                 enderecos.add(new Endereco(
                         rs.getLong("pkEndereco"),
                         rs.getInt("status")==0?Status.Activo:Status.Desactivo,
                         rs.getString("designacao"),
                         rs.getString("descricao"),
                         DateUtil.toLocalDateTime(rs.getDate("createdAt"))
                 ));
                 
                 return enderecos;
                 
             }
             
             
             
         }catch(SQLException sqlEx){
                System.err.println("Erro no servidor: "+sqlEx.getMessage());
             try {
                 connection.rollback();
             } catch (SQLException ex) {
                 Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         return null;

    }

    @Override
    public Endereco findById(Long id) {
        try(PreparedStatement ps = connection.prepareStatement("Select * from endereco where pkEndereco = ?;")){
             
             ps.setLong(1, id);
             ResultSet rs = ps.executeQuery(); 
             if(rs.next()) {
                 
                return new Endereco(
                         rs.getLong("pkEndereco"),
                         rs.getInt("status")==0?Status.Activo:Status.Desactivo,
                         rs.getString("designacao"),
                         rs.getString("descricao"),
                         DateUtil.toLocalDateTime(rs.getDate("createdAt"))
                 );
                  
                 
             }
             
             
             
         }catch(SQLException sqlEx){
                System.err.println("Erro no servidor: "+sqlEx.getMessage());
             try {
                 connection.rollback();
             } catch (SQLException ex) {
                 Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         return null;
    }

    @Override
    public Endereco update(Long id, Endereco t) {
        try(PreparedStatement ps = connection.prepareStatement("update endereco set designacao =?, descricao=? where pkEndereco=?;")){
             
             ps.setString(1, t.getDescricao());
             ps.setString(2, t.getDescricao());
             ps.setLong(3, id);
              
             if (ps.execute())
                 t.setId(id);
             
             return t;
                  
                 
             
             
             
             
         }catch(SQLException sqlEx){
                System.err.println("Erro no servidor: "+sqlEx.getMessage());
             try {
                 connection.rollback();
             } catch (SQLException ex) {
                 Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         return null;
    }

    @Override
    public Endereco create(Endereco t) {
        try(PreparedStatement ps = connection.prepareStatement("insert into endereco(desinacao,descricao) values(?,?);")){
             
             ps.setString(1, t.getDescricao());
             ps.setString(2, t.getDescricao()); 
              
             if (ps.execute()) 
             
             return t;
                  
        }catch(SQLException sqlEx){
                System.err.println("Erro no servidor: "+sqlEx.getMessage());
             try {
                 connection.rollback();
             } catch (SQLException ex) {
                 Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         return null;
    }

    @Override
    public Endereco delete(Long id) {
            Endereco endereco = findById(id);
           try(PreparedStatement ps = connection.prepareStatement("delete from endereco where pkEndereco=?;")){
              
             ps.setLong(1, id);
              
             if (ps.execute()) 
             
             return endereco;
         }catch(SQLException sqlEx){
                System.err.println("Erro no servidor: "+sqlEx.getMessage());
             try {
                 connection.rollback();
             } catch (SQLException ex) {
                 Logger.getLogger(EnderecoDao.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         return null;
    }

}
