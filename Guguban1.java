package day05;

public class Guguban1 {
int dan;
	public Guguban1(int dan)	{
	
	 this.dan=dan;
	}
	public void viewData( ) {
		System.out.println(dan+"단출력");
		for(int i=1;i<10;i++) {
		System.out.println(dan+"*"+i+"="+dan*i);
	}
	}
		
		
	public static void main(String[] args) {
		Guguban1 g1=new Guguban1(5);
		g1.viewData();
		
		
		
		//5단
	Guguban1 g2=new Guguban1(7);
	g2.viewData();
	}

}
