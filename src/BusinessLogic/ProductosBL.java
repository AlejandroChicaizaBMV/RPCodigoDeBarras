package BusinessLogic;

import java.util.List;

import DataAccess.ProductosDAO;
import DataAccess.DTO.ProductosDTO;

public class ProductosBL {
    private ProductosDTO productos;
    private ProductosDAO pDAO = new ProductosDAO();

    public ProductosBL(){}

    public List<ProductosDTO> getAll () throws Exception{
        return pDAO.readAll();
    }

    public ProductosDTO getBy(int idProducto) throws Exception{
        productos = pDAO.readBy(idProducto);
        return productos;
    } 

    public boolean add (ProductosDTO productosDTO) throws Exception{
        return pDAO.create(productosDTO);
    }

    public boolean update (ProductosDTO productosDTO) throws Exception{
        return pDAO.update(productosDTO);
    }

    public boolean delete (int idProducto) throws Exception{
        return pDAO.delete(idProducto);
    }

    public Integer getRowCount() throws Exception{
        return pDAO.getMaxRow();
    }
}
