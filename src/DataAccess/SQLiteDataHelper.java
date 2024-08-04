package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class SQLiteDataHelper {
    private static String DBPathConnection = "jdbc:sqlite:Database/prjCodigoBarras.sqlite";
    private static Connection conn = null;
    protected SQLiteDataHelper(){}

    protected static synchronized Connection openConnection() throws SQLException {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(DBPathConnection); 
            }
        } catch (SQLException e) {
            throw e;
        }
        return conn;
    }

    protected static void closeConnection() throws SQLException {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                conn = null;  // Reset the connection object to null
            }
        } catch (SQLException e) {
            throw e;
        }
    }
}

