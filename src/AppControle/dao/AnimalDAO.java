package AppControle.dao;

import AppControle.beans.AnimalBean;
import AppControle.conexao.Conexao;
import AppControle.beans.RacaBean;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

public class AnimalDAO {

    Connection con;

    public AnimalDAO() throws SQLException {
        con = Conexao.getConnection();
    }

    public void vender(AnimalBean a) throws SQLException {
        String sql = "UPDATE animal SET animal.data_venda = ?,"
                + " animal.peso_saida = ?, animal.preco_venda = ?"
                + " WHERE animal.cod_animal = ?";

        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setDate(1, (Date) a.getDataSaida());
        stmt.setFloat(2, a.getPesoSaida());
        stmt.setFloat(3, a.getValorSaida());
        stmt.setInt(4, a.getCodAnimal());

        stmt.execute();
        stmt.close();
    }

    public void inserir(AnimalBean ab) throws SQLException {
        String sql = "insert into animal "
                + "(cod_animal,cod_raca, mes_nascimento, ano_nascimento, sexo, cor, data_compra, data_venda, peso_entrada, peso_saida, preco_compra,preco_venda) values "
                + "(?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, ab.getCodAnimal());
        stmt.setInt(2, ab.getRaca().getCodRaca());
        stmt.setInt(3, ab.getMesNas());
        stmt.setInt(4, ab.getAnoNas());
        stmt.setString(5, ab.getSexo());
        stmt.setString(6, ab.getCor());
        stmt.setDate(7, (Date) ab.getDataEntrada());
        stmt.setDate(8, (Date) ab.getDataSaida());
        stmt.setFloat(9, ab.getPesoEntrada());
        stmt.setFloat(10, ab.getPesoSaida());
        stmt.setFloat(11, ab.getValorCompra());
        stmt.setFloat(12, ab.getValorSaida());

        stmt.execute();
        stmt.close();

    }

    public void fechaConexao() throws SQLException {
        this.con.close();
    }

    // Metodo que altera o geristro ao banco de dados
    public void altera(AnimalBean aBean, int id) throws SQLException {
        String sql = "UPDATE animal SET cod_raca = ?, mes_nascimento = ?, ano_nascimento = ?, sexo = ?, cor = ?, "
                + "data_compra = ?, peso_entrada = ?, peso_saida = ?, preco_compra = ? "
                + " WHERE cod_animal = " + id;
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, aBean.getRaca().getCodRaca());
        stmt.setInt(2, aBean.getMesNas());
        stmt.setInt(3, aBean.getAnoNas());
        stmt.setString(4, aBean.getSexo());
        stmt.setString(5, aBean.getCor());
        // transforma data do pacote UTIL para data do pacote SQL
        stmt.setDate(6, new java.sql.Date(aBean.getDataEntrada().getYear(), aBean.getDataEntrada().getMonth(), aBean.getDataEntrada().getDate()));
  
        stmt.setFloat(7, aBean.getPesoEntrada());
        stmt.setFloat(8, aBean.getPesoSaida());
        stmt.setFloat(9, aBean.getValorCompra());


