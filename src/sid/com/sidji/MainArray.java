package sid.com.sidji;
import java.util.*;
public class MainArray {

	public static void main(String[] args) {
			ArrayClass ar  = new ArrayClass(100);
			
			ar.insert(1);
			ar.insert(2);
			ar.insert(3);
			ar.insert(4);
			ar.insert(5);
			ar.insert(6);
			ar.insert(7);
			ar.insert(8);
			ar.insert(9);
			ar.insert(10);
			
			ar.display();
			System.out.println();
		
		  ar.display(); 
		  System.out.println();
		  System.out.println("Enter the Searchkey :");
		  Scanner sc = new Scanner(System.in); 
		  int searchkey = sc.nextInt(); 
		  
		 
			//int searchkey = 6;
			if(ar.search(searchkey)) {
				System.out.println("Found "+searchkey);
			}else{
				System.out.println("Can't found :"+searchkey );
			}
			
			ar.Delete(6);
			System.out.println("After Deleting element");
			ar.display();
	}

}
