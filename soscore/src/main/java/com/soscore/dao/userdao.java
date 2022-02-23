package com.soscore.dao;
import com.soscore.models.*;
import java.sql.*;
public class userdao {
	private String jdbcURL = "jdbc:mysql://localhost:3306/soscore?useSSL=false&serverTimezone=UTC";
    private String jdbcUsername = "root";
    private String jdbcPassword = "root";
    private static final String INSERT_USER = "INSERT INTO users" + "  (firstName,lastName,password,mail,date) VALUES " +
            " (?, ?, ? , ? , ?);";
    private static final String SELECT_USERS_BY_All = "select * from users where " +
            "firstName =? AND lastName=? AND mail=? AND date=? ";
    protected Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
    public void  insertUser (user user) throws SQLException {
        Connection cnx = getConnection();
        PreparedStatement statement =cnx.prepareStatement(INSERT_USER);
        statement.setString(1,user.getFirstName());
        statement.setString(2,user.getLastName());
        statement.setString(3,user.getPassword());
        statement.setString(4,user.getMail());
        statement.setDate(5, (Date) user.getDate());
        
        statement.executeUpdate();

    }

    

}
