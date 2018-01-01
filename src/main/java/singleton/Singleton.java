package singleton;

public class Singleton {
    private static Singleton singleton1=null;
    private String atributo2;
    
    private Singleton(String atributo) {
        this.atributo2=atributo;
    }
    
    public synchronized static Singleton getSingleton(){
        if(singleton1==null) {
            singleton1=new Singleton("algunAtributo");
        }
        return singleton1;
    }
}
