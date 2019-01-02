/* Sydney Davidson
   November 5, 2018

   The purpose of this class is to model
   a television */

public class Television{
	// Two constant fields
	private String MANUFACTURER;    // attribute that holds the brand name
	private int SCREEN_SIZE;        // attribute that holds the screen size
	// Remaining three fields
	private boolean powerOn;        // attribute that holds "true" is the power is on
	                                // or "false" if the power is off
	private int channel;            // attribute that holds the value of the channel
	private int volume;             // attribute that holds a number value representing loundess

	// Constructor
	public Television(String brand, int size){
		MANUFACTURER = brand;
		SCREEN_SIZE = size; 
		powerOn = false;
		volume = 20;
		channel = 2; 
	}
/* The purpose of the constructor is to initialize instance fields and
   preform other initialization tasks. */
/* setChannel is an accesor method that retrieves 
   the variable channel and then stores into station
   @param: station is the value as an integer
   @return: no return */
   public void setChannel(int station){
   		channel = station;
	}
/* power is a mutator method that allows the value of powerOn
   to be changed from true to false or vice versa
   @param: none
   @return: none */
	public void power(){
		powerOn = !powerOn;
	}
/* increaseVolume is a mutator method that increases the volume
   by increments of 1
   @param: none
   @return none */ 
	public void increaseVolume(){
		volume++;
	}
/* decreaseVolume is a mutator method that decreases the volume
   by increments of 1
   @param: none
   @return none */ 
	public void decreaseVolume(){
		volume--;
	}
/* getChannel is a mutator method that accepts a value
   then stores it as an integer
   @param: none
   @return: an integer */
	public int getChannel(){
		return channel;
	}
/* getVolume is an accessor method that retrieves
   the variable volume and stores into the same variable
   @param: none
   @return: volume as an integer*/
	public int getVolume(){
		return volume; 
	}
/* getManufacturer is an accessor method that retrieves
   the constant variable MANUFACTURER and stores it into
   the variable
   @param: none
   @return: MANUFACTURER*/
	public String getManufacturer(){
		return MANUFACTURER;
	}
/* getScreenSize is an accessor method that retrieves
   the constant variable SCREEN_SIZE and stores it into
   the variable
   @param: none
   @return: the screen size as an integer*/
	public int getScreenSize(){
		return SCREEN_SIZE;
	}
}