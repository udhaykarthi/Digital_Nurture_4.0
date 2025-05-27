import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try{
            // 1.Load and Register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2.Establish the connection with the database
            String url="jdbc:mysql://localhost:3306/evalution";
            String user="root";
            String password="1203";
            Connection connection=DriverManager.getConnection(url,user,password);

            //Create statement object
            Statement statement=connection.createStatement();

            //Prepare,send and execute the query
            String sql="select * from eval";
            ResultSet resultSet=statement.executeQuery(sql);

            //Process the result from the resultSet
            while(resultSet.next()){
                System.out.println("name "+resultSet.getString(1)+
                        "\ncourse "+resultSet.getString(2)+
                         "\nyear "+resultSet.getInt(3)+
                        "\nsemester "+resultSet.getString(4)+
                        "\ncgpa "+resultSet.getString(5)+
                        "\npercentage "+resultSet.getString(6)+
                         "\ngrade "+resultSet.getString(7)+
                        "\nremark "+resultSet.getString(8));
            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}