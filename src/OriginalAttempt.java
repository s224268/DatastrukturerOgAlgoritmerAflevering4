import java.util.Arrays;
import java.util.Scanner;

public class OriginalAttempt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfIslands = scanner.nextInt();
        int maxBridges = scanner.nextInt();//Burde være lige meget?
        int ferries = scanner.nextInt();
        int priceSum = 0;
        int[] islands = new int[numberOfIslands + 1];
        /*
        System.out.println("numberOfIslands: " + numberOfIslands);
        System.out.println("maxBridges: " + maxBridges);
        System.out.println("ferries: " + ferries);
        */
        int[] possiblePrices = new int[maxBridges];
        //int[] prices = new int[numberOfIslands-ferries];
        for (int i = 0; i < maxBridges; i++){
            scanner.nextInt();
            scanner.nextInt();
            possiblePrices[i] = scanner.nextInt();
        }
        Arrays.sort(possiblePrices);
        for (int i = 0; i < (numberOfIslands-ferries-1);i++){
            priceSum += possiblePrices[i];
        }
        System.out.println(priceSum);

    }

    public static void timeLoop(){
        while (true) System.out.println("oopsie");
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            System.out.print("");
        }
    }
}