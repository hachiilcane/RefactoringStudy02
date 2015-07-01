package practice01;

public class Prefecture {
	private City[] _cities = new City[100];

	public void addCity(int i, City c) {
		_cities[i] = c;
	}
	public City getCity(int i) {
		return _cities[i];
	}
}
