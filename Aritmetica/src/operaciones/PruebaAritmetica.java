package operaciones;

/*public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println(" Resultado desde la prueba = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(5,8);
        System.out.println("resultado usando argumentos = " + resultado);
        
    }
}*/
public class PruebaAritmetica{
  public static void main (String[] args){
      //Variables locales
      int a = 10;
      int b = 2;
      
      Aritmetica aritmetica1 = new Aritmetica();
      System.out.println("aritmetical a:" + aritmetica1.a);
      System.out.println("aritmetica1 b:" + aritmetica1.b);
      
      Aritmetica aritmetica2 = new Aritmetica(5, 8);
      System.out.println("aritmetica2 a: = " + aritmetica2.a);
      System.out.println("aritmetica2 b: = " + aritmetica2.b);
  }
}