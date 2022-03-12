package operaciones;
public class Aritmetica {
    //Atributos de clase
    int a;
    int b;
    
    //constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
    
    public Aritmetica (int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }
    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        /*int resultado = a + b;
        return resultado;*/
        return a + b; //forma más rápida de devolver un resultado
    }
    public int sumarConArgumentos(int arg1, int arg2){
        a = arg1;
        b = arg2;
        //return a + b;
        return sumarConRetorno();
    }
}
