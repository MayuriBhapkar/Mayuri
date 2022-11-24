package Assignment4;
import java.util.List;
import java.util.ArrayList;

public class Task2 {

	public static void main(String[] args) {

		List<String>l1=new ArrayList<>();
		l1.add("Git");
		l1.add("Github");
        l1.add("GitLab");
		l1.add("GitBash");
		l1.add("Selenium");
		l1.add("Java");
		l1.add("Maven");
		System.out.println(l1);
		
		List<String>l2=new ArrayList<>();
		
		for(int i=0;i<l1.size();i++)
		{
	
			if(l1.get(i).startsWith("Git"))
			{
				String str=l1.get(i);
                l2.add(str);

				
			}
		}	
				
            System.out.println(l2);


			
		
	}     
			
		}



		
		
		
		

	


