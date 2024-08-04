package DataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DataAccess.DTO.ProductosDTO;

public class ProductosDAO extends SQLiteDataHelper implements IDAO<ProductosDTO> {





    //Cosas de la interfaz--------------------------------------------------------------
    @Override
    public ProductosDTO readBy(Integer id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readBy'");
    }

    @Override
    public boolean create(ProductosDTO entity) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public List<ProductosDTO> readAll() throws Exception {
        List <ProductosDTO> lst =  new ArrayList<>();
        String query = "SELECT ProductosID "
                     + ",ProductoNombre    "
                     + ",Estado            "
                     + ",FechaCrea         "
                     + ",FechaModifica     "
                     + "FROM Productos     "
                     + "WHERE Estado = 'A' ";

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
