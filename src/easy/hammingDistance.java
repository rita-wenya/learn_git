package easy;
//461
//The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
//Given two integers x and y, calculate the Hamming distance.
public class hammingDistance {
	public int hammingDistance(int x, int y) {
		// ^这个运算符是按位异或运算,两个操作数的位中，相同则结果为0，不同则结果为1。
		int n = x ^ y;
		//&按位与
		int count = 0;
		while (n != 0) //当n不等于0时
		{
			count++;
			n = n & (n - 1);
		}
		//x^y leaves all the bits that are different.
		//Each time, n & (n - 1) remove the last 1 bit of n.
		return count;
	}
}

//方法2 转成2进制字符串后不能直接比较，因为位数不一样
/*public class Hamming_Distance {
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
}*/
