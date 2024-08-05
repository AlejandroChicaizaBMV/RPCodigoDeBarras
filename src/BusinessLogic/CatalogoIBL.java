package BusinessLogic;

import java.util.List;

import DataAccess.CatalogoIDAO;
import DataAccess.DTO.CatalogoIDTO;


public class CatalogoIBL {
    
    private CatalogoIDTO catalogoi;
    private CatalogoIDAO ciDAO = new CatalogoIDAO();

    public CatalogoIBL(){}

    public List<CatalogoIDTO> getAll () throws Exception{
        return ciDAO.readAll();
    }

    public CatalogoIDTO getByIdCatalogoI(int idCatalogoI) throws Exception{
        catalogoi = ciDAO.readBy(idCatalogoI);
        return catalogoi;
    } 

    public boolean create (CatalogoIDTO catalogoIDTO) throws Exception{
        return ciDAO.create(catalogoIDTO);
    }

    public boolean update (CatalogoIDTO catalogoIDTO) throws Exception{
        return ciDAO.update(catalogoIDTO);
    }

    public boolean delete (int idCatalogoI) throws Exception{
        return ciDAO.delete(idCatalogoI);
    }

    public Integer getMaxRow() throws Exception{
        return ciDAO.getMaxRow();
    }
}
