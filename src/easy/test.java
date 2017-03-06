package easy;

public class test {

	public static int hammingDistance(int x, int y) {
				
	     String xInt = Integer.toBinaryString(x);   
		 String yInt = Integer.toBinaryString(y);
		 int num=0;
		 int i = xInt.length()-1,j = yInt.length()-1;
		for(;i>=0&&j>=0;i--,j--){
			if(xInt.charAt(i)!=yInt.charAt(j)){
				num++;
			}
			
		}
		if(i>=0){
			for(;i>=0;i--){
				if(xInt.charAt(i)=='1'){
					num++;
				}
			}
		}
		if(j>=0){
			for(;j>=0;j--){
				if(yInt.charAt(j)=='1'){
					num++;
				}
			}
		}
		return num;
	 }
	 public static void main(String[] args){
		 int x=1;
		 int y =4;
		 
		 System.out.println(hammingDistance(x,y));
	 }
}
