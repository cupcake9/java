import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "training", "oracle");
			System.out.println("connection succesfull");
			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("db name : " + meta.getDatabaseProductName());
			System.out.println("db ver:" + meta.getDatabaseProductVersion());
			System.out.println("driver name:" + meta.getDriverName());
			System.out.println("driver ver:" + meta.getDriverVersion());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
