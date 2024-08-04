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

import DataAccess.DTO.CatalogoIIDTO;

public class CatalogoIIDAO extends SQLiteDataHelper implements IDAO<CatalogoIIDTO> {

    @Override
    public CatalogoIIDTO readBy(Integer id) throws Exception {
        
        CatalogoIIDTO cII = new CatalogoIIDTO();
        String query = "SELECT IDCatalogoII "
                    + ", CatalogoIINombre  "
                    + ", IDCatalogoI       "
                    + ", CatalogoIIEstado  "
                    + ", FechaCreacion     "
                    + ", FechaModifica     "
                    + "FROM CatalogoII     "
                    + "WHERE CatalogoIIEstado = 'A' AND IDCatalogoII = "+ id.toString();
        try {
            Connection conn = openConnection();
            Statement  stmt = conn.createStatement();
            ResultSet  rs   = stmt.executeQuery(query);

            while(rs.next()){
                cII = new CatalogoIIDTO(rs.getInt(1)
                                                      , rs.getString(2)
                                                      , rs.getInt(3)
                                                      , rs.getString(4)
                                                      , rs.getString(5)
                                                      , rs.getString(6));
            }
        } catch (SQLException e) {
            throw e;
        }
        return cII;
    }

    @Override
    public boolean create(CatalogoIIDTO entity) throws Exception {
        String query = "INSERT INTO CatalogoII (CatalogoIINombre, IDCatalogoI) VALUES (?,?)";
        
        try {
            Connection conn         = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1 , entity.getCatalogoIINombre() );
            pstmt.setInt(2 , entity.getIDCatalogoI());
            pstmt.executeUpdate();
            
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<CatalogoIIDTO> readAll() throws Exception {
        List<CatalogoIIDTO> lst = new ArrayList<>();
        String query = "SELECT IDCatalogoII "
                     + ", CatalogoIINombre  "
                     + ", IDCatalogoI       "
                     + ", CatalogoIIEstado  "
                     + ", FechaCreacion     "
                     + ", FechaModifica     "
                     + "FROM CatalogoII     "
                     + "WHERE CatalogoIIEstado = 'A'"; 
        try {
            Connection conn = openConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                CatalogoIIDTO cII = new CatalogoIIDTO(rs.getInt(1)
                                                      , rs.getString(2)
                                                      , rs.getInt(3)
                                                      , rs.getString(4)
                                                      , rs.getString(5)
                                                      , rs.getString(6));
                lst.add(cII);
            }
        } catch (Exception e) {
            throw e;
        } 
        
        return lst;
    }

    @Override
    public boolean update(CatalogoIIDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime     now = LocalDateTime.now();
        String query = "UPDATE CatalogoII SET CatalogoIINombre = ? ,FechaModifica = ? WHERE IDCatologoII = ?";
        try {
            Connection conn        = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getCatalogoIINombre());
            pstmt.setString(2, dtf.format(now).toString());
            pstmt.setInt(3, entity.getIDCatalogoII());

            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = "UPDATE CatalogoII SET CatalogoIIEstado = ? WHERE IDCatalogoII = ?";
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
        String query = "SELECT COUNT (*) TotalReg FROM CatalogoII"
                     + " WHERE CatalogoIIEstado = 'A'";
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
