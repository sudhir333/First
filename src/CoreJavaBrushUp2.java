import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] val = {2,3,4,7,8,15,10,23,24};
        for(int i=0; i<val.length; i++) {
        	if(val[i] % 2 == 0) {
        		System.out.println(val[i]);
        		break;
        	}else {
        		System.out.println(val[i] + " is not multiple of 2");
        	}
        }
        
        ArrayList<String> arr = new ArrayList<>();
		arr.add("Sudhir");
		arr.add("Kumar");
		arr.add("Gautam");
		//System.out.println(arr.get(1));
		//System.out.println(arr.get(2));
		System.out.println(arr.contains("Sudhir"));
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("*************************");
		
		String s1 = "Sudhir Kumar Gautam";
		String[] splitString = s1.split(" ");
		for(int i=0; i<splitString.length; i++) {
			System.out.println(splitString[i]);
		}
		
		
		for(int i=0; i<s1.length(); i++) {
			System.out.println(s1.charAt(i));
		} 
		
		for(int i=s1.length()-1; i>=0; i--) {
			System.out.println(s1.charAt(i));
		}
		
	}

}
