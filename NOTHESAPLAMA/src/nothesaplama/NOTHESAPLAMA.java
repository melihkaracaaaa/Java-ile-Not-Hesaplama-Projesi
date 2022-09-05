
package nothesaplama;

import java.util.Scanner;


public class NOTHESAPLAMA {
    
    public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);
         
          System.out.print("vize1 Notunuzu Giriniz : "); 
          int vize1 = scanner.nextInt();
          System.out.print("Vize2 Notunuzu Giriniz : ");
          int Vize2 = scanner.nextInt();
          System.out.print("Final Notunuzu Giriniz : ");
          int Final = scanner.nextInt();
          
          double toplamnot = (vize1 * 3 / 10) + (Vize2 * 3 / 10) + (Final * 4 / 10);
          
          if (toplamnot >= 90 && toplamnot <= 100) {
              System.out.print(" Harf Notunuz : AA ");
          }
          else if (toplamnot >= 80 ) {
              System.out.print(" Harf Notunuz : BA ");
          }
          else if (toplamnot >= 70) {
              System.out.print(" Harf Notunuz : BB ");
          }
          else if (toplamnot >= 60) {
              System.out.print(" Harf Notunuz : CB ");
          }
          else if (toplamnot <= 60 && toplamnot >= 1 ) {
              System.out.print(" Harf Notunuz : FF\n  KALDINIZ... ");
          }
        
          else  {
              System.out.println(" GECERSİZ NOT ");
    }
                
}
  }
