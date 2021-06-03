import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		System.out.println("Instantiate objects here!");
	

	MelonType musk = new MelonType(
		"musk",
		"Muskmelon",
		1998,
		"green",
		true,
		true
	);

	MelonType casaba = new MelonType(
		"cas",
		"Casaba",
		2003,
		"orange",
		true,
		false
	);

	MelonType crenshaw = new MelonType(
		"cren",
		"Crenshaw",
		1996,
		"green",
		true,
		false
	);

	MelonType yellowWatermelon = new MelonType(
		"yw",
		"Yellow Watermelon",
		2013,
		"yellow",
		true,
		false
	);

	MelonType[] melonTypes = {musk, casaba, crenshaw, yellowWatermelon};
	
	System.out.println(Arrays.toString(melonTypes));
	
		Melon melon1 = new Melon(melonTypes[3], 8, 7, 2, "Sheila");

		Melon melon2 = new Melon(melonTypes[3], 3, 4, 2, "Sheila");
		
		Melon melon3 = new Melon(melonTypes[1], 10, 6, 35, "Sheila");

		Melon melon4 = new Melon(melonTypes[2], 8, 9, 35, "Michael");
		
		Melon melon5 = new Melon(melonTypes[2], 8, 2, 35, "Michael");

		Melon melon6 = new Melon(melonTypes[0], 6, 7, 4, "Michael");	

		Melon melon7 = new Melon(melonTypes[3], 7, 10, 3, "Shelia");

		Melon[] melons = {melon1, melon2, melon3, melon4, melon5, melon6, melon7};

		getSellabilityReport(melons);
	}
	
	public static void getSellabilityReport(Melon[] melons){
		// for int i (i = whatever number melon we're on) equal to zero
		// i is less than the length of the melons array
		// ++ increments by one
		for (int i=0; i<melons.length; i++){
			// on the Melon class, the current melon we're on is equal to melons at i (i = whatever number melon we're on)
			Melon currentMelon = melons[i];
			// make a String: sellables
			String sellableString;
			// if the current melon we're on is sellable:
			if (currentMelon.isSellable()){
				// the string should say "can be sold"
				sellableString = "CAN BE SOLD";
				// if not:
			} else {
				// the string should say "not sellable"
				sellableString = "NOT SELLABLE";
			}
			// print out: "Harvested by [whatever the current melon's is] harvester from Field # and it's sellable or not"
			System.out.println("Harvested by " + currentMelon.harvester +
								" from Field " + currentMelon.field +
								" (" + sellableString + ")" );
		}
	  }
	
}

