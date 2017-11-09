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
		System.out.println("The size is " + is.size());
		System.out.println("The value is " + is.peek(1));
		System.out.println("The multiple list " + Arrays.toString(is.pop(2)));
		//System.out.println("The new list " + is.push(test));
		System.out.println("count " + is.count(3));
		//System.out.println(is.print());
        System.out.println("array " + Arrays.toString(is.toArray()));

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
        int capacity;
    //Item[] temp =(Item[]) * new Object[capacity];
    //int n = is.length;
    //for(int i = 0; i <n; i++)
    }

    /*
    how large is the stack?
    */
    public int size() {
        int size = 0;
        for(int i = top; i >=0; i--){
            size++;
        }
        return size;
    }

    /*
    sort the contents of the stack
    */
    public void sort() {
    if(!isEmpty()){
        int i = pop();
        sort();
    }
    }

    /*
    print the Stack pretty-like
    */
    public void print() {
    if(!isEmpty()){
        for(Object a: stack){
            System.out.println(a);
        }
    }
    }

    /*
    return the item depth distance from the top
    */
    public int peek(int depth) {
    for(int i = top; i>=depth; i--){
        if (i == depth){
            return stack[i];
        }
    }
			return 0;
    }

    /*
    return multiple items from the top in a new array
    */
    public int[] pop(int multiple) {
        int[] multipleNew = new int[multiple];
        int x = 0;
        for(int i = top; i> top-multiple; i--){
            multipleNew[x] =(stack[i]);
            x++;
        }
			return multipleNew;
    }

    /*
    push multiple items onto the stack
    */
    public void push(int[] nums) {
        int x = 0;
        for(int i = 0; i<nums.length; i++)
        if(top == stack.length) resize();
        stack[top++] = nums[x];
        x++;
    }


    /*
    how many [num]'s are n the stack?
    */
    public int count(int num) {
        int count = 0;
        for(int i =top; i>=0; i--){
            if (stack[i] == num){
                count++;
            }
        }
			return count;
    }


    /*
    remove depth items
    */
    public void dump(int depth) {
    for(int i = top; i>=depth; i--){
        pop();
        }
    }

    /*
    return the contents of the stack as an array
    */
    public int[] toArray() {
        int [] arrayVersion = new int [stack.length];
        int x = 0;
        for(int i =0; i < stack.length; i++){
            arrayVersion[x] = stack[i];
            x++;
        }
			return arrayVersion;
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
