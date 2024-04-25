import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int val = 5;
		String name = "sudhir";
		
		System.out.println(val+" is a integer");
		
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/*
		 * int i=0; while(i<=2) { System.out.println(arr[i]); i++; }
		 */
		
		String[] names = {"Sudhir","Kumar","Gautam","Pooja"};
		for(int j=0; j<names.length; j++) {
			System.out.println(names[j]);
		}
		
		System.out.println("**********************");
		
		List<String> ArrNames = Arrays.asList(names);
		for(int i=0; i<ArrNames.size(); i++) {
			System.out.println(ArrNames.get(i));
		}
		System.err.println(ArrNames.contains("Gautam"));
		
	}

}
