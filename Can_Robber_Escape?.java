import java.util.Scanner;
public class c{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int c=0;
        for(int i=1;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int j:arr)
        {
            if(j>=n)
            {
                c++;
            }
        }
        if(c>=1)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}