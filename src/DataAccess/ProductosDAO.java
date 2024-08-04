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

import DataAccess.DTO.ProductosDTO;

public class ProductosDAO extends SQLiteDataHelper implements IDAO<ProductosDTO> {





    //Cosas de la interfaz--------------------------------------------------------------
    @Override
    public ProductosDTO readBy(Integer id) throws Exception {
        ProductosDTO oP = new ProductosDTO();
        String query = "SELECT IDProducto  "
                     + ",ProductoNombre    "
                     + ",ProductoCodigo    "
                     + ",ProductoPrecio    "
                     + ",ProductoEstado    "
                     + ",FechaCreacion     "
                     + ",FechaModifica     "
                     + "FROM Productos     "
                     + "WHERE ProductoEstado = 'A' AND IDProducto = "+ id.toString();
        try {
            Connection conn = openConnection();
            Statement  stmt = conn.createStatement();
            ResultSet  rs   = stmt.executeQuery(query);

            while(rs.next()){
                oP= new ProductosDTO(rs.getInt(1), 
                                                  rs.getString(2), 
                                                  rs.getString(3), 
                                                  rs.getFloat(4), 
                                                  rs.getString(5),
                                                  rs.getString(6),
                                                  rs.getString(7));
            }
        } catch (SQLException e) {
            throw e;
        }
        return oP;
    }

    @Override
    public boolean create(ProductosDTO entity) throws Exception {
        String query = "INSERT INTO Productos (ProductoNombre, ProductoCodigo, ProductoPrecio) VALUES (?,?,?)";
        try {
            Connection conn         = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1,entity.getProductoNombre());
            pstmt.setString(2,entity.getProductoCodigo());
            pstmt.setFloat(3,entity.getProductoPrecio());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<ProductosDTO> readAll() throws Exception {
        List <ProductosDTO> lst =  new ArrayList<>();
        String query = "SELECT IDProducto  "
                     + ",ProductoNombre    "
                     + ",ProductoCodigo    "
                     + ",ProductoPrecio    "
                     + ",ProductoEstado    "
                     + ",FechaCreacion     "
                     + ",FechaModifica     "
                     + "FROM Productos     "
                     + "WHERE ProductoEstado = 'A' ";

        try {
            Connection conn = openConnection();
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(query);

            while(rs.next()){
                ProductosDTO p = new ProductosDTO(rs.getInt(1), 
                                                  rs.getString(2), 
                                                  rs.getString(3), 
                                                  rs.getFloat(4), 
                                                  rs.getString(5),
                                                  rs.getString(6),
                                                  rs.getString(7));
                lst.add(p);                                    
            }
        } catch (SQLException e) {
            throw e; //new PatException(e.getMessage(), getClass().getName(), "readAll()");
        }
        return lst;
    }

    @Override
    public boolean update(ProductosDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime     now = LocalDateTime.now();
        String query = "UPDATE Productos SET ProductoNombre = ?,ProductoCodigo = ? ,ProductoPrecio = ? ,FechaModifica = ? WHERE IDProducto = ?";
        try {
            Connection conn        = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getProductoNombre());
            pstmt.setString(2, entity.getProductoCodigo());
            pstmt.setFloat (3, entity.getProductoPrecio());
            pstmt.setString(4, dtf.format(now).toString());
            pstmt.setInt(5, entity.getIDProducto());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {

        String query = "UPDATE Productos SET ProductoEstado = ? WHERE IDProducto = ?";
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
    public Integer getMaxRow() throws Exception{
        String query = "SELECT COUNT (*) TotalReg FROM Productos"
                     +"WHERE ProductosEstado = 'A'";
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
