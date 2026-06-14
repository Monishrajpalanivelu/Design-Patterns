package Structural_Patterns.ProxyPattern;

public interface DBinterface {
      // common interface for database
      public void executeQuery(String query) throws Exception;
}
