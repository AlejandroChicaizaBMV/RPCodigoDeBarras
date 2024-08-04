import DataAccess.ProductosDAO;
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
    }
}
