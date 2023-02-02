package edu.ucan.naturemarket.datasource;

 /*
 * @author ismael correia
 * @id 19802
 */
public class DataSourceModel {
    
    public final static String DATA_BASE="naturemarket_bd";
    public final static String PORT="5432";
    public final static String USER="postgres";
    public final static String PASSWORD="postgres";
    public final static String URL="jdbc:postgresql://localhost:" + PORT + "/" + DATA_BASE + "?autoReconnect=true";
    
    
}
