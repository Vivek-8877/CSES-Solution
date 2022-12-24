// Problem Link :- https://cses.fi/problemset/task/1071
// Video Solution Link Available coming soon on this channel :- https://www.youtube.com/channel/UC1P9bWDLTPS1Zp03m5PQEoQ
// Code Link :- https://cses.fi/paste/a2ec48e17963811147c074/

import java.io.*;
import java.util.*;
 
public class MyClass {
    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      while(t-->0) {
          String[] s = br.readLine().split(" ");
          long r = Integer.parseInt(s[0]);
          long c = Integer.parseInt(s[1]);
          long ans;
          if(r<c) {
              long ct = (c-1)*(c-1);
              ct+=c;
              if(c%2==1) {
                  ct+=(c-r);
              } else {
                  ct-=(c-r);
              }
              ans = ct;
          } else {
              long ct = (r-1)*(r-1);
              ct+=r;
              if(r%2==0) {
                  ct+=(r-c);
              } else {
                  ct-=(r-c);
              }
              ans = ct;
          }
          System.out.println(ans);
      }
    }
}
