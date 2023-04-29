public class Cliff extends MapTile{

    public Cliff(int x, int y){
        super(x,y);
    }

    public String introText(){
        return "\n You come to a sharp drop over a cliff, you must turn back \n";
    }
}
