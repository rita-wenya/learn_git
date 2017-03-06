package string;
import java.util.*;
public class longestConsecutive {

	public int longestConsecutive(int[] num){
	    if(num==null||num.length==0){
	        return 0;
	    }
	    Arrays.sort(num);
	    int count=1;
	    int max=1;
	    for(int i=1;i<num.length;i++){
	        if(num[i]==num[i-1]+1){
	            count++;
	            if(count>max){
	                max=count;
	            }
	        }
	        else if(num[i]==num[i-1])
                {
                continue;
            }
	        else{
	            
	            count=1;
	        }
	        
	    }
	    return max;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		longestConsecutive t=new longestConsecutive();
	    int[] nums={1,2,2,8,3};
	    
		System.out.println(t.longestConsecutive(nums));
	}
}