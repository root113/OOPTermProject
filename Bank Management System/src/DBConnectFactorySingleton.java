import java.sql.*;

public class DBConnectFactorySingleton implements Operations{
	private Connection con;
	private Statement st;
	private ResultSet rs;
	private PreparedStatement ps;
	
	private final String url = "jdbc:postgresql://localhost/OOPTest";
	private final String user = "postgres";
	private final String password = "";
	
	//Getters & Setters
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public Statement getSt() {
		return st;
	}
	public void setSt(Statement st) {
		this.st = st;
	}
	public ResultSet getRs() {
		return rs;
	}
	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
	
	public DBConnectFactorySingleton(){
		try {
			con = DriverManager.getConnection(url,user,password);
			System.out.println("Connected to the PostgreSQL server successfully.");
		}
		catch(Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	@Override
	public boolean checkUser(String username, String password) {
		try {
			ps = this.con.prepareStatement("SELECT * FROM bank WHERE username=? AND password=?;");
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			
			if(!rs.next())
				return false;
			else
				return true;
			
		}
		catch(SQLException sql) {
			sql.getCause().printStackTrace();
			return false;
		}
	}
	
	@Override
	public String accountType(String username, String password) {
		String accType = null;
		
		try {
			ps = this.con.prepareStatement("SELECT account_type FROM bank WHERE username=? AND password=?;");
			ps.setString(1,username);
			ps.setString(2,password);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				accType = rs.getString(1);
			}
			
			return accType;
		}
		catch(SQLException sql) {
			sql.getCause().printStackTrace();
			return null;
		}
	}
}
