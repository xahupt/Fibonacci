import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private long buildFibonacci(int n){
        long firstNum=1;long secNum = 1;
        long thirdNum;
        List list = new ArrayList();
        list.add(firstNum);
        list.add(secNum);
        for (int i=0;i<n-2;i++){
            thirdNum = firstNum+secNum;
            firstNum = secNum;
            secNum = thirdNum;
            list.add(thirdNum);

        }
        System.out.println(list);
        return secNum;
    }
    private long buildFibonacci_(int n){
        if (n==1|n==2)
            return 1;
        else {
            return buildFibonacci_(n-1)+buildFibonacci_(n-2);
        }
    }
    public static void main(String[] args){
        System.out.println(new Fibonacci().buildFibonacci(21));
        System.out.println(new Fibonacci().buildFibonacci_(21));
    }
}
