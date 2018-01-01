package composite.FabricaVehiculos;

public abstract class Empresa {
    protected static double costoPorUnidad=5.0;
    protected int numVehiculo;
    
    public void agregarVehiculo() {
        numVehiculo++;
    }
    public abstract double calculoMantenimiento();
    public abstract boolean agregaFilial(Empresa filial);
}
