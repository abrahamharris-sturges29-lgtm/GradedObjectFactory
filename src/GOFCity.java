public class GOFCity {
    // City attributes
    public String location;
    public String cityName;
    public String language;

    public int population;
    public int date;
    public int avgTemp;


    public boolean isLandlocked;
    public boolean isAirport;


    // Constructor creates city attributes

public GOFCity(int pPop, int pDate, int pTemp, String pLoc, String pName, String pLang, boolean pLandlocked, boolean pAirport){


    population = (int) (Math.random() * 1000);

    location = pLoc;
    cityName = pName;
    language = pLang;

    population = pPop;
    date = pDate;
    avgTemp = pTemp;

    isAirport = pAirport;
    isLandlocked = pLandlocked;
}

    // Prints all city attributes

public void printinfo(){

    System.out.println("the city is located in "+location);;
    System.out.println("its name is "+cityName);
    System.out.println("the language spoken is "+language);
    System.out.println("the population is "+ population);
    System.out.println("the date is "+date);
    System.out.println("the average temperature is "+avgTemp);
    System.out.println("it is "+isLandlocked +" that the city is landlocked");
    System.out.println("it is "+isAirport+" that there is an airport");

}
//increases population
    public void increasePopulation(int multi) {
        population += 1000*multi;
    }
//changes language
    public void changeLanguage(String newLanguage) {
        language = newLanguage;
    }




}
