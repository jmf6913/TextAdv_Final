

public class Enemy {
    protected String name;
    protected int health;
    protected int damage;
    public Enemy(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public boolean lifeStatus(){
        return (this.health > 0);
    }

    public String toString(){
        return String.format("%s \n=====\n %s \nvalue: %d \n", this.name, this.health,this.damage);
    }
}
