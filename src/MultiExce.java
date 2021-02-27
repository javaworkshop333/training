
public class MultiExce {

	public static void main(String[] args) {
		
		try {
			System.out.println("hi");
			int a=10/2;
			
			int[] arr=new int[3];
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			
			String s=null;
			System.out.println(s.replace("a", "b"));
		}catch(NullPointerException e) {
			System.out.println("do not use dot on null variable");
		}catch(RuntimeException e) {
			System.out.println("do not use dot on null variable");
		}catch(Exception e) {
			System.out.println("do not use index outside the size of array");
		}catch(Throwable e) {
			System.out.println("do not try to divide any number by zero");
		}		
	}

}
