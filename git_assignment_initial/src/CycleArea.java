public class CycleArea implements ISubscriber {
    public CycleArea() {
		// TODO Auto-generated constructor stub
	}

	public double CycleArea(double r){
		double area =3.14*(r*r);
                return area ;
	}

	@Override
	public void notifySubscriber(String input) {

		int r = Integer.parseInt(input);
                System.out.println("CycleArea is : " + CycleArea(r));

	}

    
    
}
