
import java.util.List;
import java.util.Random;




public class IntList {
    public static void main(String[] args) {
        IntList l = new IntList(4);
        l.add(0, 1);
        l.add(1, 2);
        l.add(2, 3);
        l.add(3, 4);
        for (int i = 0; i < l.size; i++) {
            System.out.print(l.get(i));
        }

        System.out.println();

        //abbys test code
        shuffle(l);
        for (int i = 0; i < l.size; i++) {
            System.out.print(l.get(i));
        }

        System.out.println();

        fill(l, 10);
        for (int i = 0; i < l.size - 1; i++) {
            System.out.println(l.get(i));
        }

        //swap() test code
//        int i = 0;
//        int j = 1;
//
//        IntList l = new IntList(4);
//        l.add(0,1);
//        l.add(1,2);
//        l.add(2,3);
//        l.add(3,4);
//
//        System.out.println(l.get(i));
//        System.out.println(l.get(j) + "\n");
//        swap(l, i, j);
//        System.out.println(l.get(i));
//        System.out.println(l.get(j));
//
//        System.out.println();

        //jon's test code for copy
        IntList l1 = new IntList(4);
        l1.add(0, 1);
        l1.add(1, 2);
        l1.add(2, 3);
        l1.add(3, 4);
        IntList l2 = new IntList(4);
        copy(l1, l2);
        System.out.println();
        System.out.println(l2.get(0));
        System.out.println(l2.get(1));
        System.out.println(l2.get(2));
        System.out.println(l2.get(3));
    }


    private int[] arr;
    int size = 0;

    public IntList(int default_size) {
        arr = new int[default_size];
    }

    int get(int index) {
        return arr[index];
    }

    void set(int index, int element) {
        arr[index] = element;
    }

    void add(int element) {
        arr[size++] = element;
        if (size == arr.length) resize();
    }

    void add(int index, int element) {
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = element;

        size++;
        if (size == arr.length) resize();

    }

    void remove(int index) {
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
    }

    void resize() {

    }

    /*
    sort — sorts a List using a merge sort algorithm, which provides a fast, stable sort. (A stable sort is one that does not reorder equal elements.)
    */

    //Olivia
    static void mergeSort(int[]List) {
        if (List.length > 1) {
            int[] firstHalf = new int[List.length / 2];
            System.arraycopy(List, 0, firstHalf, 0, List.length / 2);
            mergeSort(firstHalf);

            int secondHalfLength = List.length - List.length / 2; //runs n times
            int[] secondHalf = new int[secondHalfLength]; //runs n times
            System.arraycopy(List, List.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            int[] SortedList = merge(firstHalf, secondHalf);
            System.arraycopy(SortedList, 0, List, 0, SortedList.length);
        }
    }
    private static int[] merge(int[] List1, int[] List2) {
        int[] SortedList = new int[List1.length + List2.length];

        int insidelist1 = 0;
        int insidelist2 = 0;
        int bothlists = 0;

        while (insidelist1 < List1.length && insidelist2 < List2.length) {

            if (List1[insidelist1] < List2[insidelist2])
                SortedList[bothlists++] = List1[insidelist1++];
            else
                SortedList[bothlists++] = List2[insidelist2++];
        }

        while (insidelist1 < List1.length)
            SortedList[bothlists++] = List1[insidelist1++];

        while (insidelist2 < List2.length)
            SortedList[bothlists++] = List2[insidelist2++];

        return SortedList;
        }
        //Olivia's Test Data
     {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        mergeSort(list);
        // System.out.println("Olivia's Test");
        for (int i = 0; i < list.length; i++)
            System.out.print( list[i] + " ");
    }

    /*
    shuffle — randomly permutes the elements in a List.
    */
    static void shuffle(IntList l) {
        int temporary = 9;
        Random rand = new Random();
        for (int lily = 0; lily < l.size - 1; lily++) {
            int notlily = rand.nextInt(l.size - 1);
            temporary = l.get(lily);
            l.set(lily, l.get(notlily));
            l.set(notlily, temporary);
        }
    }

    /*
    reverse — reverses the order of the elements in a List.
    */
    static void reverse(IntList l) {
        IntStack anna = new IntStack();
        IntList reversed = new IntList(34);

        for (int i = 0; i < l.size - 1; i++) {//add everything to a stack
            anna.push(l.get(i));
        }
        while (!anna.isEmpty()) {//add everything to a stack
            reversed.add(anna.pop());
        }

    }

    /*
    rotate — rotates all the elements in a List by a specified distance.
    */
    static void rotate(IntList l) {

    }

    /*
    swap — swaps the elements at specified positions in a List.
    */
    static void swap(IntList l, int i, int j) {
        int iTemp = l.arr[i];
        int jTemp = l.arr[j];
        l.arr[j] = iTemp;
        l.arr[i] = jTemp;
    }

    /*
    replaceAll — replaces all occurrences of one specified value with another.
    */
    static void replaceAll(IntList l, int target, int with) {
        for (int i = 0; i < l.size - 1; i++) {
            int item = l.get(i);
            if (item == target) {
                l.set(i, with);
            }
        }
    }

    /*
    fill — overwrites every element in a List with the specified value.
    */
    static void fill(IntList l, int rep) {
        for (int i = l.size; i > 0; i--) {
            l.set(i - 1, rep);
        }
    }

    /*
    copy — copies the source List into the destination List.
    */
    static void copy(IntList l1, IntList l2) {
        for (int i = 0; i < l1.size; i++) {
            int forCopy = l1.get(i);
            l2.add(forCopy);
        }
    }


    /*
    search — searches for an element in an List.
    */
    static boolean search(IntList l) {
        return false;
    }


    /*

    indexOfSubList — returns the index of the first sublist of one List that is equal to another.
    */
    static int indexOfSubList(IntList l, IntList sublist) {
        return 0;
    }

    /*
    lastIndexOfSubList — returns the index of the last sublist of one List that is equal to another.
    */
    static int lastIndexOfSubList(IntList l, IntList sublist) {
        return 0;
    }

    /*
    difference returns a list of all items that are in only one of the two lists (XOR)
    */
    static IntList difference(IntList l1, IntList l2) {
        return null;
    }

		/*
		return a new list with only the odd items
		*/
		static IntList oddList(IntList l) {
			return null;
		}

		/* 
		returns true if all items in i are in list l
		*/
		static boolean search(IntList l, int[] i) {
			return false;
		}

}
