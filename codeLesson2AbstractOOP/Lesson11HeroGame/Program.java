package HeroGame;

public class Program {
    public static void main(String[] args) {

        Magician hero1 = new Magician();
        System.out.println(hero1.getInfo());

        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();
        System.out.println(hero3.getInfo());

        hero3.GetDamage(hero2.Attack());
        hero3.GetDamage(hero3.Attack()); //нанос урона самому себе
 
        System.out.println(hero3.getInfo());
        System.out.println(hero2.getInfo());
     
        
    }
    
}

  
// int teamCount = 10;
// Random rand = new Random();
// int magicianCount = 0;
// int priestCount = 0;

// List<BaseHero> teams = new ArrayList<>();
//         for (int i = 0; i < teamCount; i++) {
//             if(rand.nextInt(2) == 0){
//                 teams.add(new Priest());
//             }
//             else{
//                 teams.add(new Magician());
//                 magicianCount++;
//             }
//             System.out.println(teams.get(i).getInfo());
//         }
//         System.out.println();
//         System.out.printf("magicialCount: %d priestCount: %d \n \n", magicianCount, priestCount);
        

//               // attack

//         // #endregion

//         // todo добавить ещё один класс и 
//         // реализовать    возможность лечения героев