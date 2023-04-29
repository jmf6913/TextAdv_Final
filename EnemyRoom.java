public class EnemyRoom extends MapTile{
    private Enemy enemy;

    public EnemyRoom(int x, int y, Enemy enemy){
        super(x,y);
        this.enemy = enemy;
    }
    public void modifyPlayer(Player the_player){
        if (enemy.lifeStatus()){
            the_player.hp = the_player.hp - enemy.damage;

            System.out.printf("Enemy does %d damage. You have %d health remaining.");
        }
    }
}