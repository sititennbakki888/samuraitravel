package com.example.samuraitravel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SamuraitravelApplication {

	public static void main(String[] args) {
		Statement  statement = null;
		Connection con = null;
		
		try {
			   con = DriverManager.getConnection(
					"jdbc:mysql://localhost/samuraitravel_db",
					"root",
					"c07HKML5229k"
					);
			
			statement = con.createStatement();
		
			System.out.println("データベースの接続成功");
			System.out.println(con);
			con.close();
		}catch(SQLException e) {
			System.out.println("データベース接続失敗:" + e.getMessage());
		}
		
		SpringApplication.run(SamuraitravelApplication.class, args);
	}

}
