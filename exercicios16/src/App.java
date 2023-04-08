
//Faça um programa para uma loja de tintas. O programa deverá pedir o
//tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da 
// tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de
// 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta
// a serem compradas e o preço total.
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        double metro;
        double litro;
        double lata;
        double valorl;
        Scanner teclado = new Scanner(System.in);
        System.out.println("qual área a ser pintada");
        metro = teclado.nextDouble();
        litro = metro / 3;
        lata = Math.ceil(litro / 18);
        valorl = lata * 80;
        System.out.println("Area a ser Pintada: " + metro);
        System.out.println("Litros a ser usados: " + litro);
        System.out.println("Latas a Serem compradas: " + lata);
        System.out.println("Valor gasto R$: " + valorl);
        teclado.close();

    }
}