        stmt.execute();
        stmt.close();
    }

    // método que removo o registro do banco de dados
    public void remove(int id) throws SQLException {
        PreparedStatement stmt = this.con.prepareStatement("delete from animal where cod_animal=" + id);
        stmt.execute();
        stmt.close();
    }

    public AnimalBean retornaUm(int id) throws SQLException {
        PreparedStatement stmt = this.con.prepareStatement("select * from animal,raca where cod_animal = " + id + " and animal.cod_raca = raca.cod_raca");
        ResultSet rs = stmt.executeQuery();
        rs.next();

        RacaBean r = new RacaBean();
        r.setCodRaca(rs.getInt("cod_raca"));
        r.setNomeRaca(rs.getString("nome_raca"));

        AnimalBean ab = new AnimalBean();
        ab.setCodAnimal(rs.getInt("cod_animal"));
        ab.setMesNas(rs.getInt("mes_nascimento"));
        ab.setAnoNas(rs.getInt("ano_nascimento"));
        ab.setPesoEntrada(rs.getFloat("peso_entrada"));
        ab.setPesoSaida(rs.getFloat("peso_saida"));
        ab.setValorCompra(rs.getFloat("preco_compra"));
        ab.setValorSaida(rs.getFloat("preco_venda"));
        ab.setSexo(rs.getString("sexo"));
        ab.setRaca(r);
        ab.setCor(rs.getString("cor"));
        ab.setDataEntrada(rs.getDate("data_compra"));
        ab.setDataSaida(rs.getDate("data_venda"));

        rs.close();
        stmt.close();
        return ab;
    }

    public AnimalBean retornaUm(String raca) throws SQLException {
        PreparedStatement stmt = this.con.prepareStatement("select * from animal,raca where nome = '" + raca + "' and animal.cod_raca = raca.cod_raca and nome_raca");
        ResultSet rs = stmt.executeQuery();
        rs.first();

        RacaBean r = new RacaBean();
        r.setCodRaca(rs.getInt("cod_raca"));
        r.setNomeRaca(rs.getString("nome_raca"));

        AnimalBean ab = new AnimalBean();
        ab.setCodAnimal(rs.getInt("cod_animal"));
        ab.setMesNas(rs.getInt("mes_nascimento"));
        ab.setAnoNas(rs.getInt("ano_nascimento"));
        ab.setPesoEntrada(rs.getFloat("peso_entrada"));
        ab.setPesoSaida(rs.getFloat("peso_saida"));
        ab.setValorCompra(rs.getFloat("valor_entrada"));
        ab.setValorSaida(rs.getFloat("valor_saida"));
        ab.setSexo(rs.getString("sexo"));
        ab.setRaca(r);
        ab.setCor(rs.getString("cor"));
        ab.setDataEntrada(rs.getDate("data_compra"));
        ab.setDataSaida(rs.getDate("data_venda"));

        rs.close();
        stmt.close();
        return ab;
    }

    public ResultSet getRel(String codigo, String ordenacao) throws SQLException {

        PreparedStatement stmt;
        ResultSet rs;
        // lower(to_ascii('%%'))
        String sql = "select e.cod_animal, e.preco_compra, g.valor_gasto, e.preco_venda ";
        sql += "from animal e, gasto g ";
        sql += "where e.cod_animal = g.cod_animal AND g.cod_animal like '%" + codigo + "%' order by " + ordenacao + " ASC";

        stmt = this.con.prepareStatement(sql);
        System.out.println(sql);
        rs = stmt.executeQuery();
        return rs;

    }

    public ResultSet getGrafico() throws SQLException {
        PreparedStatement stmt;
        ResultSet rs;
        // lower(to_ascii('%%'))
        String sql = "SELECT LPAD(animal.cod_animal, 7, '0') as CODIGO,"
                + " (animal.preco_venda - (animal.preco_compra + (SELECT IFNULL(SUM(gasto.valor_gasto),0) FROM gasto "
                + " WHERE animal.cod_animal = gasto.cod_animal)) ) AS LUCRO "
                + "FROM animal GROUP BY CODIGO ORDER BY animal.cod_animal ASC";

        stmt = this.con.prepareStatement(sql);
        System.out.println(sql);
        rs = stmt.executeQuery();
        return rs;
    }

    public List<AnimalBean> getLista(String codigo, String ordenacao) throws SQLException {

        PreparedStatement stmt;
        ResultSet rs;
        // lower(to_ascii('%%'))
        String sql = "select * from animal, raca where animal.cod_raca = raca.cod_raca and cod_animal like '%" + codigo + "%' order by " + ordenacao;
        stmt = this.con.prepareStatement(sql);
        System.out.println(sql);
        rs = stmt.executeQuery();

        List<AnimalBean> listaAnimal = new ArrayList<AnimalBean>();
        while (rs.next()) {
            RacaBean r = new RacaBean();
            r.setCodRaca(rs.getInt("cod_raca"));
            r.setNomeRaca(rs.getString("nome_raca"));

            AnimalBean ab = new AnimalBean();
            ab.setCodAnimal(rs.getInt("cod_animal"));
            ab.setMesNas(rs.getInt("mes_nascimento"));
            ab.setAnoNas(rs.getInt("ano_nascimento"));
            ab.setPesoEntrada(rs.getFloat("peso_entrada"));
            ab.setPesoSaida(rs.getFloat("peso_saida"));
            ab.setValorCompra(rs.getFloat("preco_compra"));
            ab.setValorSaida(rs.getFloat("preco_venda"));
            ab.setSexo(rs.getString("sexo"));
            ab.setRaca(r);
            ab.setCor(rs.getString("cor"));
            ab.setDataEntrada(rs.getDate("data_compra"));
            ab.setDataSaida(rs.getDate("data_venda"));

            listaAnimal.add(ab);
        }
        rs.close();
        stmt.close();
        return listaAnimal;
    }
}
