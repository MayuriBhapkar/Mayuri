package Assignment4;
import java.util.List;
import java.util.ArrayList;


public class task5 {

	public static void main(String[] args) {
		
		List<List<Integer>> MainList=new ArrayList<>();
		List<Integer> l1=new ArrayList<>();
		l1.add(11);
		l1.add(22);
		l1.add(33);
		
		List<Integer> l2=new ArrayList<>();
		l2.add(9);
		l2.add(19);
		l2.add(29);
		
		List<Integer> l3=new ArrayList<>();
		l3.add(7);
		l3.add(17);
		l3.add(27);
		
		MainList.add(l1);
		MainList.add(l2);
		MainList.add(l3);
		System.out.println(MainList);
		


		
		

		

	}

}
