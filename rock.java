import java.util.Random;
import java.util.Scanner;

public class rock {
   public rock() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Random var2 = new Random();
      boolean var3 = true;
      int var4 = 0;
      int var5 = 0;

      for(int var6 = 0; var6 <= 1; ++var6) {
         System.out.println("1.Rock\n2.Paper\n3.Scissor");
         System.out.println("\nenter the number");
         int var7 = var1.nextInt();
         int var8 = var2.nextInt(3) + 1;
         System.out.println("computer=" + var8);
         if (var7 == var8) {
            System.out.println("It's a tie!");
         } else if ((var7 != 1 || var8 != 3) && (var7 != 2 || var8 != 1) && (var7 != 3 || var8 != 2)) {
            System.out.println("\nComputer wins this round!");
            ++var5;
         } else {
            System.out.println("\nYou win this round!");
            ++var4;
         }
      }

      System.out.printf("computer score:" + var5);
      System.out.println("user score:" + var4);
      if (var5 > var4) {
         System.out.println("\ncomputer won");
      } else {
         System.out.println("\nu won");
      }

      if (var4 == var5) {
         System.out.println("\ntie");
      }

   }
}
