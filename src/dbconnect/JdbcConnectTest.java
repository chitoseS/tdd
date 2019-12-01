package dbconnect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mysql.jdbc.Connection;

public class JdbcConnectTest {
	@Test
	public void jdbcConnectTest() {
		JdbcConnect connect = new JdbcConnect();
		java.sql.Connection connectionResult = connect.JdbcSample();
		assertEquals(null, connectionResult);
	}
}
