// Problem Link :- https://cses.fi/problemset/task/1068
// Video Solution Link Available coming soon on this channel :- https://www.youtube.com/channel/UC1P9bWDLTPS1Zp03m5PQEoQ
// Code Link :- https://cses.fi/paste/19e3ffc929384ca347a036/

import java.util.*;
 
public class MyClass {
    public static void main(String args[]) {
      Scanner scn = new Scanner(System.in);
      long n = scn.nextInt();
      StringBuilder sb = new StringBuilder();
      while(n!=1) {
          sb.append(n+" ");
          if(n%2==0) {
              n/=2;
          } else {
              n*=3;
              n++;
          }
      }
      sb.append(1);
      System.out.println(sb.toString());
    }
}
