package composite.FabricaVehiculos;

public class ClaseUsuario {
    public static void main (String[]args) {
        Empresa empresa1=new EmpresaSinFilial();
        empresa1.agregarVehiculo();
        Empresa empresa2=new EmpresaSinFilial();
        empresa2.agregarVehiculo();
        empresa2.agregarVehiculo();
        Empresa empresaMadre=new EmpresaConFiliales();
        empresaMadre.agregaFilial(empresa2);
        empresaMadre.agregaFilial(empresa1);
    }
}
