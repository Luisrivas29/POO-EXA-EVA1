package eva1_examen_practico_fibonacci;
//Emiliano Cano Maro
/**
 *
 * @author DELL
 */
public class ClassFibonacci {
    //atributos
    private int a1;
    private int a2;
    private int n;
    
    //constructores
    public ClassFibonacci() {
        a1 = 2;
        a2 = 5;
        n = 6;
    }
    public ClassFibonacci(int v1, int v2, int v3) {
        a1 = v1;
        a2 = v2;
        n = v3;
    }
    //metodos
    //get y set a1
    public int getA1(){
        return a1;
    }
    public void setA1(int value){
        a1 = value;
    }
    //get y set a1
    public int getA2(){
        return a2;
    }
    public void setA2(int value){
        a2 = value;
    }
    //get y set a1
    public int getN(){
        return n;
    }
    public void setN(int value){
        n = value;
    }
    
    public void printSerie() {
        System.out.print("La serie Fibonacci es: "+a1);
        
        for(int i = 0; i < n-1; i++) {
            System.out.print(", "+a2+"");
            int xd = a1;
            a1 = a2;
            a2 += xd;
        }
        System.out.println("");
    }
}
