import java.util.Scanner;
public class Beecrowd1011 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        double radius,volume;
        
        
        //ler raio
        radius = leitor.nextDouble();
        
        volume = (4.0/3)*3.14159*Math.pow(radius, 3);
        
        //mostrar resultado no console
        System.out.printf("VOLUME = %.3f%n" , volume);
    }
}
