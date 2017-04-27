package principal;
import java.sql.*;


public class Program {

	public static void main(String[] args) {
		
		// connexion à la base de données
		Connexion connexion = new Connexion();
		connexion.start();
		
		//ouverture de la fentre principale - dans mainWindow on pourra faire base.createStatement();
		//TLfenetres mainWindow = new TLfenetres( connect.getBase() );
		//mainWindow.setVisible(true);
		


	}

}
