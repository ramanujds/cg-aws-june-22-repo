import java.util.*;

class CollectionBasics{

	public static void main(String []ags){
		
		Collection<String> items = new PriorityQueue<>();
		items.add("Mahesh");
		items.add("Tushar");
		items.add("Suraj");
		items.add("Harsh");
		items.add("Suraj");
		items.add("Tushar");

		for(var item:items){
			System.out.println(item);
		}
		
	
	}
}