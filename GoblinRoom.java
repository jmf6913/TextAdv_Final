public class GoblinRoom extends EnemyRoom{
    Goblin enemy;
    public GoblinRoom(int x, int y, Goblin enemy){
        super(x,y,enemy);
        this.enemy = enemy;
    }

    public String introText(){
        if (enemy.lifeStatus()){
            return "Something springs out of the corner of your vision, you barely have time to get ready";
        }else{
            return "What you can only describe as a goblin lays motionless on the floor";
        }
    }
}