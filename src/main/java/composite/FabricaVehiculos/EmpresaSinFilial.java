package composite.FabricaVehiculos;

public class EmpresaSinFilial extends Empresa {

    @Override
    public double calculoMantenimiento() {
        // TODO Auto-generated method stub
        return numVehiculo*costoPorUnidad;
    }

    @Override
    public boolean agregaFilial(Empresa filial) {
        // TODO Auto-generated method stub
        return false;
    }

}
