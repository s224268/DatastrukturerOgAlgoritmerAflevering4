import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConnectionAttempt.run();
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



class ConnectionAttempt {

    static Connection[] connections;
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int numberOfIslands = scanner.nextInt();
        int maxBridges = scanner.nextInt();//Burde være lige meget?
        int ferries = scanner.nextInt();
        int priceSum = 0;
        boolean[] visited = new boolean[numberOfIslands+1];
        int numberOfBridges = numberOfIslands-ferries;


        connections = new Connection[maxBridges];
        for (int i = 0; i < maxBridges; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            connections[i] = new Connection(a,b,c);
        }


        Arrays.sort(connections);
        boolean bool = getConnections(connections[0]);
        System.out.println(bool);
        

        /*
        int iterator = 0;
        for (int i = 0; i < numberOfBridges;i++){
            if (!visited[connections[i].islandOne] || !visited[connections[i].islandTwo]){
                visited[connections[i].islandOne] = true;
                visited[connections[i].islandTwo] = true;
                priceSum += connections[i].cost;
                iterator++;
                if (iterator == numberOfBridges){
                    break;
                }
            }
        }
        System.out.println(priceSum);

         */
    }



    public static boolean getConnections(Connection startConnection){
        ArrayList connected = new ArrayList<>();
        connected.add(startConnection.islandTwo);
        for (Connection k : connections){
            for (Connection c : connections) {
                if (connected.contains(c.islandOne) && connected.contains(c.islandTwo)){
                    return true;
                }
                if (connected.contains(c.islandOne)){
                    connected.add(c.islandTwo);
                }
                if (connected.contains(c.islandTwo)){
                    connected.add(c.islandOne);
                }
            }
        }
        return false;
    }
}


class Connection implements Comparable<Connection> {
    public int cost;
    public int islandOne;
    public int islandTwo;
    

    public Connection(int... values) {
        this.islandOne = values[0];
        this.islandTwo = values[1];
        this.cost = values[2];
    }

    public int compareTo(Connection connection) {
        return this.cost - connection.cost;
    }


}