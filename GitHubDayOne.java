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



}