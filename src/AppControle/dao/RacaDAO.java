/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AppControle.dao;

import AppControle.beans.RacaBean;
import AppControle.conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thiago Carlos
 */
public class RacaDAO {

    private Connection con;

    public RacaDAO() throws SQLException {
        con = Conexao.getConnection();
    }

    public void inserir(RacaBean rb) throws SQLException {
        String sql = "insert into raca "
                + "(nome_raca) values "
                + "(?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        RacaBean r = new RacaBean();
        stmt.setString(1, rb.getNomeRaca());


        stmt.execute();
        stmt.close();

    }

    public void altera(RacaBean aBean) throws SQLException {
        String sql = "UPDATE raca SET nome_raca = ? "
                + " WHERE cod_raca = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, aBean.getNomeRaca());
        stmt.setInt(2, aBean.getCodRaca());
        stmt.execute();
        stmt.close();
    }

    public void remove(int id) throws SQLException {
        PreparedStatement stmt = this.con.prepareStatement("delete from raca where cod_raca = " + id);
        stmt.execute();
        stmt.close();
    }
   

    public List<RacaBean> getLista(String nome) throws SQLException {

        PreparedStatement stmt;
        ResultSet rs;
        // lower(to_ascii('%%'))
        String sql = "select * from raca where nome_raca like '%" + nome + "%' order by nome_raca asc";
        stmt = this.con.prepareStatement(sql);
        System.out.println(sql);
        rs = stmt.executeQuery();

        List<RacaBean> listaRaca = new ArrayList<RacaBean>();
        while (rs.next()) {
            RacaBean r = new RacaBean();
            r.setCodRaca(rs.getInt("cod_raca"));
            r.setNomeRaca(rs.getString("nome_raca"));

            listaRaca.add(r);
        }
        rs.close();
        stmt.close();
        return listaRaca;

    }
}
