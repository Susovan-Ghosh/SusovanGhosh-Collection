
public class TestCustomCollection {
	public static void main(String[] args) {
		CustomCollection<Integer> numbers=new CustomCollection<Integer>();
		//add:-
		for(int i=0;i<=15;i++)
			numbers.add(i);
		//fetching:-
		System.out.println("Data at index-12 :"+numbers.get(12));
		//removing:-
		numbers.remove(13);
		numbers.remove(14);
		//displaying:-
		numbers.display();
	}
}