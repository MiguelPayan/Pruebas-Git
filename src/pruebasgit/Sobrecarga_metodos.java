
//EJERCICIO BASICO QUE MUESTRA SOBRECARGA DE METODO

package pruebasgit;

public class Sobrecarga_metodos {
    void test(){
        System.out.println("Metodo vacio");
    }
    
    void test(int a){
        System.out.println("a= " + a);
    }
    
        void test(int a, int b){
        System.out.println("a y b= " + a + " " +b);
    }
        
        double test(double a){
        System.out.println("a= " + a);
        return a;
    }
}
