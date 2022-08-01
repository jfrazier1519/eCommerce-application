package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

//		private static String url=
//				"jdbc:postgresql://datachan.c4wt8faaxlgp.us-east-2.rds.amazonaws.com:5432/pokemonDB";
//		private static String username="datachan";
//		private static String password="p4ssw0rd";

	static { // (this would normally go into your dao layer)
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Static block has failed me");
		}
	}

//	public static String url = "jdbc:postgresql://" + System.getenv("TRAINING_DB_ENDPOINT") + "/"
//			+ System.getenv("TRAINING_DB_DATABASENAME");
//	public static String username = System.getenv("TRAINING_DB_USERNAME");
//	public static String password = System.getenv("TRAINING_DB_PASSWORD");

		public static String url =
				"jdbc:postgresql://datachan.cvqh1dktya7v.us-east-1.rds.amazonaws.com:5432/project2DB";
		public static String username = "datachan";
		public static String password = "p4ssw0rd";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}
}
