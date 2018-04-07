import java.util.*;

public class Selection_Sort {

	public static void main(String[] args) {
		Scanner scanf=new Scanner(System.in);
		
		int i,j,size,temp;
		int array[]=new int[100];
		System.out.println("Enter the number of elements to get sorted->");
		size=scanf.nextInt();
		System.out.println("Enter the elements ->");
		for(i=0;i<size;i++){
			array[i]=scanf.nextInt();
		}
		scanf.close();
		System.out.println("Sorted lists are given below(Showing every pass)->");
		for(i=0;i<size;i++){
			for(j=i+1;j<size;j++){
				if(array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				for(int k=0;k<size;k++){
					System.out.print(array[k]+" ");
				}
				System.out.println();
			}
		}
	}

}
