package conexaoDb;


//Classes necessárias para uso de Banco de dados //
 
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexaoDb {
    public Statement stm; // Responsável por preparar e realizar pesquisas no banco de dados 
    public ResultSet rs;  // Responsável por armazenar o resultado de uma pesquisa passada para o statement
    private String driver = "com.mysql.jdbc.Driver"; // Responsável por identificar o serviço de banco de dados
    private String caminho = "jdbc:mysql://localhost/MediaPlayer"; // Responsável por setar o local do banco de dados
    private String usuario = "root";
    private String senha = "gis995511";
    public Connection conn; // Responsável pro realizar a conexão com o banco de dados
    
    // Metodo responsável pro realizar conexão com o banco de dados
    public void conexao(){
        try { // Tentativa de conexão
            System.setProperty("jdbc.Drivers", driver); // Seta propriedade do driver de conexão
            conn = DriverManager.getConnection(caminho, usuario, senha); // Realiza a conexão com o banco de dados
            //JOptionPane.showMessageDialog(null,"Conectado com sucesso"); // Imprime uma caixa de mensagem
        } catch (SQLException ex) { // Exceção
            JOptionPane.showMessageDialog(null,"Erro de conexão!\n Erro: "+ ex.getMessage());
        }
    }
    
    // Metodo para fechar a conexão com o banco de dados
    public void desconecta(){
        try{
            conn.close(); // Fecha conexão com o banco de dados
            //JOptionPane.showMessageDialog(null,"Desconectado com sucesso"); // Imprime uma caixa de mensagem
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao fechar conexão!\n Erro: "+ ex.getMessage());
        }
    }
}
