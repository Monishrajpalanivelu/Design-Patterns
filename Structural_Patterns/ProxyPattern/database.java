package Structural_Patterns.ProxyPattern;

public class database implements DBinterface{
      // real database object used to query the databse
      public void executeQuery(String query) throws Exception{
            System.out.println("Executing query: "+query); 
      }
      
}
