import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        1.Write a Java program to test if the first and the last element of an array of integers are same.
        The length of the array must be greater than or equal to 2
         */

//        ArrayList<Integer> numbers=new ArrayList<>();
//        numbers.add(50);
//        numbers.add(-20);
//        numbers.add(0);
//        numbers.add(30);
//        numbers.add(40);
//        numbers.add(60);
//        numbers.add(10);
//
//        System.out.println(numbers.getFirst() == numbers.getLast());

        /*
        2.Write a Java program to find the numbers greater than the average of the numbers of a given array.
        Original Array:
        [1, 4, 17, 7, 25, 3, 100]
         */

//        ArrayList<Integer> numbers=new ArrayList<>();
//        numbers.add(1);
//        numbers.add(4);
//        numbers.add(17);
//        numbers.add(7);
//        numbers.add(25);
//        numbers.add(3);
//        numbers.add(100);
//
//        double sum = 0.0;
//        for (int n : numbers) {
//            sum += n;
//        }
//
//        double average =  sum / numbers.size();
//        System.out.printf("Average : %.2f\n", average);
//
//        System.out.print("Numbers greater than the average:");
//        for (int n : numbers) {
//            if (n > average) {
//                System.out.print(" "+n);
//            }
//        }

        /*
            3.Write a Java program to get the larger value between first and last element of an array of integers.
            Original Array:
            [20, 30, 40]
         */

//        ArrayList<Integer> numbers=new ArrayList<>();
//        numbers.add(20);
//        numbers.add(30);
//        numbers.add(40);
//
//        if (numbers.getFirst()> numbers.getLast()){
//            System.out.println("Larger value between first and last element:"+numbers.getFirst());
//        }else if (numbers.getFirst()< numbers.getLast()){
//            System.out.println("Larger value between first and last element:"+numbers.getLast());
//        }else System.out.println("The first and last elements are equal.");


        /*
            4.Write a Java program to swap the first and last elements of an array and create a new array.
            Original Array:
            [20, 30, 40]
         */

//        ArrayList<Integer> originalList = new ArrayList<>();
//        originalList.add(20);
//        originalList.add(30);
//        originalList.add(40);
//
//        ArrayList<Integer> newList = new ArrayList<>(originalList);
//
//        System.out.println("Original ArrayList: " + originalList);
//
//        if (newList.size() >= originalList.size()) {
//            int temp = newList.getFirst();
//            newList.set(0, newList.getLast());
//            newList.set(newList.size() - 1, temp);
//        }
//        System.out.println("New ArrayList with Swapped Elements: " + newList);

        /*
            5. Write a program that places the odd elements of an array before the even elements.
            Original Array:
            [2,3,40,1,5,9,4,10,7]
         */

//        ArrayList<Integer> numbers = new ArrayList<>();
//        ArrayList<Integer> reorder = new ArrayList<>();
//
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(40);
//        numbers.add(1);
//        numbers.add(5);
//        numbers.add(9);
//        numbers.add(4);
//        numbers.add(10);
//        numbers.add(7);
//
//        System.out.println("Original ArrayList: " + numbers);
//
//
//        for (int n : numbers) {
//            if (n % 2 != 0) {
//                reorder.add(n);
//            }
//        }
//
//        for (int num : numbers) {
//            if (num % 2 == 0) {
//                reorder.add(num);
//            }
//        }
//
//        System.out.println("Reordered ArrayList (Odds before Evens): " + reorder);

        /*
        6. Write a program that test the equality of two arrays. [2,3,6,6,4] [2,3,6,6,4]
         */

//        ArrayList<Integer> arr1=new ArrayList<>();
//        ArrayList<Integer> arr2=new ArrayList<>();
//
//        arr1.add(2);
//        arr1.add(3);
//        arr1.add(6);
//        arr1.add(6);
//        arr1.add(4);
//
//        arr2.add(2);
//        arr2.add(3);
//        arr2.add(6);
//        arr2.add(6);
//        arr2.add(4);
//
//        if(arr1.equals(arr2)){
//            System.out.println("it is equals ");
//        }else System.out.println("it is not equals");

    }

}
