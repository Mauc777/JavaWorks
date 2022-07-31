package Lesson22HeroGameAbstract;
import java.util.Random;

public abstract class BaseHero {
    protected static int number;
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;
    private int damage;

    static{
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    public BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public BaseHero() {
        this(String.format("Hero_Priest #%d", ++BaseHero.number),
                BaseHero.r.nextInt(100, 200));
    }

    public String getInfo(){
        return String.format("Name: %s  Hp: %d  Type: %s",
            this.name, this.hp, this.getClass().getSimpleName());
    }

    protected void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }

    protected void healed(int Hp){
        if(this.hp -  damage> 0){
            this.hp -= damage;
        }
        // else {die();}

    }

 

    
}