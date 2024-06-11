
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // load the MySQL Driver
        Class.forName("com.mysql.cj.jdbc.Driver");


        // 1. open a connection to the database
        // use the database URL to point to the correct database
        Connection connection;
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                "root",
                "Bastola1!");

        // create statement
        // the statement is tied to the open connection
        Statement statement = connection.createStatement();

        // define your query
        String query = """
                SELECT ProductID, ProductName, UnitPrice, UnitsInStock
                FROM products;
                """;

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        ResultSet results = preparedStatement.executeQuery();


        // 2. Execute your query


        // process the results
        while (results.next()) {
            System.out.println("===============================.");
            String productName = results.getString("ProductName");
            System.out.println(productName);
            String productID = results.getString("ProductID");
            System.out.println(productID);
            String UnitPrice = results.getString("UnitPrice");
            System.out.println(UnitPrice);
            String UnitsInStock = results.getString("UnitsInStock");
            System.out.println(UnitsInStock);


        }



        // 3. Close the connection
        connection.close();
        preparedStatement.close();
        results.close();


    }
}
