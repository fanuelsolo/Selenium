
public class reverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String m = "my mom is cute";
		String t = "";
		
		for (int i = m.length()-1; i >= 0; i--) {
			t = t + m.charAt(i);
			
		}
		System.out.println(t);

	}

}
