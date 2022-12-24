// Problem Link :- https://cses.fi/problemset/task/1070
// Video Solution Link Available coming soon on this channel :- https://www.youtube.com/channel/UC1P9bWDLTPS1Zp03m5PQEoQ
// Code Link :- https://cses.fi/paste/c6bc8d3b4a0d593747a40d/

import java.util.*;
 
public class MyClass {
    public static void main(String args[]) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      StringBuilder sb = new StringBuilder();
      if(n==2 || n==3) {
          sb.append("NO SOLUTION");
      } else if(n==1 || n==4) {
          if(n==4) {
              sb.append("3 1 4 2");
          } else {
              sb.append(1);
          }
      } else if(n%2==0) {
          for(int i=1,j=n/2+1;i<=n/2;i++,j++) {
              sb.append(i+" ");
              sb.append(j);
              if(i!=n/2) sb.append(" ");
          }
      } else {
          for(int i=n/2+2,j=2;i<=n;i++,j++) {
              sb.append(i+" ");
              sb.append(j+" ");
          }
          sb.append(1);
      }
      System.out.println(sb.toString());
    }
}
