import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int total=0;
        
        for(int i=1; i<n+1; i++)
        {
            total+=i;
        }
        System.out.println(total);
        
        
        
    }
}
