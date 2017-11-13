import java.util.ArrayList;
import java.util.Arrays;
public class IntStack {
	public static void main(String[] args) {
		IntStack is = new IntStack();
		System.out.println(is.isEmpty());
		int [] test = new int [3];
		test[0] = 1;
		test[1] = 2;
		test [2] = 3;
		is.push(3);
		is.push(4);
		is.push(5);
		System.out.println(is.isEmpty());
		System.out.println(is.pop());
		System.out.println(is.peek());
		is.print();

	    //Anna's test:
        IntStack anna = new IntStack();
        int items = 200;
        while(items>0) {
            anna.push(3);
            items --;
        }
        anna.push(1);
        System.out.println(anna.pop());

        //Olivia's Test:
        System.out.println("Olivia is testing pop: " + anna.pop());
        //Abby's test:
        is.print();
        is.sort();
        System.out.println("sorted list: ");
        is.print();

        //colette's test
        IntStack colette = new IntStack();
        colette.push(1);
        colette.push(2);
        colette.push(3);
        colette.push(4);
        colette.push(5);
        System.out.println("Peek value: " + colette.peek());


        //Jon's test:
        IntStack jon = new IntStack();
        int[] testArray = new int[]{7, 24,30,36};
        jon.push(testArray);
        System.out.print(jon.pop() + ", ");
        System.out.print(jon.pop() + ", ");
        System.out.print(jon.pop() + ", ");
        System.out.print(jon.pop());
    }



	int[] stack;
	int top;
	
	public IntStack() {
		stack = new int[100];
		top = 0;
	}
	
	boolean isEmpty() {
		return top==0;
	}

	void push(int i) {
		if(top==stack.length) resize();
		stack[top++]=i;
	}
    //Olivia's Stack
	int pop() {
	   top--;
	   return stack [top];
  }
    //colette
	int peek() {//sometimes
		if(!isEmpty()) return stack[top-1];	
		return -1;
	}

    /*
    make a new larger implementing array
    */
    private void resize() {
        int[]newArr = new int[stack.length*100];
        for(int i = 0; i<stack.length; i++){
            newArr[i] = stack[i];
            }
        stack = newArr;

    }

    /*
    how large is the stack?
    */

    public int size(){
        return top + 1;
    }

    /*
    sort the contents of the stack
    */
    public void sort() {
        int[]trimmedArr = new int[top+1];
        for(int i = 0; i<trimmedArr.length; i++){
            trimmedArr[i] = stack[i];
        }
        stack = trimmedArr;
        Arrays.sort(stack);
    }


    /*
    print the Stack pretty-like
    */
    public void print() {
        for(int i = top ; i >=0; i--){
            if(i == top){
                System.out.println("TOP    |  "+stack[i]);
            }else{
                System.out.println("       |  "+stack[i]);
            }
        }
    }

    /*
    return the item depth distance from the top
    */
    public int peek(int depth) {
		if (top-(depth+1) < 0 || isEmpty()) {
    		return -1;
		}
		return stack[top-(depth+1)];
    }

    /*
    return multiple items from the top in a new array
    */
    public int[] pop(int multiple) {
			return null;
    }

    /*
    push multiple items onto the stack
    */
    public void push(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
                push(nums[i]);
            }

    }


    /*
    how many [num]'s are n the stack?
    */
    public int count(int num) {
			return 0;
    }

    /*
    remove depth items
    */
    public void dump(int depth) {

    }

    /*
    return the contents of the stack as an array
    */
    public int[] toArray() {
			return null;
    }

    /*
    make the bottom of the stack the top
    */
    public void flip() {

    }

    /*
    return a new stack that includes the top size items.
    */
    public IntStack subStack(int size) {
			return null;
    }

    /*
    divide every item in the stack by mult
    */
    public void divStack(int mult) {

    }


}
