// Problem Link :- https://cses.fi/problemset/task/1094
// Video Solution Link Available coming soon on this channel :- https://www.youtube.com/channel/UC1P9bWDLTPS1Zp03m5PQEoQ
// Code Link :- https://cses.fi/paste/e4a14212a497867047a084/

import java.util.*;
 
public class MyClass {
    public static void main(String args[]) {
      Scanner scn = new Scanner(System.in);
      int n = Integer.parseInt(scn.nextLine());
      String[] s = scn.nextLine().split(" ");
      
      long ans=0;
      int pv = Integer.parseInt(s[0]);
      for(int i=1;i<n;i++) {
          int a = Integer.parseInt(s[i]);
          if(pv>a) {
              ans+=(long)(pv-a);
          } else {
              pv=a;
          }
      }
      
      System.out.println(ans);
    }
}
