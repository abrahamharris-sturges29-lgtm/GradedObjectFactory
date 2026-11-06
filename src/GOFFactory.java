public class GOFFactory {

    // Factory attributes

    public boolean isOpen = true;
    public int yearFounded = 2026;
    public String owner = "Abe";

    public int randPop;


    // City objects

    public GOFCity city1;
    public GOFCity city2;
    public GOFCity city3;


    public String location;

    // Main method creates a Factory

    public static void main(String[] args) {
        //PSVM
        GOFFactory A= new GOFFactory();
    }

    // Factory constructor creates three cities

    public GOFFactory(){
        // Generates a random number
        randPop = (int) (Math.random()*300);

        // Prints factory information

        System.out.println("welcome to Abe's Factory");
        System.out.println("the year founded is ...");
        System.out.println(yearFounded);
        System.out.println("it is " + isOpen + " that the factory is Open");
        System.out.println("the owner is" + owner);

        // Creates first city and changes its language

        city1 = new GOFCity(2000*randPop, 2026, 68, "france", "paris", "french", true, true);
city1.changeLanguage("english");
city1.printinfo();

        // Creates second city and changes its population

        city2 = new GOFCity(20000*randPop, 2026, 74, "massachusets", "boston", "english", false, true);
        city2.increasePopulation(2);
        city2.printinfo();

        // Creates third city and prints its information

        city3 = new GOFCity(35000*randPop, 2026, 78, "new york", "new york", "english", false, true);
        city3.printinfo();



    }
}
