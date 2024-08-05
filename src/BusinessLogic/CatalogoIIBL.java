package BusinessLogic;

import java.util.List;

import DataAccess.CatalogoIIDAO;
import DataAccess.DTO.CatalogoIIDTO;

public class CatalogoIIBL {
    
    private CatalogoIIDTO catalogoii;
    private CatalogoIIDAO ciiDAO = new CatalogoIIDAO();

    public CatalogoIIBL(){}

    public List<CatalogoIIDTO> getAll () throws Exception{
        return ciiDAO.readAll();
    }

    public CatalogoIIDTO getByIdCatalogoII(int idCatalogoII) throws Exception{
        catalogoii = ciiDAO.readBy(idCatalogoII);
        return catalogoii;
    } 

    public boolean create (CatalogoIIDTO catalogoIIDTO) throws Exception{
        return ciiDAO.create(catalogoIIDTO);
    }

    public boolean update (CatalogoIIDTO catalogoIIDTO) throws Exception{
        return ciiDAO.update(catalogoIIDTO);
    }

    public boolean delete (int idCatalogoII) throws Exception{
        return ciiDAO.delete(idCatalogoII);
    }

    public Integer getMaxRow() throws Exception{
        return ciiDAO.getMaxRow();
    }
}
