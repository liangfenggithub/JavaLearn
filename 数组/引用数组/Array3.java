public class Array3{
	int a,b;
	public void setAB(int a,int b){
		this.a = a;
		this.b = b;
	}
	public int getA(){
		return this.a;
	}
	public int getB(){
		return this.b;
	}
	public static void main(String[] args){
		Array3[] arr = new Array3[10];
		System.out.println("array begin");
		for(int i = 0; i< arr.length; i++){
			if(i==0){
				arr[0].setAB(1,2);
			}else{
				int atemp = arr[i-1].getA()+arr[i-1].getB();
				int btemp = arr[i-1].getA()*arr[i-1].getB();
				arr[i].setAB(atemp,btemp);
			}
		}
		for(int j = 0; j < arr.length; j++){
			System.out.println("arr["+ j +"] a:" + arr[j].getA()+" b:"+arr[j].getB());
		}
	}
}