package DataAccess.DTO;

public class ProductosDTO {

    private Integer IDProducto;
    private String  ProductoNombre;
    private String  ProductoCodigo;
    private Double  ProductoPrecio;
    private Integer IDCatalogoI;
    private Integer IDCatalogoII;
    private String  ProductoEstado;
    private String  FechaCreacion;
    private String  FechaModifica;
    
    public ProductosDTO() {
    }

    public ProductosDTO (String ProductoNombre) {
        this.ProductoNombre = ProductoNombre;
    }

    public ProductosDTO(String productoNombre, String productoCodigo, Double productoPrecio, Integer iDCatalogoI,Integer iDCatalogoII) {
        ProductoNombre  = productoNombre;
        ProductoCodigo  = productoCodigo;
        ProductoPrecio  = productoPrecio;
        IDCatalogoI     = iDCatalogoI;
        IDCatalogoII    = iDCatalogoII;
    }
    

    public ProductosDTO(Integer iDProducto, String productoNombre, String productoCodigo, Double productoPrecio,
    Integer iDCatalogoI, Integer iDCatalogoII, String productoEstado, String fechaCreacion, String fechaModifica) {
        IDProducto      = iDProducto;
        ProductoNombre  = productoNombre;
        ProductoCodigo  = productoCodigo;
        ProductoPrecio  = productoPrecio;
        IDCatalogoI     = iDCatalogoI;
        IDCatalogoII    = iDCatalogoII;
        ProductoEstado  = productoEstado;
        FechaCreacion   = fechaCreacion;
        FechaModifica   = fechaModifica;
    }

    public Integer getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(Integer iDProducto) {
        IDProducto = iDProducto;
    }

    public String getProductoNombre() {
        return ProductoNombre;
    }

    public void setProductoNombre(String productoNombre) {
        ProductoNombre = productoNombre;
    }

    public String getProductoCodigo() {
        return ProductoCodigo;
    }

    public void setProductoCodigo(String productoCodigo) {
        ProductoCodigo = productoCodigo;
    }

    public Double getProductoPrecio() {
        return ProductoPrecio;
    }

    public void setProductoPrecio(Double productoPrecio) {
        ProductoPrecio = productoPrecio;
    }

    public Integer getIDCatalogoI() {
        return IDCatalogoI;
    }

    public void setIDCatalogoI(Integer iDCatalogoI) {
        IDCatalogoI = iDCatalogoI;
    }

    public Integer getIDCatalogoII() {
        return IDCatalogoII;
    }

    public void setIDCatalogoII(Integer iDCatalogoII) {
        IDCatalogoII = iDCatalogoII;
    }

    public String getProductoEstado() {
        return ProductoEstado;
    }

    public void setProductoEstado(String productoEstado) {
        ProductoEstado = productoEstado;
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
        +"\n IDProducto :       "+ getIDProducto()
        +"\n ProductoNombre:    "+ getProductoNombre()
        +"\n ProductoCodigo:    "+ getProductoCodigo()
        +"\n ProductoPrecio:    "+ getProductoPrecio()
        +"\n IDCatalogoI:       "+ getIDCatalogoI()
        +"\n IDCatalogoII:      "+ getIDCatalogoII()
        +"\n ProductoEstado:    "+ getProductoEstado()
        +"\n FechaCreacion:     "+ getFechaCreacion()
        +"\n FechaModifica:     "+ getFechaModifica();
    }
}
