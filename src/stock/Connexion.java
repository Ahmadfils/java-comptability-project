package stock;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connexion {
	Connection con;

	public Connexion(){
		   
            try{
		Class.forName("com.mysql.jdbc.Driver");
			
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","");
			
			
	}
		catch(Exception e){
		JOptionPane.showMessageDialog(null,e.getMessage());
			
		}

}
	public Connection connecion(){
		return con;
	}
}