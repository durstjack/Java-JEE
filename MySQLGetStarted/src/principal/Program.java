package principal;
import java.sql.*;


public class Program {

	public static void main(String[] args) {
		
		// connexion � la base de donn�es
		Connexion connexion = new Connexion();
		connexion.start();
		
		//ouverture de la fentre principale - dans mainWindow on pourra faire base.createStatement();
		//TLfenetres mainWindow = new TLfenetres( connect.getBase() );
		//mainWindow.setVisible(true);
		


	}

}
