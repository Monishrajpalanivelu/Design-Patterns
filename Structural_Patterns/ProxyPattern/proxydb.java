package Structural_Patterns.ProxyPattern;

public class proxydb implements DBinterface{
      private database db;
      boolean isAdmin;
      String userName;
      public proxydb(String user ,String password){  // a middle layer between client and database (proxy) 
            // also check credentials
            if(user.equals("admin") && password.equals("1234")){
                  db = new database(); // instantiating real database object only if credentials are correct
                  isAdmin = true; 
            }
            this.userName = user;
      }
      public void executeQuery(String query) throws Exception{
            if(isAdmin){
                  db.executeQuery(query); // executing query on real database
            }else{
                  throw new Exception("Access Denied for user:"+this.userName);  // if not admin, throw exception
            }
      }
}
