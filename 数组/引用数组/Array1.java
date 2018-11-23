public class Array1{
	public static void main(String[] args){
		System.out.println("hello array");
		String[] s= new String[3];
		s[0] = new String("hi");
		s[1] = new String("i am");
		s[2] = new String("object array");
		for(int i = 0; i< s.length;i++){
			System.out.println(s[i]);
		}
	}
}