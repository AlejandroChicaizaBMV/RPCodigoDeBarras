package DataAccess.DTO;

public class CatalogoIDTO {

    private Integer IDCatalogoI;
    private String  CatalogoINombre;
    private String  CatalogoIEstado;
    private String  FechaCreacion;
    private String  FechaModifica;
    
    public CatalogoIDTO (){}

    public CatalogoIDTO(Integer iDCatalogoI, String catalogoINombre, String catalogoIEstado, String fechaCreacion,
            String fechaModifica) {
        IDCatalogoI = iDCatalogoI;
        CatalogoINombre = catalogoINombre;
        CatalogoIEstado = catalogoIEstado;
        FechaCreacion = fechaCreacion;
        FechaModifica = fechaModifica;
    }

    public Integer getIDCatalogoI() {
        return IDCatalogoI;
    }

    public void setIDCatalogoI(Integer iDCatalogoI) {
        IDCatalogoI = iDCatalogoI;
    }

    public String getCatalogoINombre() {
        return CatalogoINombre;
    }

    public void setCatalogoINombre(String catalogoINombre) {
        CatalogoINombre = catalogoINombre;
    }

    public String getCatalogoIEstado() {
        return CatalogoIEstado;
    }

    public void setCatalogoIEstado(String catalogoIEstado) {
        CatalogoIEstado = catalogoIEstado;
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
        return getClass().getName()
        +"\n IDCatalogoI:       " +getIDCatalogoI()
        +"\n CatalogoINombre:   " +getCatalogoINombre()
        +"\n CatalogoIEstado:   " +getCatalogoIEstado()
        +"\n FechaCreacion:     " +getFechaCreacion()
        +"\n FechaModifica:     " +getFechaModifica();

    }
}
