public class Temple extends MapTile{

    public Temple(int x, int y){
        super(x,y);
    }

    public String introText(){
        return "\n You have arrived at the temple, you can't wait to see whats inside! \n ";
    }

    public void winner(Player player) {
        player.victory = true;
    }
}
