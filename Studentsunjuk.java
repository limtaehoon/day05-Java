package day05;

public class Studentsunjuk {
        String name;
		int kor,eng,math;
		
		public Studentsunjuk(String name, int kor,int math,int eng ) {
			this.name=name;
			this.kor=kor;
			this.math=math;
			this.eng=eng;
		}
		public void getTotal() {
		System.out.println(name+"����:"+(kor+eng+math));
		}
		public String getAvg() {
		 return	name+"���:"+(kor+eng+math)/3;
}


}
