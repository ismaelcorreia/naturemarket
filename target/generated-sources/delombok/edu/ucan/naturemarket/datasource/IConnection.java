package edu.ucan.naturemarket.datasource;

import java.sql.SQLException;


 /*
 * @author ismael correia
 * @id 19802
 */
public interface IConnection {
    public void open()  throws SQLException;
    public void close()  throws SQLException;
}
