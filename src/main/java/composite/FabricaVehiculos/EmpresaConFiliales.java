package composite.FabricaVehiculos;
import java.util.*;

public class EmpresaConFiliales extends Empresa {
    protected List <Empresa> filiales=new ArrayList<Empresa>(); 

    @Override
    public double calculoMantenimiento() {
        // TODO Auto-generated method stub
        double costo=0.0;
        for(Empresa filial:this.filiales) {
            costo+=filial.calculoMantenimiento();
        }
        return costo+numVehiculo*costoPorUnidad;
    }

    @Override
    public boolean agregaFilial(Empresa filial) {
        // TODO Auto-generated method stub
        return this.filiales.add(filial);
    }
}
