package recursion;

import java.util.Scanner;

public class TestRecursion {

	QuickSort qs = new QuickSort(8);  //maxSize
	
	public TestRecursion() {

		while(true) {
			System.out.println("1. [recursion] add ");
			System.out.println("2. [recursion] sort ");
			System.out.println("3. [recursion] print ");
			System.out.println("4. ����");
			
			Scanner scan = new Scanner(System.in);
			System.out.print("�Է�>>>");
			int num = scan.nextInt();
			
			if(num==4)break;
			
			switch(num) {
			case 1:
				System.out.print("�߰� �� ����:");
				int addNum=scan.nextInt();
				if(!qs.add(addNum)) {
					System.out.println("���̻� �߰� �� �� �����ϴ�.");
					}
				break;
			case 2:
				qs.sorting();
				break;
			case 3:
				System.out.print(qs.getFirst()+" ");
				for(int i=1; i<qs.size(); i++) {
					System.out.print(qs.getNext()+" ");
				}
				qs.init();
				System.out.println();
				break;
			
			}
		}
	}
	
	public static void main(String[] args) {
		new TestRecursion();
	}

}
