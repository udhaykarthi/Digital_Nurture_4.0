import java.sql.*;

public class Main{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String pass = "1203";

        int fromId = 1;
        int toId = 2;
        double amount = 100.0;

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            conn.setAutoCommit(false); // start transaction

            try (
                    PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE account_id = ?");
                    PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE account_id = ?")
            ) {
                debit.setDouble(1, amount);
                debit.setInt(2, fromId);
                int debitRows = debit.executeUpdate();

                credit.setDouble(1, amount);
                credit.setInt(2, toId);
                int creditRows = credit.executeUpdate();

                if (debitRows == 1 && creditRows == 1) {
                    conn.commit();
                    System.out.println("✅ Transfer successful.");
                } else {
                    conn.rollback();
                    System.out.println("❌ Transfer failed. Rolled back.");
                }

            } catch (SQLException e) {
                conn.rollback();
                System.out.println("❌ Error during transfer. Rolled back.");
                e.printStackTrace();
            }

        } catch (SQLException e) {
            System.out.println("❌ Connection failed.");
            e.printStackTrace();
        }
    }
}
