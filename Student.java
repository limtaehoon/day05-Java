package day05;

public class Student {

	int StudentID;// 학번
	String name;// 이름
	int graed;//점수
	String address;//주소

	// 공부하다(행위)->메서드
	public void study() {
		System.out.println(name +"공부하다");
	}

	public static void main(String[] args) {
		Student s1=new Student();		
			
		s1.StudentID=100;
		s1.name="홍길동";
		s1.graed=1;
		s1.address="부산";
		System.out.println("s1 이름:"+s1.name);
		
		Student s2=new Student();
		s2.StudentID=200;
		s2.name="이순신";
		s2.graed=4;
		s2.address="서울";
		System.out.println("s2 이름:"+s2.name);
				/*이름이 강감찬이고 3학년에 인천에 사는 학생s3을 
				 * 생성하고  s3의 이름과 주소를 출력하시오
				 *
				 */
		Student s3=new Student();
	    s3.name="강감찬";
	    s3.graed=3;
		s3.address="인천";
		System.out.println("s3 이름:"+s3.name);
		System.out.println("s3 주소:"+s3.address);
		//홍길동이 공부하다
						s1.study();
		//강감찬이 공부하다 
						s3.study();
					
		//학생은 play()라는 함수를 가지고 있고	
		//여기에서 이름 운동한다라는 값을 출력하기
	   
		
		
	
	}

}
