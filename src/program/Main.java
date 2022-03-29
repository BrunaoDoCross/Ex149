package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		SimpleDateFormat y = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Number of products: ");
		int x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
			System.out.printf("Common, used or imported? (c/u/i)");
			char c = sc.next().charAt(0);
			System.out.printf("Name: ");
			String name = sc.next();
			System.out.printf("Price: ");
			Double price = sc.nextDouble();
			if(c == 'i' || c=='I') {
				System.out.printf("Customs fee: ");
				Double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			else if(c == 'u' || c == 'U') {
				System.out.printf("Manufacture date: ");
				Date manufactureDate = y.parse(sc.next());
				list.add(new UsedProduct(name, price, manufactureDate));
			}
			else {
				list.add(new Product(name, price));
			}
		}
		
		System.out.println("\n\nPrice Tags:");
		for (Product prod : list) {
			System.out.println(prod);
		}
		
		
		sc.close();
	}

}
