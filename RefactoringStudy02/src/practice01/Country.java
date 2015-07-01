package practice01;

public class Country {
	private Prefecture[] _prefectures = new Prefecture[50];

	public void addPrefecture(int i, Prefecture p) {
		_prefectures[i] = p;
	}

	public Prefecture getPrefecture(int i) {
		return _prefectures[i];
	}
}
