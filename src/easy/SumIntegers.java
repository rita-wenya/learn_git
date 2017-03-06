package easy;
//371 Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
//首先发现，在做某位的加法时，单看这一位。如果两个数相同，得出的是0，反正为1。这不就是异或嘛！ 
//知道了这个，怎么处理进位呢？继续做，发现进位的特点是：都是进到下一位，且当且仅当两个加数都是1时，才可产生进位（明显是按位与啊）。把按位与得到的数字左移一位，把其当成一个新的数字，和上一步逐位异或得到的数字相加。 
//加到最后，肯定就不产生进位了。所以按位与的结果一定是0，这就是while的终止条件。
public class SumIntegers {
	 public int getSum(int a, int b) {
	     if(b == 0){//没有进为的时候完成运算
	        return a;
	    }
	    int sum,carry;
	    sum = a^b;//完成第一步加发的运算
	    carry = (a&b)<<1;//完成第二步进位并且左移运算
	    return getSum(sum,carry);//
	    }
}
