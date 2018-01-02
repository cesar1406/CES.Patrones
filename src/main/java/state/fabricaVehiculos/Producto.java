package state.fabricaVehiculos;

public class Producto {
    protected String nombre;
    
    public Producto (String unNombre) {
        this.nombre=unNombre;
    }
    public void visualizar() {
        System.out.println("Producto: "+this.nombre);
    }
}
