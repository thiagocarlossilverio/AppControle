/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AppControle.dao;

import AppControle.beans.GastoBean;
import AppControle.beans.TipoGastoBean;
import AppControle.conexao.Conexao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author Thiago Carlos
 */
public class TipoGastoDAO {

    private Connection con;

    public TipoGastoDAO() throws SQLException {
        con = (Connection) Conexao.getConnection();
    }

    public void inserir(TipoGastoBean gb) throws SQLException {
        String sql = "insert into tipo_gasto "
                + "(nome_tipo) values "
                + "(?)";

        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, gb.getNomeGasto());

        stmt.execute();
        stmt.close();
    }

    public void altera(TipoGastoBean aBean) throws SQLException {
        String sql = "UPDATE tipo_gasto SET nome_tipo = ? "
                + " WHERE cod_tipo = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, aBean.getNomeGasto());
        stmt.setInt(2, aBean.getCodTipoGasto());
        stmt.execute();
        stmt.close();
    }

    public void remove(int id) throws SQLException {
        PreparedStatement stmt = this.con.prepareStatement("delete from tipo_gasto where cod_tipo = " + id);
        stmt.execute();
        stmt.close();
    }

    public List<TipoGastoBean> getLista(String nome) throws SQLException {

        PreparedStatement stmt;
        ResultSet rs;
        // lower(to_ascii('%%'))
        String sql = "select * from tipo_gasto where nome_tipo like '%" + nome + "%' order by nome_tipo asc";
        stmt = this.con.prepareStatement(sql);
        System.out.println(sql);
        rs = stmt.executeQuery();

        List<TipoGastoBean> listaGasto = new ArrayList<TipoGastoBean>();
        while (rs.next()) {
            TipoGastoBean r = new TipoGastoBean();
            r.setCodTipoGasto(rs.getInt("cod_tipo"));
            r.setNomeGasto(rs.getString("nome_tipo"));

            listaGasto.add(r);
        }
        rs.close();
        stmt.close();
        return listaGasto;

    }
}
