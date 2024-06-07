// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero;
    System.out.println("Digite um numero");
   numero = entrada.nextInt();
    System.out.println("\n");

    for(int i=0; i <= 10;i++){

    System.out.printf(numero + "x" + i + "=" + numero*i + "\n");
    } 
    
      
                       
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}