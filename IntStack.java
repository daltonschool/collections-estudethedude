public class IntStack {
	public static void main(String[] args) {
		IntStack is = new IntStack();
		System.out.println(is.isEmpty());
		is.push(3);
		is.push(4);
		is.push(5);
		System.out.println(is.isEmpty());
		System.out.println(is.pop());
		System.out.println(is.peek());
		is.print();
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

	int pop() {
		if(!isEmpty()) return stack[--top];
		return -1;
  }	

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
        return top +  1;
    }

    /*
    sort the contents of the stack
    */
    public void sort() {

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
			return 0;
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
