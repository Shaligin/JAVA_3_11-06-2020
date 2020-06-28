package geekbrains.java.HW_2;

import java.sql.*;

class Main {
    public PreparedStatement psInsert;
    public static Connection connect;
    public static Statement stmn;

    public static void main(String[] args) {

    }

    public void start() {
        try {
            Class.forName("org.sqlite.JDBC");
            connect = DriverManager.getConnection("jdbc:sqllite:MyBoxDB.db");
            stmn = connect.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String getNick(String login, String pass) {
        try {
            psInsert = connect.prepareStatement("SELECT * FROM entry WHERE login = ? AND password = ?;");
            psInsert.setString(1, login);
            psInsert.setString(2, pass);
            ResultSet rs = psInsert.executeQuery();

            if (rs.next()) {
                return rs.getString("nickname");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public void stop() {
        try {
            stmn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

