package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnect {
	public Connection JdbcSample() {
		// TODO 自動生成されたコンストラクター・スタブ
		// ステートメントは問い合わせを実行したり、問い合わせの結果の取得に関するベースになるものです。
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqltest", "root", "root");
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return conn;
	}
}
