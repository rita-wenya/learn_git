package sort;

public class Insert_sort {
	public void Insert_sort(int A[]){
		long a=System.currentTimeMillis();
		int n=A.length;
		int i;
		int key;
		for(int j=1;j<n;j++){
			i=j-1;
			key=A[j];
			while(i>=0&&A[i]>key){
				A[i+1]=A[i];
				i=i-1;
			}
			A[i+1]=key;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	}

}
