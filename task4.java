package Assignment4;
import java.util.List;
import java.util.ArrayList;

public class task4 {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(45);
		l1.add(90);
		l1.add(45);
		l1.add(23);
		l1.add(90);
		l1.add(44);
		System.out.println(l1);
		
		List<Integer> l2=new ArrayList<>();

		
		 Integer i1=l1.get(1);
	     l2.add(i1);
	     
	     Integer i2=l1.get(l1.size()-2);
		 l2.add(i2);
       
	   System.out.println(l2);
	    

	}

}
