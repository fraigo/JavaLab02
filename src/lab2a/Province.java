package lab2a;

/**
 * Province Class
 * @author Francisco Igor <franciscoigor@gmail.com>
 *
 */
public class Province {

	/**
	 * Population of the default province
	 */
	private static final int DEFAULT_POPULATION_MILLIONS = 4;
	/**
	 * Name of the default province
	 */
	private static final String DEFAULT_PROVINCE = "British Columbia";
	/**
	 * Capital of the default province
	 */
	private static final String DEFAULT_CAPITAL = "Victoria";

	/**
	 * Name of the province. ( e.g. “British Columbia” )
	 */
	private String name; 
	/**
	 * Name of the capital city in the province ( e.g. “Victoria” )
	 */
	private String capital; 
	/**
	 * Population in millions of the province ( e.g. 4 or 38 )
	 */
	private int populationInMillions; 
	
	/**
	 * Default constructor.
	 * Initialize all properties to the default values
	 */
	public Province(){
		this.populationInMillions = DEFAULT_POPULATION_MILLIONS; // 4
		this.name = DEFAULT_PROVINCE; // “British Columbia”
		this.capital = DEFAULT_CAPITAL; // “Victoria”
	}

	/**
	 * Detailed constructor
	 * @param province Name of the province
	 * @param capital Capital city of the province
	 * @param populationInMillions Population of the province in millions
	 */
	public Province(String province, String capital, int populationInMillions){
		if(
			isValidPopulation(populationInMillions) 
			&& isValidProvince(province) 
			&& isValidCapitalCity(capital)
		){
			this.populationInMillions = populationInMillions;
			this.name = province;
			this.capital = capital;

			} else { // if there is any error; create the default data, shown below
				this.populationInMillions = DEFAULT_POPULATION_MILLIONS; // 4
				this.name = DEFAULT_PROVINCE; // “British Columbia”
				this.capital = DEFAULT_CAPITAL; // “Victoria”
			}
	}

	/**
	 * Test function for the <code>name</code> property
	 * @param province Name of the province
	 * @return True if it's a valid province name
	 */
	private boolean isValidProvince(String province) {
		String[] PROVINCE_LIST = {
		        "Alberta",
				"British Columbia",
				"Manitoba",
				"New Brunswick",
				"Newfoundland and Labrador",
				"Nova Scotia",
				"Nunavut",
				"Ontario",
				"Prince Edward Island",
				"Quebec",
				"Saskatchewan"};
		int i=0;
		while( i<PROVINCE_LIST.length){
			if (PROVINCE_LIST[i].equalsIgnoreCase(province)){
				return true;
			}
			i++;
		}
		return false;
	}
	
	/**
	 * Test function for the <code>populationInMillions</code> property
	 * @param population Population in millions
	 * @return True if it's a valid population number
	 */
	private boolean isValidPopulation(int population) {
		if (population>=4 && population<=38){
			return true;
		}
		return false;
	}

	/**
	 * Test function for the <code>capital</code> property.
	 * @param capital Name of the capital city
	 * @return True if it's a valid capital city
	 */
	private boolean isValidCapitalCity(String capital) {
		String[] CAPITAL_LIST = {
		        "Edmonton",
				"Victoria",
				"Winnipeg",
				"Fredericton",
				"St. John's",
				"Halifax",
				"Toronto",
				"Charlottetown",
				"Quebec City",
				"Regina"};
		for(int i=0; i<CAPITAL_LIST.length; i++){
			if (CAPITAL_LIST[i].equalsIgnoreCase(capital)){
				return true;
			}
		}
		return false;
	}

	/**
	 * Sets the name of the province
	 * @param name Name of the province
	 */
	public void setName(String name) {
		if (isValidProvince(name)){
			this.name = name;
		}else{
			this.name = DEFAULT_PROVINCE;
		}
	}

	/**
	 * Sets the capital name of the province
	 */
	public void setCapital(String capital) {
		if (isValidCapitalCity(capital)){
			this.capital = capital;
		}else{
			this.capital = DEFAULT_CAPITAL;
		}
	}

	/**
	 * Sets the population of the province
	 * @param populationInMillions Population in millions
	 */
	public void setPopulationInMillions(int populationInMillions) {
		this.populationInMillions = populationInMillions;
	}
	
	/**
	 * Gets the current name of the province
	 * @return Name of the province
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the current capital city of the province
	 * @return Capital city of the province
	 */
	public String getCapital() {
		return capital;
	}
	
	/**
	 * Gets the current population of the province
	 * @return Population in millions
	 */
	public int getPopulationInMillions() {
		return populationInMillions;
	}
	
	/**
	 * Gets a detailed description of the province (name, population and capital)
	 * @return A string with the province description
	 */
	public String getDetails(){
		return "The capital of "+this.getName()+" (pop. "+this.getPopulationInMillions()+" million) is "+this.getCapital()+".";
	}

}
