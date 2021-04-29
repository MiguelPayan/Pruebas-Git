
//INVOCA A JAVA CLASS SOBRECARGA

package pruebasgit;


public class Pruebasgit {

    public static void main(String[] args) {
Sobrecarga_metodos datos = new Sobrecarga_metodos();
double res;
datos.test();
datos.test(123.2);
datos.test(10);
datos.test(10, 20);
res = datos.test(123.2);
System.out.println(res);
        
        
    }
    
}
