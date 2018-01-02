package state.fabricaVehiculos;

public abstract class EstadoPedido {
    protected Pedido pedido;
    
    public EstadoPedido(Pedido unPedido) {
        this.pedido=unPedido;
    }
    public abstract void agregaProducto(Producto unProducto);
    public abstract void suprimeProducto(Producto unProducto);
    public abstract EstadoPedido estadoSiguiente();
    public abstract void borra();
}
