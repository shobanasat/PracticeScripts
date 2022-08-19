package Example3;

import java.util.*;

public class Copying {

	public static void main(String[] args) {
		List<String> destination_list = new ArrayList<>();
		Collections.addAll(destination_list, "Lion","Tiger","Cheetah","Leopard");
		
		System.out.println("Original Destination List...");
		
		for(int i=0;i<destination_list.size();i++) {
			System.out.print(destination_list.get(i) + " ");
		}
		
		List<String> source_list = new ArrayList<>();
		Collections.addAll(source_list, "Dog","cat","rat");
		
		Collections.copy(destination_list, source_list);
		
		System.out.println();
		System.out.println();
		System.out.println("Destination List after copy...");
		
		for(int i=0;i<destination_list.size();i++) {
			System.out.print(destination_list.get(i) + " ");
		}
	}

}
