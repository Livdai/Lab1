import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main<arrayInt> {
    public static void main(String[] args) throws IOException {

        int[] arrayInt = new int [10];
        int[] arrayInt2= new int [] {100, 200, 300};
        String[] arrayStr = new String[] {"First", "Second", "Third"};

        for (int i=0; i < arrayInt.length; i++) {

            arrayInt[i] = i*10;
            System.out.println(arrayInt[i]);

        }
        System.out.println();
        int index = 0;
        while (true){
            arrayInt2[index] = 200 * index;
            index++;
            if (index >2){break;}
        }
        for (int elem: arrayInt) {
            System.out.print(elem + " ");

        }
        System.out.println();
        for(int i=7; i>1; i--){
            if(i==3){continue;}
            else if (i==2) break;
            System.out.println(i);
        }

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int [] arr =new int[5];
        for(int i=0; i<arr.length; i++) {
            arr[i]= Integer.parseInt(reader.readLine());
        }
        System.out.println("$$$$$$$$$$$$$$$");

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("$$$$$$$$$$$$$$$");
        BufferedReader reader2 =
                new BufferedReader(new InputStreamReader(System.in));
        int [] arr2 =new int[10];
        for(int i=0; i<arr2.length; i++) {
            arr2[i]= Integer.parseInt(reader2.readLine());
        }
        Set<Integer> set1 = new TreeSet<>();
        for (int el: arr2) {
            set1.add(el);}

        System.out.println(Arrays.toString(arr2));
        System.out.println(set1);

        List<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        list1.add(0, "Four");
        list1.remove(0);
        list1.contains("Three");
        System.out.println("Contains Three? : " + list1.contains("Three"));
        System.out.println(list1);

        List<User> list2 = new ArrayList<>();
        list2.add(new User("Oleg", 20));
        list2.add(new User("Olga", 21));
        list2.add(new User("Ivan", 22));
        System.out.println(list2);
        System.out.println(list2.contains(new User("Oleg",20)));


    }
}
