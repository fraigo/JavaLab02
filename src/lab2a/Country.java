package lab2a;


/**
 * Country Class
 * @author Francisco Igor <franciscoigor@gmail.com>
 *
 */
public class Country {
	
	/**
	 * Name of the country
	 */
	private String name;
	/**
	 * List of provinces in the country
	 */
	private Province[] provinces;
	
	/**
	 * Default constructor
	 */
	public Country(){
		provinces=new Province[10];
		for (int i=0; i<provinces.length; i++) {
			provinces[i]=new Province();
		}
	}
	
	/**
	 * Lists all provinces in the country.
	 * Get the details of each <code>Province</code> in the country
	 */
	public void displayAllProvinces(){
		for (Province province : provinces) {
			System.out.println(province.getDetails());
		}
	}
	
	/**
	 * Sets the name of the country
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the name of the country
	 * @return Name of the country
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets a list of provinces filtered by population (min and max)
	 * @param min Minimum population
	 * @param max Maximum population
	 */
	public void howManyHaveThisPopulation(int min,int max){
		for (Province province : provinces) {
			if (province.getPopulationInMillions()>=min && province.getPopulationInMillions()<=max){
				System.out.println(province.getDetails());				
			}
		}
	}
	
}
