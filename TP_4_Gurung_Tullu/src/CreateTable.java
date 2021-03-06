
import java.sql.*;

public class CreateTable {

   public static void main( String args[] ) {
      Connection c = null;
      Statement stmt = null;
      
      try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:LibraryDataHouse.db");
         System.out.println("Opened database successfully");

         stmt = c.createStatement();
         String sql = "CREATE TABLE PatronInfo " +
                        "( PatronID           TEXT    NOT NULL, " + 
                        " BookID           TEXT   NOT NULL, " + 
                        " ReturnDate		DATE NOT NULL," +
                        " Hold 			varchar(100))"; 
         stmt.executeUpdate(sql);
         stmt.close();
         c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("Table created successfully");
   }
}