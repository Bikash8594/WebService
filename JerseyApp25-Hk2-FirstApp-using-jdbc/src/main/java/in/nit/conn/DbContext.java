package in.nit.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbContext {
	public static Connection con=null;

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		public static Connection getCon() {
			return con;
		}
}



