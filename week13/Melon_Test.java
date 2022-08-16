package week13;

class Food{
	private int cal;
	private int cost;
	private int kg;
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	
}
class Melon extends Food{
	private String info;
	private int cal;
	private int cost;
	private int kg;
	

	public Melon(int cal, int cost, int kg, String info) {
		super();
		this.info = info;
		this.cal = cal;
		this.cost = cost;
		this.kg = kg;
	}

	
	public int getCal() {
		return cal;
	}


	public void setCal(int cal) {
		this.cal = cal;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public int getKg() {
		return kg;
	}


	public void setKg(int kg) {
		this.kg = kg;
	}


	public String getInfo() {
		return info;
	}
