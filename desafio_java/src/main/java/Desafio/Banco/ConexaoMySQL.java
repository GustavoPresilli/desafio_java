package Desafio.Banco;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;

public class ConexaoMySQL {
    private static final String url = "jdbc:mysql://localhost:3306/ConWay";
    private static final String user = "user_desafio";
    private static final String password = "urubu100";

    private static final String nameDrive = "com.mysql.cj.jdbc.Driver";
    private static Connection conexao;

    private JdbcTemplate conexaoBanco;

    public ConexaoMySQL (){

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(nameDrive);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);

        conexaoBanco = new JdbcTemplate(dataSource);

    }

    public JdbcTemplate getConexao() {
        return conexaoBanco;
    }


}
