import java.util.*;
public class MapTile{
    int x;
    int y;



    public MapTile(int x, int y){
        this.x = x;
        this.y = y;
    }


    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MapTile other = (MapTile) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    public String introText(){
        throw new UnsupportedOperationException();
    }

    public ArrayList<Action> adjacentMoves(){
        ArrayList<Action> moves = new ArrayList();
        if(World.tileExists(x,y +1)!=null)
            moves.add(new moveEast());
        if(World.tileExists(x,y -1)!=null)
            moves.add(new moveWest());
        if(World.tileExists(x -1,y)!=null)
            moves.add(new moveNorth());
        if(World.tileExists(x +1,y)!=null)
            moves.add(new moveSouth());
        return moves;

    }


    public ArrayList<Action> validActions(){
        ArrayList<Action> moves = new ArrayList();
        moves = adjacentMoves();
        moves.add(new ViewInventory());
        return moves;
    }

}