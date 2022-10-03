import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
//Faça um Programa que peça as 4 notas bimestrais e mostre a média
Scanner sc = new Scanner(System.in);

System.out.println("digite a primeira nota");
double nt1 = sc.nextDouble();
System.out.println("digite a segunda nota");
double nt2 = sc.nextDouble();
System.out.println("digite a terceira nota");
double nt3 = sc.nextDouble();
System.out.println("digite a quarta nota");
double nt4 = sc.nextDouble();

double media = (nt1+nt2+nt3+nt4)/4;

System.out.println("A media das notas é " + media);
    }
}
