package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import DataAccess.DTO.CatalogoIDTO;

public class CatalogoIDAO extends SQLiteDataHelper implements IDAO<CatalogoIDTO> {

    @Override
    public CatalogoIDTO readBy(Integer id) throws Exception {
        
        CatalogoIDTO cI = new CatalogoIDTO();
        String query = "SELECT IDCatalogoI  "
                     + ",CatalogoINombre    "
                     + ",CatalogoIEstado   "
                     + ",FechaCreacion     "
                     + ",FechaModifica     "
                     + "FROM CatalogoI     "
                     + "WHERE CatalogoIEstado = 'A' AND IDCatalogoI = "+ id.toString();
        try {
            Connection conn = openConnection();
            Statement  stmt = conn.createStatement();
            ResultSet  rs   = stmt.executeQuery(query);

            while(rs.next()){
                cI= new CatalogoIDTO(rs.getInt(1)
                                    ,rs.getString(2)
                                    ,rs.getString(3)
                                    ,rs.getString(4)
                                    ,rs.getString(5));
            }
        } catch (SQLException e) {
            throw e;
        }
        return cI;
    }

    @Override
    public boolean create(CatalogoIDTO entity) throws Exception {
        String query = "INSERT INTO CatalogoI (CatalogoINombre) VALUES (?)";
        try {
            Connection conn         = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            pstmt.setString(1,entity.getCatalogoINombre());
            pstmt.executeUpdate();
            
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<CatalogoIDTO> readAll() throws Exception {
      List <CatalogoIDTO> lst =  new ArrayList<>();
      String query = "SELECT IDCatalogoI  "
                   + ",CatalogoINombre    "
                   + ",CatalogoIEstado   "
                   + ",FechaCreacion     "
                   + ",FechaModifica     "
                   + "FROM CatalogoI     "
                   + "WHERE CatalogoIEstado = 'A'";

        try {
            Connection conn = openConnection();
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(query);

            while(rs.next()){
                CatalogoIDTO c = new CatalogoIDTO(rs.getInt(1)
                                                 ,rs.getString(2)
                                                 ,rs.getString(3)
                                                 ,rs.getString(4)
                                                 ,rs.getString(5));
                lst.add(c);                                    
            }
        } catch (SQLException e) {
            throw e; //new PatException(e.getMessage(), getClass().getName(), "readAll()");
        }
        return lst;
    }

    @Override
    public boolean update(CatalogoIDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime     now = LocalDateTime.now();
        String query = "UPDATE CatalogoI SET CatalogoINombre = ?,FechaModifica = ? WHERE IDCatalogoI = ?";
        try {
            Connection conn        = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getCatalogoINombre());
            pstmt.setString(2, dtf.format(now).toString());
            pstmt.setInt(3, entity.getIDCatalogoI());

            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = "UPDATE CatalogoI SET CatalogoIEstado = ? WHERE IDCatalogoI = ?";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "X");
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            return true; 
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public Integer getMaxRow() throws Exception {
        String query = "SELECT COUNT (*) TotalReg FROM CatalogoI"
                     +"WHERE CatalogoIEstado = 'A'";
        try {
            Connection conn =  openConnection();
            Statement stmt  =  conn.createStatement();
            ResultSet rs    =  stmt.executeQuery(query);
            while(rs.next()){
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            throw e;
        }
        return 0;
    }

}
