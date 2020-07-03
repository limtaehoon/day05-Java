package day05;

public class TV {
	String maker;
	int yaer,inch;
	public TV(String maker,int yaer,int inch){
		this.maker=maker;
		this.yaer=yaer;
		this.inch=inch;
	
	}
	public void show() {
		System.out.println(maker+"에서 만든"+yaer+"년 형"+inch+"인치 tv");
	
	}
	
	public static void main(String[] args) {
		TV tv=new TV("lg",2020,60);
		tv.show();//lg에서 만든 2020년형 60인치 tv
		
		TV mytv=new TV("삼성",2019,55);
		mytv.show();//삼성에서 만든 2019년형 55인치 tv
	}

}
