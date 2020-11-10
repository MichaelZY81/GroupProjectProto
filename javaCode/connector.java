import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

public class Connector{

	String url;
	String uid ;
	String pswd ; 
	Connection conn;

	public Connector(){
		String url = null;
		String uid = null;
		String pswd = null;
	}

	public Connector(String url, String uid, String pswd) {
		this.url=url;
		this.uid=uid; 
		this.pswd=pswd;	
	}

	public void getDBConnection() throws SQLException{
		OracleDataSource ds;
		ds = new OracleDataSource();
		ds.setURL(url);
		conn=ds.getConnection(uid,pswd);
	}


	public  
}

