package stock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class connectDatabase {
	
	private Connection con;
	private String state;
        private String line;
        private String ip;
        private String port;
         private String bd;
        private String user;
        private String pswd;
        
        
        
	public connectDatabase(){
            
            /*try(BufferedReader br=new BufferedReader(new FileReader("connection.txt"))){
                
                for(int i=0;i<20;i++){
                
                    if(i==3)
                    {
                     br.readLine();
                     ip=br.readLine();
                    }
                    
                    if(i==6)
                    {
                     br.readLine();
                     bd=br.readLine();
                    }
                    
                    if(i==9)
                    {
                       br.readLine();
                     port=br.readLine(); 
                    }
                    
                    if(i==12)
                    {
                       br.readLine();
                     user=br.readLine(); 
                    }
                    
                    if(i==15)
                    {
                       br.readLine();
                     pswd=br.readLine(); 
                    }
                
                }
            
            }catch(IOException ex){
            
            
            }*/
            
            
			try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","");
		        state="Reussie";
			
		} catch (ClassNotFoundException e) {
			state="Pas de pilote pour DB";
			e.printStackTrace();
                            JOptionPane.showMessageDialog(null, state);
		} catch (SQLException e) {
			state="Pas de connexion à la DB";
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null, state);
		}
		
		
	}
	
	
	
	public Connection getCon() {
		return con;
	}


	public void setCon(Connection con) {
		this.con = con;
	}


	public ResultSet extaireData(String requete){
            ResultSet result=null;
		
		try {
			result=con.createStatement().executeQuery(requete);
			state="Reussie";
		} catch (SQLException e) {
			state="Echoue";
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public int updateData(String requete){
		int n=0;
		try {
			n=con.createStatement().executeUpdate(requete);
			state="Reussie";
		} catch (SQLException e) {
			state=" Echouez !!! ";
                        JOptionPane.showMessageDialog(null, e);
			
		}
		return n;
	}
	
	public static void main(String args[])
        {
            connectDatabase connexion = new connectDatabase();
            ResultSet flux = connexion.extaireData("select *  from personne");
            
            try {
                while(flux.next())
                {
                    System.out.println(""+flux.getInt("id")+"  "+flux.getString("nom")+"  "+flux.getInt("age")+" "+flux.getFloat("salaire"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(connectDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

}
