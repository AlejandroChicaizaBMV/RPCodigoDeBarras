import DataAccess.CatalogoIDAO;
import DataAccess.CatalogoIIDAO;
import DataAccess.ProductosDAO;
import DataAccess.DTO.CatalogoIDTO;
import DataAccess.DTO.CatalogoIIDTO;
import DataAccess.DTO.ProductosDTO;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            ProductosDAO pDao = new ProductosDAO();
            for(ProductosDTO p : pDao.readAll())
            System.out.println(p.toString());            
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("-".repeat(20)+"SEPARACION CATALOGOII");
        try {
            CatalogoIIDAO cIIDao = new CatalogoIIDAO();
            for(CatalogoIIDTO cii : cIIDao.readAll())
            System.out.println(cii.toString());            
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("-".repeat(20)+"SEPARACION CATALOGOI");
        try {
            CatalogoIDAO cIDao = new CatalogoIDAO();
            for(CatalogoIDTO ci : cIDao.readAll())
            System.out.println(ci.toString());            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
