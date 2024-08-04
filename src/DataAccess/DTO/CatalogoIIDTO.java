package DataAccess.DTO;

public class CatalogoIIDTO {
    private Integer IDCatalogoII;       
    private String  CatalogoIINombre;   
    private Integer IDCatalogoI;
    private String  CatalogoIIEstado;
    private String  FechaCreacion;
    private String  FechaModifica;
    
    
    public CatalogoIIDTO() {}
    
    public CatalogoIIDTO(Integer iDCatalogoII, String catalogoIINombre, Integer iDCatalogoI, String catalogoIIEstado, String fechaCreacion, String fechaModifica) {
        this.IDCatalogoII       = iDCatalogoII;
        this.CatalogoIINombre   = catalogoIINombre;
        this.IDCatalogoI        = iDCatalogoI;
        this.CatalogoIIEstado   = catalogoIIEstado;
        this.FechaCreacion      = fechaCreacion;
        this.FechaModifica      = fechaModifica;
    }

    //--GETTERS AND SETTERS-----
    public Integer getIDCatalogoII() {
        return IDCatalogoII;
    }
    
    public void setIDCatalogoII(Integer iDCatalogoII) {
        IDCatalogoII = iDCatalogoII;
    }
    
    public String getCatalogoIINombre() {
        return CatalogoIINombre;
    }
    
    public void setCatalogoIINombre(String catalogoIINombre) {
        CatalogoIINombre = catalogoIINombre;
    }
    
    public Integer getIDCatalogoI() {
        return IDCatalogoI;
    }
    
    public void setIDCatalogoI(Integer iDCatalogoI) {
        IDCatalogoI = iDCatalogoI;
    }
    
    public String getCatalogoIIEstado() {
        return CatalogoIIEstado;
    }
    
    public void setCatalogoIIEstado(String catalogoIIEstado) {
        CatalogoIIEstado = catalogoIIEstado;
    }
    
    public String getFechaCreacion() {
        return FechaCreacion;
    }
    
    public void setFechaCreacion(String fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }
    
    public String getFechaModifica() {
        return FechaModifica;
    }
    
    public void setFechaModifica(String fechaModifica) {
        FechaModifica = fechaModifica;
    }
    
    @Override
    public String toString(){
        return getClass().getName()+"\n iDCatalogoII :      " + getIDCatalogoII()
                                   +"\n CatalogoIINombre:   " + getCatalogoIINombre()
                                   +"\n iDCatalogoI:        " + getIDCatalogoI()
                                   +"\n CatalogoIIEstado:   " + getCatalogoIIEstado()
                                   +"\n Fecha Creacion:     " + getFechaCreacion()
                                   +"\n Fecha Modifica:     " + getFechaModifica();

    }
}
