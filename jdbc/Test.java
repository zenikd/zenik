package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ezenkov", "postgres", "1");
		Statement stmt = conn.createStatement();
		stmt.executeQuery("select * from car");

		ResultSet res = stmt.getResultSet();

		boolean hasNext = res.next();
		while (hasNext) {
			System.out.println(res.getInt("id"));
			hasNext = res.next();
		}
		
		int updated = stmt.executeUpdate("update car set year=2018 where id=1");
		
		int delete = stmt.executeUpdate("delete from car where id<3 ");
		
		int insert = stmt.executeUpdate("insert into car (model_id, engine_type) values (3, 'gasoline')");
		
		System.out.println(updated);
		res.close();
		stmt.close();
		
		conn.close();
	}

}
