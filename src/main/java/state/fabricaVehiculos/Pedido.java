package state.fabricaVehiculos;
import java.util.*;

public class Pedido {
  protected List<Producto> productos=new ArrayList<Producto>();
  protected EstadoPedido estado;
  
  public Pedido() {
      estado=new PedidoEnCurso(this);
  }
  public void agregaProducto(Producto unProducto) {
      estado.agregaProducto(unProducto);
  }
  public void suprimeProducto(Producto unProducto) {
      estado.suprimeProducto(unProducto);
  }
  public void borra() {
      estado.borra();
  }
  public void estaSiguiente() {
      estado=estado.estadoSiguiente();
  }
  public List<Producto> getProductos(){
      return this.productos;
  }
  public void visualizar() {
      System.out.println("contenido del pedido: ");
      for(Producto unProducto: this.productos) {
          unProducto.visualizar();
      }
  }
}    