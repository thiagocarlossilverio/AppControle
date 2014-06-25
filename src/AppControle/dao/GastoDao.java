package AppControle.dao;

import AppControle.beans.GastoBean;
import AppControle.beans.TipoGastoBean;
import AppControle.conexao.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thiago Carlos
 */
public class GastoDao {

    private Connection con;

    public GastoDao() throws SQLException {
        con = Conexao.getConnection();
    }

    public void inserir(GastoBean rb) throws SQLException {
        String sql = "insert into gasto "
                + "(cod_animal,data_gasto,valor_gasto,cod_tipo) values "
                + "(?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        GastoBean g = new GastoBean();

        stmt.setInt(1, rb.getCodAnimal());
        stmt.setDate(2, (Date) rb.getDataGasto());
        stmt.setDouble(3, rb.getValorGasto());
        stmt.setDouble(4, rb.getTipoGasto().getCodTipoGasto());
        stmt.execute();
        stmt.close();



    }

    public void fechaConexao() throws SQLException {
        this.con.close();
    }

    public void altera(GastoBean aBean) throws SQLException {
        String sql = "UPDATE gasto SET cod_animal = ?,data_gasto = ?,valor_gasto = ? "
                + " WHERE cod_gasto = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, aBean.getCodGasto());
        stmt.setInt(2,aBean.getCodAnimal());
        stmt.setDate(3, (Date) aBean.getDataGasto());
        stmt.setDouble(4,  aBean.getValorGasto());

        stmt.execute();
        stmt.close();
    }

    public void remove(int id) throws SQLException {
        PreparedStatement stmt = this.con.prepareStatement("delete from gasto where cod_gasto = " + id);
        stmt.execute();
        stmt.close();
    }

    public List<GastoBean> getLista(String nome) throws SQLException {

        PreparedStatement stmt;
        ResultSet rs;
        // lower(to_ascii('%%'))
        String sql = "select g.cod_gasto, (select nome_tipo from tipo_gasto where tipo_gasto.cod_tipo = g.cod_tipo) as nome_tipo,g.cod_animal,g.data_gasto,g.valor_gasto from gasto g,tipo_gasto tp where cod_gasto like '%"+nome+"%' order by cod_gasto asc";
        stmt = this.con.prepareStatement(sql);
        System.out.println(sql);
        rs = stmt.executeQuery();

        List<GastoBean> listaGasto = new ArrayList<GastoBean>();
        while (rs.next()) {
            GastoBean r = new GastoBean();
            TipoGastoBean tgb = new TipoGastoBean();
            r.setCodAnimal(rs.getInt("cod_animal"));
            r.setDataGasto(rs.getDate("data_gasto"));
            r.setValorGasto(rs.getInt("valor_gasto"));
            tgb.setNomeGasto(rs.getString("nome_tipo"));
            r.setTipoGasto(tgb);
            listaGasto.add(r);
        }
        rs.close();
        stmt.close();
        return listaGasto;
    }
}
