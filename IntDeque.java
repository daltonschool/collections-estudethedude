public class IntDeque {
  int[] q;
  int head, tail;


  public IntDeque(int defaultsize) {
    q = new int[defaultsize];
    head = 0;
    tail = 0;

  }

  public static void main(String[] args) {
    IntDeque anna = new IntDeque(100);
    System.out.println(anna.peekLast());

    IntDeque corey = new IntDeque(100);
    System.out.println(corey.peekFirst());

    IntDeque abby = new IntDeque(100);
    abby.putFirst(4);
    System.out.println(abby.peekFirst());

    IntDeque olivia = new IntDeque(100);
    System.out.println(olivia.getFirst());

    IntDeque jon = new IntDeque(100);
    jon.putLast(5);
    System.out.println(jon.peekLast());
  }


  /*
  put the first item
  */
  public void putFirst(int item) {
    if (head == 0) {
      q[q.length - 1] = item;
      head = q.length - 1;
    } else {
      q[head - 1] = item;
    }
  }

  /*
  put the last item
  */
  public void putLast(int item) {
    if (tail == 0) {
      tail = q.length;
      q[q.length - 1] = item;
    }
    else  {
      q[tail] = item;
    }
  }

  /*
  return the first item
  */
  public int peekFirst() {
    if (head == tail) return -1;
    return q[head];

  }

  /*
  return the last item
  */
  public int peekLast() {
    if (head == tail) return -1;
    return q[tail - 1];
  }


  /*
  get the first item
  */
  public int getFirst() {
    if (head == tail)
      return head;
    return q[head];
  }

  /*
  get the last item
  */
  public int getLast() {
    return 0;
  }

  /*
  move num items from first to last
  move num items from first to last
  */
  public void circ(int num) {

  }

  /*
  return a Stack from this deque
  */
  public IntStack toStack() {
    return null;
  }

  /*
  multiply every two items in the queue together,
  such that the array is half the size
  */
  public void multQueue() {

  }

  /*
  return a Deque which includes only every odd item in this queue
  */
  public IntDeque oddQueue() {
    return null;
  }

  /*
  print the Deque to the screen
  */
  public void print() {

  }

    /*
    add an item to the middle
    */
    public void middle(int i) {

    }

    /* 
    put an item on both sides
    */
    public void putBoth(int i) {
        
    }

    /*
    get an item from both sides
    */
    public int[] getBoth() {
        return null;
    }




}
