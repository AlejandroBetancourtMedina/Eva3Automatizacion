package com.myconstruccion.dao;

import com.myconstruccion.model.Usuario;
import java.sql.*;

public class UsuarioDao {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/myconstruccion";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "password";

    public boolean validarUsuario(String email, String password) {
        String query = "SELECT * FROM usuarios WHERE email = ? AND password = ?";
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, email);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}