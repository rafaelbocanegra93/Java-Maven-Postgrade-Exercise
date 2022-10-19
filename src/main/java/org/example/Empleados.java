package org.example;
import java.sql.*;


public class Empleados {
    public static void createUser(int idEmpleado,String nombre, int meses, int salario) throws SQLException {
        Connection conn=DBConnector.getConnection();
        String query = "INSERT INTO public.\"Empleados\"(" +
                "\"IdEmpleado\", \"Nombre\", \"Meses\", \"Salario\")" +
                "VALUES (?, ?, ?, ?);";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        try {
            preparedStatement.setInt(1,idEmpleado);
            preparedStatement.setString(2,nombre);
            preparedStatement.setInt(3,meses);
            preparedStatement.setInt(4,salario);
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows: "+rowsAffected);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            preparedStatement.close();
            conn.close();
        }

        }

    public static void filterBySalaryAndMounts(String lessMoreSalary,int salary,String lessMoreMounts, int mounts) throws SQLException {
        Connection conn=DBConnector.getConnection();
        String query = "SELECT * FROM public.\"Empleados\" WHERE \"Meses\""+lessMoreMounts+mounts+" AND \"Salario\""+lessMoreSalary+salary+";";
        System.out.println(query);
        Statement statement = conn.createStatement();
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                System.out.print(resultSet.getInt(1)+",");
                System.out.print(resultSet.getString(2)+",");
                System.out.print(resultSet.getInt(3)+",");
                System.out.println(resultSet.getInt(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            conn.close();
        }

    }

    public static void cleanTable(){
        Connection conn=DBConnector.getConnection();
        String query = "DELETE FROM public.\"Empleados\";";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
