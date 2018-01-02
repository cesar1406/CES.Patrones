package state.fabricaVehiculos;

public class PedidoEntregado extends EstadoPedido {
    public PedidoEntregado (Pedido unPedido) {
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
        return this;
    }

    @Override
    public void borra() {
        this.pedido.getProductos().clear();
    }

}
