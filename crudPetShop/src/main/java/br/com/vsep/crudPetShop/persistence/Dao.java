package br.com.vsep.crudPetShop.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {

	Connection con;
	PreparedStatement stmt;
	ResultSet rs;

	public void open() throws Exception {
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/crudpetshop", "postgres", "@Fan3farra");
	}

	public void close() throws Exception {
		con.close();

	}
}
