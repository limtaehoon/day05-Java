package day05;

import java.util.Scanner;

public class Trianglemain {
	public static void main(String[] args) {
		Triangle tr= new Triangle(10.2,17.3);
		System.out.println("삼각형의 면적"+tr.getArea());
		tr.setBottom(7.5);
		tr.setHeight(11.2);
		System.out.println("삼각형의 면적"+tr.getArea());
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("1.삼각형 넓이 구하기 2.종료");
			int num=sc.nextInt();
			if(num==2) {
				System.out.println("프로그램 종료");
				break;
			}else if(num==1) {
		
					System.out.println("삼각형의 밑변>>");
					double b=sc.nextDouble();
					System.out.println("삼각형의 높이>>");
					double h=sc.nextDouble();
					Triangle tr1=new Triangle(b,h);
					System.out.println("입력삼각형의 면적:"+tr1.getArea());
			}else {
				System.out.println("입력오류");
			}
		}
		sc.close();
	
	}
	
			
	}
	
