package week09;

public class CylinderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder myCylinder=new Cylinder(5.6,2.8,3.141592);
		double vol=myCylinder.radius*myCylinder.radius*myCylinder.height*myCylinder.PI;
		
		System.out.println("원통의 체적은"+vol);
	}

}
