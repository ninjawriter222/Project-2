package byui.cit260.oregontrail.model;

/**
 *
 * @author Poe
 */
public enum Actor {
    //objects to be added to the enum class
    //add in a point class
    Bob("Satchel", "His IS BOB!", new Location (1,1)),
    Snob("Snobbington", "He is a snob.", new Location(0,1));

    //Feel free to add in as many characters as you please, 
    //I just kept with for simplicity sake.
    

    //Feel free to add in as many characters as you please, I just kept with 2
    //for simplicity sake.

    //attribute variables
    private String name;
    private String description;
    private Location coordinates;

    
    
    Actor(String name, String description, Location coordinates){
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;
    }



}
