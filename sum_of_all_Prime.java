import java.util.*;

public class sum_of_all_Prime 
{
    static int sum(int n, int[] array) 
    {
        int sum = 0;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < array.length; i++) 
         {
            int flag = 0;
            for (int j = 1; j <= array[i]; j++) 
            {
                if (array[i] % j == 0)
                    flag++;
            }
            if (flag == 2)
                list.add(array[i]);
        }
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) 
        {
            sum = sum + list.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++)
            array[i] = sc.nextInt();
        System.out.print("Your Prime Number Is :"+sum(n, array));
    }
}