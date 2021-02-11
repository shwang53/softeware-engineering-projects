package edu.ncsu.csc326.coffeemaker.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InventoryDB {

    public static boolean addInventory(int coffee, int milk, int sugar, int chocolate) {
		DBConnection db = new DBConnection();
		Connection conn = null;
		PreparedStatement stmt = null;
		boolean inventoryAdded = false;
		try {
			conn = db.getConnection();
			stmt = conn.prepareStatement("INSERT INTO inventory VALUES(?,?,?,?)");
			stmt.setInt(1, coffee);
			stmt.setInt(2, milk);
			stmt.setInt(3, sugar);
			stmt.setInt(4, chocolate);
			int updated = stmt.executeUpdate();
			if(updated == 1){
				inventoryAdded = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(conn, stmt);
		}
		return inventoryAdded;
    }

    public static boolean useInventory(int coffee, int milk, int sugar, int chocolate) {
		DBConnection db = new DBConnection();
		Connection conn = null;
		PreparedStatement stmt = null;
		boolean inventoryUsed = false;
		try {
			conn = db.getConnection();
			stmt = conn.prepareStatement("INSERT INTO inventory VALUES(?,?,?,?)");
			stmt.setInt(1, -coffee);
			stmt.setInt(2, -milk);
			stmt.setInt(3, -sugar);
			stmt.setInt(4, -chocolate);
			int updated = stmt.executeUpdate();
			if(updated == 1){
				inventoryUsed = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(conn, stmt);
		}
		return inventoryUsed;
    }

    public static int checkInventory(String type) {
		DBConnection db = new DBConnection();
		Connection conn = null;
		PreparedStatement stmt = null;
		int sum = 0;
		try {
			conn = db.getConnection();
			if (type == "coffee")
				stmt = conn.prepareStatement("SELECT SUM(coffee) AS sum FROM inventory");
			else if (type == "milk")
				stmt = conn.prepareStatement("SELECT SUM(milk) AS sum FROM inventory");
			else if (type == "sugar")
				stmt = conn.prepareStatement("SELECT SUM(sugar) AS sum FROM inventory");
			else if (type == "chocolate")
				stmt = conn.prepareStatement("SELECT SUM(chocolate) AS sum FROM inventory");
			else
				throw new SQLException("ERROR: Wrong Type");

			ResultSet rs = stmt.executeQuery();
			rs.next();
			sum = rs.getInt("sum"); 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(conn, stmt);
		}
		return sum;
	}

}

