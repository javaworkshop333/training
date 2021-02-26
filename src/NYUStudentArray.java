
public class NYUStudentArray {

	public static void main(String[] args) {
		NYUStudent ny1=new NYUStudent();

		// array holds group of references, uninitialized		
		NYUStudent [] nyArr=new NYUStudent [1000];
		System.out.println(  nyArr[0]   );

		nyArr[0] =new NYUStudent();
		// initialize each index in the array
		for(int i=0;  i<nyArr.length ; i++ ) {
			nyArr[i]=new NYUStudent();
		}
		
		System.out.println(  nyArr[0]   );
		
		
		NYUStudent [][] nyArr2=new NYUStudent [2][3];
		for(int i=0; i < nyArr2.length; i++) { // length as 2
			
			for(int j=0; j < nyArr2[i].length; j++) { // lenght as 3
				nyArr2[i][j]=new NYUStudent();
			}
			
		}
		// i=0, j=0,1,2
		// [0][0] , [0][1] , [0][2]
		// i=1, j=0,1,2		
		// [1][0] , [1][1] , [1][2]
	}

}
