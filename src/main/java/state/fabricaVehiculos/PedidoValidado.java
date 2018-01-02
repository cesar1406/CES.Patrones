package state.fabricaVehiculos;

public class PedidoValidado extends EstadoPedido {
    public PedidoValidado(Pedido unPedido) {
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
        return new PedidoEntregado(this.pedido);
    }

    @Override
    public void borra() {
        this.pedido.getProductos().clear();
    }

}
