package HeroGame;

// Жрецы
public class Priest extends BaseHero {

    private int elexir;
    private int maxElexir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.maxElexir = Magician.r.nextInt(50, 150);
        this.elexir = maxElexir;
    }

    public int Attack(){
        int damage = BaseHero.r.nextInt(20,30);
        this.elexir -= (int) (damage * 0.8);
        if(elexir < 0)
            return 0;
        else
            return damage;
    }

    public String getInfo() {
        return String.format("%s Elexir: %d", super.getInfo(), this.elexir);
    }
}
