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
		for (int i = 0; i < 50; i++) {
			Prefecture p = c.getPrefecture(i);

			if (p != null) {
				for (int j = 0; j < 100; j++) {
					City ci = p.getCity(j);
					if (ci != null) {
						if (ci.getIsCapital()) {
							System.out.println(ci.getName());
						}
					}
				}
			}
		}
		System.out.println("----");
	}

	private void printBigCity(Country c)
	{
		System.out.println("Big cities are:");
		for (int i = 0; i < 50; i++) {
			Prefecture p = c.getPrefecture(i);

			if (p != null) {
				for (int j = 0; j < 100; j++) {
					City ci = p.getCity(j);
					if (ci != null) {
						if (ci.getPopularity() > 10000) {
							System.out.println(ci.getName());
						}
					}
				}
			}
		}
		System.out.println("---");
	}
}
