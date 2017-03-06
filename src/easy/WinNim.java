package easy;
//292
//You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
//
//Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.
//
//For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
import java.util.HashMap;
import java.util.Map;
//此方法时间复杂度较高
public class WinNim {
//	Map<Integer,Boolean> map=new HashMap<Integer,Boolean>();
//	public boolean canWinNim(int n){
//		if(map.containsKey(n)){
//			return map.get(n);
//		}
//		if(n==1||n==2||n==3){
//			map.put(n,true);
//			return true;
//		}
//		if(canWinNim(n-1)&&canWinNim(n-2)&&canWinNim(n-3)){
//			map.put(n,false);
//			return false;
//		}
//		else{
//			map.put(n, true);
//			return true;
//		}
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		WinNim wn=new WinNim();
//		if(wn.canWinNim(5)){
//			System.out.println("true");
//		}else{
//			System.out.println("false");
//		}
//			
//	}
//
	public boolean canWinNim(int n){
		if(n%4!=0){
			return true;
		}else{
			return false;
		}
	}

}

