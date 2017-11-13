public class IntSet {
    public static void main(String[] args) {
        IntSet devin = new IntSet(100);
        IntSet lily = new IntSet(10);
        lily.add(3);
        lily.add(8);
        lily.add(4);
        lily.add(6);
        lily.add(1);
        lily.add(2);


        devin.add(30);

        //subset
        IntSet anna = new IntSet(100);
        anna.add(10);
        anna.add(20);


        IntSet boonk = new IntSet(100);
        boonk.add(1);
        boonk.add(4);
        //testing contains all
        System.out.println("Does anna contain anna: " + anna.containsAll(anna));
        System.out.println("Does anna contain boonk: " + anna.containsAll(boonk));
        devin.addAll(anna);
        System.out.println(devin.contains(10));
        System.out.println(devin.contains(30));

        //mean() Test Code
        IntSet corey = new IntSet(50);
        corey.add(10);
        corey.add(20);
        System.out.println("The mean is: " + corey.mean());

        //Olivia's Test Code Multiply All
        IntSet olivia = new IntSet(11);
                olivia.add(5);
                olivia.add(10);
        IntSet newset = new IntSet(6);
        newset.add(5);
        olivia.multiplyAll(newset ,  2);
        System.out.println(olivia.contains(10));

        IntSet abby = new IntSet(10);
        abby.add(4);
        abby.add(8);
        abby.add(6);

        System.out.println("non-incremented lily:");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ":" + lily.contains(i) + ", ");
        }
        System.out.println();
        System.out.println("incremented lily:");
        lily.incrementAll(abby);
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ":" + lily.contains(i) + ", ");
        }

        //containsAll Test colette
        IntSet colette = new IntSet (6);
        colette.add(1);
        colette.add(2);
        colette.add(3);
        colette.add(4);
        colette.add(5);

        IntSet subSet = new IntSet(3);
        subSet.add(1);
        subSet.add(2);
        System.out.println("Colette's test " + colette.containsAll(subSet));
    }
     /*
      for any number in set s that is in this set, multiply this set by multiplier
    */
    //Olivia
    void multiplyAll(IntSet s, int multiplier) {
        for (int i = 0; i < s.arr.length; i ++) {
            if (contains(i)) {
                add(i * multiplier);
            }
        }
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
        for(int j = 0; j < s.arr.length; j++) {
                if (s.arr[j] != arr[j]) {
                   return false;
                }
        }

        return true;
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
        for (int lily = 0; lily<s.arr.length ; lily++) {
            if(s.arr[lily]){
                this.arr[lily+1]=true;
                this.arr[lily]=false;
            }
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