import java.util.*;

/**
 * Created by teacher on 23.09.2018.
 */
public class ChangeClass {
    static long c = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = gcd(in.nextInt(),
                in.nextInt());
        while (n-- > 0) System.out.print("1");
    }

    static long factor(int n){
        c++;
        return n == 1 ? 1 : n * factor(n-1);
    }

    static long fib(int n, long [] array){
        c++;
        if(array[n] > 0) return array[n];
        array[n] = fib(n-1, array) + fib(n-2, array);
        return array[n];
    }

    static int binS(int [] a, int l, int r, int key){
        c++;
        if(r - l < 0) return -1;
        int m = (l + r) / 2;
        if(a[m] == key) return m;
        if(a[m] > key) return binS(a, l, m-1, key);
        else return binS(a, m+1, r, key);
    }

    static long gcd(long i, long j){
        c++;
        return j == 0 ? i : gcd(j, i % j);
    }

    static void show(){
        int n = new Scanner(System.in).nextInt();
        if(n == 0) return;
        show();
        System.out.print(n + " ");
    }

    static void showArray(StackTraceElement [] array){
        for(StackTraceElement i : array) System.out.println(i);
        System.out.println();
    }
}
