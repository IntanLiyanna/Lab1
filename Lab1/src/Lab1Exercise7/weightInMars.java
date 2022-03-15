package Lab1Exercise7;

public class weightInMars {
	
	double mass;
	
	public weightInMars(double mass){
		this.mass = mass;
	}
	
	void setMass(double mass) {
		this.mass = mass;
	}
	
	public void calculateWeight() {
		double weightEarth = mass * 9.81;
		double weightMars = mass * 3.71;

		System.out.println("Human Mass      : "+ mass +"kg\nWeight on Earth : " + weightEarth +" N\nWeight on Mars  : "+ weightMars +" N\n");
	}
	
}
