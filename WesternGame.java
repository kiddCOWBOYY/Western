import java.util.Scanner ;
import java.util.Random;
public class WesternGame {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        Random generator = new Random();

     int knifelvl;
     int gunlvl;
     int bknifelvl;
     int bgunlvl;
    boolean fight = false;
    String choice = null;
    boolean gun;
    boolean knife;
	//int damage = 0;

    // Initialize temporary knife level and gun level for test
    knifelvl = 7;
    gunlvl = 5;
    bknifelvl = generator.nextInt(11);
    bgunlvl = generator.nextInt(11);

    //This is a test encounter with a bandit.
     System.out.println("You come across a Bandit in the desert, youve been on an all night Drinking binge, and so has your horse. You stumble down off your trusty steed and stare that sombitch straight in the face... ");

     System.out.println("Fight or Run?");
     String fightOrRunChoice = kbd.next();
    if (fightOrRunChoice == "fight") { fight = true; }
    if (fightOrRunChoice == "run") { fight = false; }


    //Check whether the user chose to fight
    if( fight == true) {
        System.out.println("What do you Fight him with? (Knife or Gun).");
    choice = kbd.next(); }

   // if(choice == "knife" ) { damage = KnifeFight(knifelvl, bknifelvl); }
   // if(choice =="gun") { damage = GunFight(gunlvl, bgunlvl); }
int damage = KnifeFight(knifelvl, gunlvl);
    System.out.println("You did " + damage + " damage.");
    }




public static int KnifeFight (int knifelvl, int bknifelvl) {
	 Random generator = new Random();
	//if (knifelvl > bknifelvl); {
        int damage = generator.nextInt(11);
        return damage;
       // }
}
public static int GunFight ( int gunlvl, int bgunlvl) {
	 Random generator = new Random();
    //if (gunlvl > bgunlvl); {
        int damage = generator.nextInt(51);
        return  damage;//}
}
}






