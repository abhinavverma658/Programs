/*
Input: 5

Output:
        ABCDE
        ABCD
        ABC
        AB
        A
 */

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(char ch = 'A'; ch <= 'A'+(n-i-1); ch++){
                /*
                                                      (n-i-1)
                for i=0 ->  for char = 'A' , A <= 'A'+(5-0-1) True, Print A , Increment++ to B
                                             B <= 'A'+(5-0-1) True, Print B , Increment++ to C
                                             C <= 'A'+(5-0-1) True, Print C , Increment++ to D
                                             D <= 'A'+(5-0-1) True, Print D , Increment++ to E
                                             E <= 'A'+(5-0-1) True, Print E , Increment++ to F
                                             F <= 'A'+(5-0-1) False , Exit loop

                                             -->> i gets incremented to 1.

                                                      (n-i-1)
                 for i=1 ->  for char = 'A' ,A <= 'A'+(5-1-1) True, Print A , Increment++ to B
                                             B <= 'A'+(5-1-1) True, Print B , Increment++ to C
                                             C <= 'A'+(5-1-1) True, Print C , Increment++ to D
                                             D <= 'A'+(5-1-1) True, Print D , Increment++ to E
                                             E <= 'A'+(5-1-1) False , Exit loop

                                             -->> i gets incremented to 2.

                                                      (n-i-1)
                 for i=2 ->  for char = 'A' ,A <= 'A'+(5-2-1) True, Print A , Increment++ to B
                                             B <= 'A'+(5-2-1) True, Print B , Increment++ to C
                                             C <= 'A'+(5-2-1) True, Print C , Increment++ to D
                                             D <= 'A'+(5-2-1) False, Exit loop.

                                           -->> i gets incremented to 3.

                                                      (n-i-1)
                 for i=3 ->  for char = 'A' ,A <= 'A'+(5-3-1) True, Print A , Increment++ to B
                                             B <= 'A'+(5-3-1) True, Print B , Increment++ to C
                                             C <= 'A'+(5-3-1) False , Exit loop.

                                             --> i gets incremented to 4.

                 for i=4 ->  for char = 'A' ,A <= 'A'+(5-4-1) True, Print A , Increment++ to B
                                             B <= 'A'+(5-4-1) False, Exit loop

                                            -->>  i gets incremented to 5.

                 for i=5 , i<5 false. Final exit from outer loop.
                 */
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
