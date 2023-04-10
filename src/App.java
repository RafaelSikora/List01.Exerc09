import java.util.Scanner;
//Faça um Programa que peça a temperatura em graus Fahrenheit, 
//transforme e mostre a temperatura em graus Celsius.C = 5 * ((F-32) / 9).
class Main {
  
  public static void main(String[] args) {
  //Declaração de variáveis
  double fahrenheit;
  double celsius;
  Scanner teclado = new Scanner(System.in);
    
  //Passo 1: fazer a entrada dos dados
  System.out.println("Digite a temperatura em graus Fahrenheit");
  fahrenheit = teclado.nextDouble();

    //Passo 2: calcular o IMC
    celsius = (fahrenheit - 32) * 5 / 9;

    //Passo 3: exibir a resposta pro usuário
    System.out.println(fahrenheit + " graus Fahrenheit é equivalente a: " + celsius + " graus Celsius.");
      
  }
  
}