import java.util.*;

public class Tarifa{ 
  public static void main(String args[]){  
    Scanner kb= new Scanner(System.in);
    int x=kb.nextInt();
    if(1<=x && x<=100){
      int n=kb.nextInt();
      if(1<=n && n<=100){
        boolean ch=true;
        int p,sum=x;
        for(int i=0;i<n;i++){
          p=kb.nextInt();
          if(0<=p && p<=10000)
            sum+=x-p;
          else{
            ch=false;
            break;
          }
        }
        if(ch) System.out.println(sum);
      }
    }
  }  
} 