// Problem Link :- https://cses.fi/problemset/task/1069
// Video Solution Link Available coming soon on this channel :- https://www.youtube.com/channel/UC1P9bWDLTPS1Zp03m5PQEoQ
// Code Link :- https://cses.fi/paste/3e6242aeca2310e847bffc/

import java.io.*;
import java.util.*;
 
public class MyClass {
    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s = br.readLine();
      int ans =1,f=1;
      for(int i=0;i<s.length()-1;i++) {
          if(s.charAt(i)==s.charAt(i+1)) {
              f++;
          } else {
              ans = Math.max(ans,f);
              f=1;
          }
      }
      ans = Math.max(ans,f);
      System.out.println(ans);
    }
}
