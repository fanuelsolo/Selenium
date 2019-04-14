package abstraction;

public class Honda extends Bike{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h = new Honda();
		h.engine();
		h.seat();
		h.handle();

	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("bikes have handles");
		
	}

	@Override
	public void seat() {
		// TODO Auto-generated method stub
		System.out.println("bikes have seat");
		
	}

}
