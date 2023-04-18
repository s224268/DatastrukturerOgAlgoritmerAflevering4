import java.util.LinkedList;

public class Island {
    LinkedList<Island> connectedIslandStack = new LinkedList<>();
    public int islandID;
    public Island(int newBuildingID){
        islandID = newBuildingID;
    }
    public void addConnection(Island island){
        connectedIslandStack.push(island);
    }
}