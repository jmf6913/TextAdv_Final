public class CheetahRoom extends EnemyRoom{
    Cheetah enemy;
    public CheetahRoom(int x, int y, Cheetah enemy){
        super(x,y,enemy);
        this.enemy = enemy;
    }

    public String introText(){
        if (enemy.lifeStatus()){
            return "The Jungle bush spreads as a cheetah leaps out!";
        }else{
            return "A cheetah lies defeated";
        }
    }
}