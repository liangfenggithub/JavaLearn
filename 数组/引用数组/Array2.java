public class Array2{
	int a,b;
	public static void main(String[] args){
		Array2[] s = new Array2[2];
		s[0] = new Array2();
		s[1] = new Array2();
		s[0].a = 10; s[0].b = 20;
		s[1].a = 30; s[1].b = 40;
		System.out.println("s[0] is :"+ s[0].a + s[0].b);
		System.out.println("s[0] is :"+ s[1].a + s[1].b);
	}
}