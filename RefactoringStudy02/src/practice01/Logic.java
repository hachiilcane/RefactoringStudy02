package practice01;

public class Logic {

	public void main() {
		Country c = createInitialData();

		printCapitalCity(c);
		printBigCity(c);
	}

	private Country createInitialData() {
		Country c = new Country();

		for (int i = 0; i < 10; i++) {
			Prefecture p = new Prefecture();

			for (int j = 0; j < 50; j++) {
				City ci = new City();
				ci.setName("City " + i + "," + j);
				if (j % 10 == 0) {
					ci.setIsCapital(true);
				}
				ci.setPopularity(j * 300);
				if (j % 3 == 0) {
					ci.setPopularity(j * 1000);
				}
				p.addCity(j, ci);
			}

			c.addPrefecture(i, p);
		}

		return c;
	}

	private void printCapitalCity(Country c)
	{
		System.out.println("Captitals are:");
		printCityName(c,1);
	}

	private void printBigCity(Country c)
	{
		System.out.println("Big cities are:");
		printCityName(c,2);
	}

	private void printCityName(Country country,int mode)
	{
		for (int i = 0; i < 50; i++) {
			Prefecture prefecture = country.getPrefecture(i);

			if (prefecture != null) {
				for (int j = 0; j < 100; j++) {
					City city = prefecture.getCity(j);
					if (city != null) {
						switch(mode) {
						case 1:
							if (city.getIsCapital()) {
								System.out.println(city.getName());
							}
							break;
						case 2:
							if (city.getPopularity() > 10000) {
								System.out.println(city.getName());
							}
							break;
						}
					}
				}
			}
		}
		System.out.println("---");
	}
}
