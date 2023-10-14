package training.assesment;

import java.util.Scanner;

public class MenuCard {
	String item1;
	String item2;
	String item3;

	public MenuCard(String item1, String item2, String item3) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
	}
	
	public MenuCard(String item1, String item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public MenuCard(String item1) {
		this.item1 = item1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. of items");
		int items= scanner.nextInt();
		if(items ==1) {
			String item1=scanner.nextLine();
			MenuCard card1 = new MenuCard(item1);
			System.out.println(card1.item1);
		}else if (items==2) {
			String item1=scanner.nextLine();
			String item2=scanner.nextLine();
			MenuCard card2 = new MenuCard(item1, item2);
			System.out.println(card2.item1);
			System.out.println(card2.item2);
		}else if (items==3) {
			String item1=scanner.nextLine();
			String item2=scanner.nextLine();
			String item3=scanner.nextLine();
			MenuCard card3 = new MenuCard(item1, item2,item3);
			System.out.println(card3.item1);
			System.out.println(card3.item2);
			System.out.println(card3.item3);
		}else {
			System.out.println("Quantity Exceeded");
		}
		
	}
}

