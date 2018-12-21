import java.util.*;

public class Calculator implements Calc {
	Deque<LargeNum> q = new ArrayDeque<LargeNum>();
	
	public void Addition(){}
	public void Substraction(){}
	public void Multiplication(){}
	public void Division(){}
	
	public void Print(){
		System.out.println();
	}
	public void Clear(){
		while(q.peek() != null){
			q.remove();
		}
	}
}
