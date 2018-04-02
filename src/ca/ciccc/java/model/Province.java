package ca.ciccc.java.model;

/**
 * This class represents Province. <br>
 * It has also some methods that get useful information of the provinces.
 * It has attributes below.
 * <ul>
 * <li>name</li>
 * <li>capital</li>
 * <li>populationinMillon</li>
 * </ul>
 *
 * @since 2018-04-01
 * @author shouhei
 *
 */

public class Province {

	private String name;
	private String capital;
	private int populationInMillon;

	private final int DEFAULT_POPULATION_MILLIONS = 4;
	private final String DEFAULT_PROVINCE = "British Columbia";
	private final String DEFAULT_CAPITAL = "Victoria";

	private final String[] PV = {
			"Ontario",
			"Quebec",
			"BritishColumbia",
			"Alberta",
			"Manitoba",
			"Saskatchewan",
			"NovaScotia",
			"NewBrunswick",
			"NewfoundlandandLabrador",
			"PrinceEdwardIsland"
	};


	private final String[] CP = {
			"Tronto",
			"QuebecCity",
			"Victoria",
			"Edmonton",
			"Winnipeg",
			"Regina",
			"Halifax",
			"Fredericton",
			"St.John's",
			"Charlottetown",
	};


	/**
	 * Default constructor.
	 */
	public Province() {
		this.setPopulationInMillon(DEFAULT_POPULATION_MILLIONS);
		this.setName(DEFAULT_PROVINCE);
		this.setCapital(DEFAULT_CAPITAL);
	}

	/**
	 *
     * Constructs a new Province object by setting initial values in specified values.<br>
	 *
	 * @param province name of province
	 * @param capital name of province capital
	 * @param populationMillions number of population
	 */
	public Province(String province, String capital, int populationMillions) {
		if((isValidPopulation(populationMillions)) && (isValidProvince(province) && (isValidCapitalCity(capital)))) {
			this.setPopulationInMillon(populationMillions);
			this.setName(province);
			this.setCapital(capital);
		} else {
			this.setPopulationInMillon(DEFAULT_POPULATION_MILLIONS);
			this.setName(DEFAULT_PROVINCE);
			this.setCapital(DEFAULT_CAPITAL);
		}
	}

	/**
	 * Get details of the province(capital and population)
	 * @return capital and population
	 */
	public String getDetails() {
		return "The capital of " + getCapital() + "(pop." + getPopulationInMillon() + ")" + " is " + getName() + ".";
	}

	/**
	 * Validator of populationMillions
	 * @param populationMillions number of population
	 * @return true if the given population is between 4 and 38, false otherwise
	 */
	private boolean isValidPopulation(int populationMillions) {
		if(populationMillions  >= 0 && populationMillions <= 38)
			return true;
		return false;
	}

	/**
	 * Validator of province
	 * @param province name of province
	 * @return true if the given province exist in the 10 Canadian province, false otherwise
	 */
	private boolean isValidProvince(String province) {
		int i = 0;
		while (i < PV.length) {
			if(PV[i].equals(province))
				return true;
			i++;
		}
		return false;
	}

	/**
	 * Vlidator of capital
	 * @param capital name of capital
	 * @return true if the given capital exist in the 10 Canadian province capital, false otherwise
	 */
	private boolean isValidCapitalCity(String capital) {
		for(int i=0; i < CP.length; i++){
			if(CP[i].equals(capital))
				return true;
		};
		return false;
	}

	/**
	 * Getter of population
	 * @return number of the province's population
	 */
	public int getPopulationInMillon() {
		return populationInMillon;
	}

	/**
	 * Setter of population
	 * @param populationinMillon number of the province's population
	 */
	public void setPopulationInMillon(int populationinMillon) {
		this.populationInMillon = populationinMillon;
	}

	/**
	 * Getter of name
	 * @return name of province
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of name
	 * @param name name of province
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter of capital
	 * @return capital of the province
	 */
	public String getCapital() {
		return capital;
	}

	/**
	 * Setter of capital
	 * @param capital name of capital
	 */
	public void setCapital(String capital) {
		this.capital = capital;
	}

}
