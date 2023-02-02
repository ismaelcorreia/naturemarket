package edu.ucan.naturemarket.datasource;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 /*
 * @author ismael correia
 * @id 19802
 */
public final class DataSourceConnection implements IConnection{
    private static Connection connection;
    
    public DataSourceConnection() throws ClassNotFoundException, SQLException{
        forName("org.postgresql.Driver");
        open();
    }
    
    @Override
    public void open() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(
                    DataSourceModel.URL,
                    DataSourceModel.USER, 
                    DataSourceModel.PASSWORD);
            
            connection.setAutoCommit(false);
        }
    }

    @Override
    public void close() throws SQLException{
        if (connection != null) {
            connection.close();
            connection = null;
        }
    }

    public Connection getConnection() {
        return connection;
    }
    
}
