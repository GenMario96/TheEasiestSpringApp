package it.connessione;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.ToString;


@ToString

public class Connessione {

	  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	  static final String DB_URL = "jdbc:mysql://localhost/gestione_surgelati2";
	  static final String USER = "Gennaro";
	  static final String PASS = "Accardo";
	
	  
	  
	

	
	public Connessione() {
	Statement stmt = null;	
    Connection connessione = null;
	    
	    try {
	      Class.forName(JDBC_DRIVER);
	      connessione = DriverManager.getConnection(DB_URL, USER, PASS);
	      
	      
	    } catch (SQLException se) {
	      se.printStackTrace();
	    } catch (Exception e) {
	      e.printStackTrace();
	    } finally {
	      try {
	        
	        if (connessione != null) {
	        	System.out.println("Connessione al db effettuata");
	        	String sql = "SELECT nome_cliente,indirizzo,p_iva_cliente FROM cliente";
        		System.out.println(sql);
        		ResultSet rs = stmt.executeQuery(sql);
        		while (rs.next()) {
		          String nome = rs.getString("nome_cliente");
		          String indirizzo = rs.getString("indirizzo");
		          String p_iva = rs.getString("p_iva_cliente");
		        

		          System.out.print("Nome " + nome);
		          System.out.print(", Indirizzo: " + indirizzo);
		          System.out.print(", partita iva: " + p_iva);
		        
		        }
	        }
	        connessione.close();
	      } catch (SQLException se) {
	        se.printStackTrace();
	      }
	      
	    }
	  
}



}
