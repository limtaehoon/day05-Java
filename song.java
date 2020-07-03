package day05;

public class song {
     	
	
		int yaer;
		String add;
		String name;
		String title;
	public song(int year,String add ,String name,String title) {
		this.yaer=year;
		this.add=add;
		this.title=title;
		this.name=name;
	}
	public void show() {
		System.out.println(yaer+"에"
				+add+"의"+title+"이"+name+"을 부름");
	}
	
	

}
