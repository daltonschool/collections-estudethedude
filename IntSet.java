public class IntSet {
    public static void main(String[] args) {
        IntSet devin = new IntSet(100);
        devin.add(30);

        //subset
        IntSet anna = new IntSet(100);
        anna.add(10);
        anna.add(20);

        devin.addAll(anna);
        System.out.println(devin.contains(10));
        System.out.println(devin.contains(30));

        //mean() Test Code
        IntSet corey = new IntSet(50);
        corey.add(10);
        corey.add(20);
        System.out.println("The mean is: " + corey.mean());
    }


    boolean[] arr;

    public IntSet(int size) {
        arr = new boolean[size];
    }

    void add(int i) {
        arr[i] = true;
    }

    void remove(int i) {
        arr[i] = false;
    }

    boolean contains(int i) {
        return arr[i];
    }

    //BULK FUNCTIONS:

    /*
    returns true if s is a subset of set
    */
    boolean containsAll(IntSet s) {
        return false;
    }

    /*
    add all items in set s to this set.
    */
    void addAll(IntSet s) {
        for (int i = 0; i < s.arr.length; i++) {
            if (s.arr[i] = true) {
                arr[i] = true;
            }
            i++;
        }
    }


    /*
    remove all items from this set that are not in set s (intersection)
    */
    void retainAll(IntSet s) {

    }

    /*
    remove all items in s from this set
    */
    void removeAll(IntSet s) {
        for (int i = 0; i < s.arr.length; i++) {
            if (s.arr[i]) {
                arr[i] = false;
            }
        }
    }

    /*
    increment every number in the set by 1
    */
    void incrementAll(IntSet s) {

    }

    /*
      for any number in set s that is in this set, multiply this set by multiplier
    */
    void multiplyAll(IntSet s, int multiplier) {
    	for (int i = 0; i < s.arr.length; i ++) {

		}

    }

    /*
    does the set contain all of the prime factors of number
    */
    boolean containsPrimeFactors(int number) {
        return false;
    }

    /*
    all the subsets that can be generated of subSetSize size
    */
    IntSet[] subSets(int subSetSize) {
        return null;
    }

    /*
    the subSetSize largest items
    */
    IntSet maxSubSet(int subSetSize) {
        return null;
    }

    /*
    return an array of two sets,
    the set of numbers above divide, and those below
    */
    IntSet[] discrete(int divide) {
        return null;
    }

    /*
    finds this intersection of this and all sets in the array
    */
    boolean containsAll(IntSet[] s) {
        return false;
    }

    /*
    print the set pretty like.
    */
    void print() {

    }

    /*
    finds the gcd of the set
    */
    int gcd() {
        return 0;
    }

    /*
    finds the mean of the set
    */
    int mean() {
        int howManyTimes = 0;
        int average = 0;
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                total += i;
                howManyTimes++;
            }
        }
        average = total / howManyTimes;
        return average;

        }
    }