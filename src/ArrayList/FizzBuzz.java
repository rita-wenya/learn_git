package ArrayList;

import java.util.ArrayList;
import java.util.List;

/*412
 * Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 * */
public class FizzBuzz {

	public List<String> fizzBuzz(int n){
		List<String> s=new ArrayList<String>();
		for(int i=1;i<=n;i++){
			if(i%3==0){
				s.add("Fizz");
			}else if(i%5==0){
				s.add("Buzz");
			}else if(i%15==0){
				s.add("FizzBuzz");
			}
			else{
				s.add(Integer.toString(i));
			}
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz fizz=new FizzBuzz();
		List<String> test=new ArrayList<String>();
		test=fizz.fizzBuzz(15);
		System.out.println(test);
	}

}


/*方法2：Arrays.asList()将一个数组转化为一个List对象，这个方法会返回一个ArrayList类型的对象
 *String.valueOf(int i) : 将 int 变量 i 转换成字符串
 */
/*public List<String> fizzBuzz(int n) {
    String[] arr = new String[n];
    for (int i = 0, j = 1; i < n; i++, j++) {
        if      (j % 15 == 0) arr[i] = "FizzBuzz";
        else if (j %  3 == 0) arr[i] = "Fizz";
        else if (j %  5 == 0) arr[i] = "Buzz";
        else                  arr[i] = String.valueOf(j);
    }
    return Arrays.asList(arr);
}
*/