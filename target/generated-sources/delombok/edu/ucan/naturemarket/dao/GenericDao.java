package edu.ucan.naturemarket.dao;

import edu.ucan.naturemarket.datasource.DataSourceConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Ismael Correia
 * @id 19802
 */
public abstract class GenericDao<T> {
    protected final Connection connection;
    
    public GenericDao() throws ClassNotFoundException, SQLException {
        connection = new DataSourceConnection().getConnection();
    }
    
     
    public abstract List<T> findAll(String expression);
    public abstract List<T> findAll();
    public abstract T findById(Long id);
    public abstract T update(Long id, T t);
    public abstract T create(T t);
    public abstract T delete(Long id);
    
}
