/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {
	
	BASKET(5,"Basketball", Place.INDOOR),
	VOLLEY(6, "Volleyball", Place.OUTDOOR),
	TENNIS(1, "Tennis", Place.OUTDOOR),
	BIKE(1, "Biking", Place.OUTDOOR),
	F1(1, "Formula 1", Place.OUTDOOR),
	MOTOGP(1, "MOTOGP", Place.OUTDOOR),
	SOCCER(5, "Soccer", Place.INDOOR);
	
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private final int nPlayers;
	private final String name;
	private final Place place;
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	Sport(final int nPlayers, final String name, final Place place){
		this.name = name;
		this.nPlayers = nPlayers;
		this.place = place;
	}
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	public boolean isIndividualSport() {
		return this.nPlayers == 1;
	}
	
	public boolean isIndoorSport() {
		return this.place == Place.INDOOR;
	}
	public Place getPlace() {
		return this.place;
	}
	public String toString() {
		return "|Name: " + this.name + "| Players per team: " 
		+ this.nPlayers + "| Practiced :" + this.place +"|";
	}
}
