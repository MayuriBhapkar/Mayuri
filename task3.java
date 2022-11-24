package Assignment4;
import java.util.List;
import java.util.ArrayList;

public class task3 {

	public static void main(String[] args) {
		
		List<String> MyList=new ArrayList<>();
		MyList.add("Java");
		MyList.add("TestNG");
		MyList.add("TestNG");
        MyList.add("Maven");
        MyList.add("Maven");
        MyList.add("Selenium");
        MyList.add("Selenium");
        MyList.add("Java");
        MyList.add("Java");
		System.out.println(MyList);
		
		List<String>MyList2=new ArrayList<>();
		
		for(int i=0;i<MyList.size();i++)
		{
			
			String str=MyList.get(i);
			MyList2.add(str);

         if(MyList2.get(i).equals(str))
          {
        	 MyList.remove(i);
                           	
          }
		
		}
		System.out.println(MyList);
		
		




	}

}
