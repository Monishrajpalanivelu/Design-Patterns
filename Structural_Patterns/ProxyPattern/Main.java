package Structural_Patterns.ProxyPattern;

public class Main {
      public static void main(String[] args) throws Exception {
          
                  DBinterface proxy = new proxydb("admin","1234");
                  proxy.executeQuery("Query 1"); // executes successfully because admin has access
               
                  
                  DBinterface proxy2 = new proxydb("user","1234");
                  proxy2.executeQuery("Query 2"); // throws exception because user has no access
          
      }
}
