import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import BusinessLogic.CatalogoIBL;
import BusinessLogic.CatalogoIIBL;
import BusinessLogic.ProductosBL;
import DataAccess.CatalogoIDAO;
import DataAccess.CatalogoIIDAO;
import DataAccess.ProductosDAO;
import DataAccess.DTO.CatalogoIDTO;
import DataAccess.DTO.CatalogoIIDTO;
import DataAccess.DTO.ProductosDTO;
import UserInterface.Form.MainForm;
import UserInterface.Form.SplashScreenForm;

public class App {
    public static void main(String[] args) throws Exception {
       
    
    
        // FlatLightLaf.setup();
        // FlatLightLaf.supportsNativeWindowDecorations();
        // try {
        //         UIManager.setLookAndFeel(new FlatAtomOneDarkIJTheme());
        //     } catch (UnsupportedLookAndFeelException e) {
        //     e.printStackTrace();
        // } 
    
       SplashScreenForm.show();
       new MainForm("Codigo De Barras");
    
    
    
    
    
    
    
    
    
    
    
        //    try {
    //         ProductosBL pBL = new ProductosBL();
    //         pBL.add(new ProductosDTO("ProductoPrueba", "6666666666", 0.65, 1 , 2));
    //         for (ProductosDTO p : pBL.getAll() )
    //             System.out.println(p.toString());
    //         System.out.println("--------------------SEPARACION--------------------");
    //         CatalogoIIBL ciiBL = new CatalogoIIBL();
    //         for(CatalogoIIDTO reg: ciiBL.getAll())
    //             System.out.println(reg.toString());

    //         System.out.println("--------------------SEPARACION--------------------");
    //         CatalogoIBL ciBL = new CatalogoIBL();
    //         for(CatalogoIDTO reg: ciBL.getAll())
    //             System.out.println(reg.toString());
            
    //     } catch (Exception e) {
    //         System.out.println(e.toString());
    //     }


       
       
       
        // try {
        //     ProductosDAO pDao = new ProductosDAO();
        //     for(ProductosDTO p : pDao.readAll())
        //     System.out.println(p.toString());            
        // } catch (Exception e) {
        //     System.out.println(e.toString());
        // }

        // System.out.println("-".repeat(20)+"SEPARACION CATALOGOII");
        // try {
        //     CatalogoIIDAO cIIDao = new CatalogoIIDAO();
        //     for(CatalogoIIDTO cii : cIIDao.readAll())
        //     System.out.println(cii.toString());            
        // } catch (Exception e) {
        //     System.out.println(e.toString());
        // }

        // System.out.println("-".repeat(20)+"SEPARACION CATALOGOI");
        // try {
        //     CatalogoIDAO cIDao = new CatalogoIDAO();
        //     for(CatalogoIDTO ci : cIDao.readAll())
        //     System.out.println(ci.toString());            
        // } catch (Exception e) {
        //     System.out.println(e.toString());
        // }
    }
}
