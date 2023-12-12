package Desafio.Banco.DAO;

import Desafio.Banco.ConexaoMySQL;
import org.springframework.jdbc.core.JdbcTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrosDAO {
    JdbcTemplate conMysql;

    public RegistrosDAO() {
        ConexaoMySQL conexaoMysql = new ConexaoMySQL();
        this.conMysql = conexaoMysql.getConexao();
    }


    public void inserirDados (int idTotem, int fkComponente, int valor){
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateFormat.format(currentDate);

        String insertMySQL = "INSERT INTO Registro (valor, dataHora, fkComponente, fkTotem) VALUES (?, ?, ?, ?)";

        conMysql.update(insertMySQL, valor, formattedDateTime, fkComponente,idTotem);
    }
}
