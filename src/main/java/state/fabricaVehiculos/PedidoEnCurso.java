package state.fabricaVehiculos;

public class PedidoEnCurso extends EstadoPedido {

    public PedidoEnCurso(Pedido unPedido) {
        super(unPedido);
    }
    
    @Override
    public void agregaProducto(Producto unProducto) {
        this.pedido.getProductos().add(unProducto);
    }

    @Override
    public void suprimeProducto(Producto unProducto) {
        this.pedido.getProductos().remove(unProducto);
    }

    @Override
    public EstadoPedido estadoSiguiente() {
        return new PedidoValidado(this.pedido);
    }
    
    @Override
    public void borra() {
        this.pedido.getProductos().clear();
    }

}
