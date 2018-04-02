package ca.ciccc.java.model;

/**
 * This class represents Canada. This object has Province objects that match Canada’s real provinces.<br>
 * It has also some methods that get useful information of the provinces.
 * It has attributes below.
 * <ul>
 * <li>name</li>
 * <li>provinceObjs</li>
 * </ul>
 *
 * @since 2018-04-01
 * @author shouhei
 *
 */

public class Country {

	private final int PROVINCENUMBER = 10;

	private String name;
	private Province[] provinceObjs = new Province[PROVINCENUMBER];

	/**
	 * Default constructor.
	 */
	public Country() {

		this.name = "Canada";
		this.provinceObjs[0] = new Province("Ontario", "Tronto", 13);
		this.provinceObjs[1] = new Province("Quebec", "QuebecCity", 8);
		this.provinceObjs[2] = new Province("BritishColumbia", "Victoria", 5);
		this.provinceObjs[3] = new Province("Alberta", "Edmonton", 4);
		this.provinceObjs[4] = new Province("Manitoba", "Winnipeg", 1);
		this.provinceObjs[5] = new Province("Saskatchewan", "Regina", 1);
		this.provinceObjs[6] = new Province("NovaScotia", "Halifax", 1);
		this.provinceObjs[7] = new Province("NewBrunswick", "Fredericton", 0);
		this.provinceObjs[8] = new Province("NewfoundlandandLabrador", "St.John's", 0);
		this.provinceObjs[9] = new Province("PrinceEdwardIsland", "Charlottetown", 0);
	}

	/**
	 * This method displays each province's information (capital and population).
	 */
	public void displayAllProvinces() {
		for(int i=0; i<provinceObjs.length; i++){
			System.out.println(provinceObjs[i].getDetails());
		};
	}

	/**
	 * This method takes the population in millions(min and max) and returns how many Provinces there are with population in that range.
	 * @param min min of the range
	 * @param max max of the range
	 * @return number in the range
	 */
	public int howManyHaveThisPopulation(int min, int max) {
		int count = 0;
		for(Province pv : provinceObjs){
			if(pv.getPopulationInMillon() >= min && pv.getPopulationInMillon() <= max)
				count++;
		};
		return count;
	}

	/**
	 * Getter of Name.
	 * @return name of country
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of Name.
	 * @param name name of country
	 */
	public void setName(String name) {
		this.name = name;
	}

}
