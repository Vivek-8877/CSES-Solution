// Problem Link :- https://cses.fi/problemset/task/1083
// Video Solution Link Available coming soon on this channel :- https://www.youtube.com/channel/UC1P9bWDLTPS1Zp03m5PQEoQ
// Code Link :- https://cses.fi/paste/42174c8e8af5351347a436/

import java.util.*;
 
public class MyClass {
    public static void main(String args[]) {
      Scanner scn = new Scanner(System.in);
      long n = scn.nextInt();
      long sum=(n*(n+1)/2);
      for(int i=1;i<n;i++) sum-=(long)(scn.nextInt());
      System.out.println(sum);
    }
}
