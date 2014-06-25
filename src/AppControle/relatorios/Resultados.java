package AppControle.relatorios;

import AppControle.dao.AnimalDAO;
import AppControle.util.UtilInterface;


import java.util.HashMap;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Thiago Carlos
 */
public class Resultados {

    public static void relatorio(String nome, String ordenacao, String caminho) {
        try {
            AnimalDAO dao = new AnimalDAO();

            JRResultSetDataSource jrRS = new JRResultSetDataSource(dao.getRel(nome, ordenacao));
            JasperPrint print = JasperFillManager.fillReport(caminho, new HashMap(), jrRS);
            JasperViewer.viewReport(print, false);

        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    public static void grafico(String caminho) {
        try {
            AnimalDAO dao = new AnimalDAO();

            JRResultSetDataSource jrRS = new JRResultSetDataSource(dao.getGrafico());
            JasperPrint print = JasperFillManager.fillReport(caminho, new HashMap(), jrRS);
            JasperViewer.viewReport(print, false);

        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }
}
