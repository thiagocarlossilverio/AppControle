/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AppControle.dao;

import AppControle.beans.AnimalBean;
import AppControle.conexao.Conexao;
import AppControle.beans.RacaBean;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalvDAO {

    Connection con;

    public AnimalvDAO() throws SQLException {
        con = Conexao.getConnection();
    }

    public void vender(AnimalBean a) throws SQLException {
        String sql = "UPDATE animal SET animal.data_venda = curdate(),"
                + " animal.peso_saida = ?, animal.preco_venda = ?"
                + " WHERE animal.cod_animal = ?";

        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setFloat(1, a.getPesoSaida());
        stmt.setFloat(2, a.getValorSaida());
        stmt.setInt(3, a.getCodAnimal());

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
                + "data_compra = ?, data_venda = ?, peso_entrada = ?, peso_saida = ?, preco_compra = ?,preco_venda = ? "
                + " WHERE cod_animal = " + id;
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, aBean.getRaca().getCodRaca());
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
