package practice01;

public class City {
	private String _name;
	private boolean _isCapital;
	private int _popularity;

	public String getName() {
		return _name;
	}
	public void setName(String name) {
		this._name = name;
	}
	public boolean getIsCapital() {
		return _isCapital;
	}
	public void setIsCapital(boolean isCapital) {
		this._isCapital = isCapital;
	}
	public int getPopularity() {
		return _popularity;
	}
	public void setPopularity(int popularity) {
		this._popularity = popularity;
	}
}
