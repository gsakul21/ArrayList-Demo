import java.util.ArrayList;

public class GitHubDayOne{

	public static void main(String[] args){


	}


public static ArrayList<Integer> Combine(ArrayList<Integer> a, ArrayList<Integer> b){
	ArrayList<Integer> c = new ArrayList<>();
	for(int x = 0; x < a.size(); x++)
		c.add(x, a.get(x));

	for(int x = 0; x < b.size(); x++)
		c.add((a.size() + x), b.get(x));

		return c;


}

public static void Output(ArrayList<Integer> a){

	for(int x = 0; x < a.size(); x++){

		if(x != a.size() - 1)
		System.out.print(a.get(x)+", ");

		else
		System.out.print(a.get(x));

	}

/*public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> a){
	int a = 0;
	for(int x = 0; x < a.size(); x++){
		a = a.get(x);

			int b = 0;

			for(int x = 0; x <a.size(); x++){

				if(a = a.get(x))
				b++;
			}

		if(b > 1){
			for(int x = 0; x < a.size();x++){



			}


		}

*/

}

}