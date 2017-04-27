package principal;
//contient les class sql dans le JRE API java
//API ne suppose pas les drivers
//le driver sql doit s enregistrer au drivermanager de java
import java.sql.*;
public class Connexion {
		
		private Connection base;
	
		public Connection getBase() { return base;	}

		public void start(){
			try {
				//permet de charger tout de suite le driver
				Class.forName("com.mysql.jdbc.Driver");
				
				//DriverManager vient java api, base est un obet qui implemente l interface Connection
				base = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mysql-java", "root","");				
				
				System.out.println("connect");
				
				//creation de l objet permettant de requeter
				Statement request = base.createStatement();
				//execution de la requete et affectation dans une variable de type result set
				ResultSet rs = request.executeQuery("SELECT * FROM sites");
				//lecture ligne par ligne, result set ne peut fonctionner qu'en mode connecte
				//avec une connexion a la base ouverte. rs va pointer ligne par ligne.
				while(rs.next()){
					System.out.println(rs.getString("nom") + " => " + rs.getString("url"));
				}
				rs.close();
				
								
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void close(){
			
			this.close();
			
		}
}




