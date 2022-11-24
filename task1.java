package Assignment4;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class task1 {

	public static void main(String[] args) {
		

		List<String> l1=new ArrayList<>();
		l1.add("Java");
		l1.add("Selenium");
		l1.add("TestNG");
		l1.add("Git");
		l1.add("Github");
		System.out.println(l1);
		//Collections.reverse(l1);
		//System.out.println(l1);
		
         List <String> l2=new ArrayList<>();
         
		for(int i=l1.size()-1;i>=0;i--)
	   {
		   String str=l1.get(i);
		   l2.add(str);
	   }
		  System.out.println(l2);

		}
		

	
		  
		  
	
		
		




	}


