package AppControle.conexao;


import AppControle.util.UtilInterface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TesteBD {
public static void main (String[]args){
    try{
        Conexao.getConnection();
        UtilInterface.msgSucesso("Conectado com sucesso");

    }catch (SQLException e){
    JOptionPane.showInputDialog("Não Conectou\n"+e);
    }
}
}
