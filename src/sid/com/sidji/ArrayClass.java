package sid.com.sidji;

public class ArrayClass {
		private long arr [] ;
		private int nelemts;
		//Create an array
		 ArrayClass(int size) {
			arr = new long[size];
			nelemts =0;
		}
		// Inserting element to the array
		public void insert(long value) {
			arr[nelemts] = value;
			nelemts++;
		}
		//Searching elements from the array
		public boolean search(long searchkey) {
			int j;
			for(j =0; j<nelemts;j++) {
				if(arr[j] == searchkey) {
					break;
				}
				}
				if(j == nelemts) {
					return false;
				}else {
					return true;
				}
		}
		// Deleting element form the array
		public boolean Delete(long value) {
			int j;
			for(j =0; j< nelemts; j++) { 
				if(arr[j] == value) {
					break;
				}
			}
			
			if(j == nelemts) { 
				return false;
			}else { 
				for(int k = j ; k < nelemts - 1; k++) 
					arr[k] = arr[k +1];
					nelemts--;
				return true;
			}
		}
		
		
		public void display() {
			for(int j = 0; j < nelemts; j++) {
				System.out.print(arr[j]+","+" ");
			}
		}
		
}







