package AppControle.util;

import AppControle.util.TelaMsg;

public class UtilInterface {

    public static void msgErro(String txt) {
        //chama a classe TelaMSG passando como parametro o tipo de icone e a menssagem
        new TelaMsg(1, "<html>" + txt.replaceAll("\n", "<br>") + "</html>");
    }

    public static void msgSucesso(String txt) {
        //chama a classe TelaMSG passando como parametro o tipo de icone e a menssagem
        new TelaMsg(2, "<html>" + txt.replaceAll("\n", "<br>") + "</html>");
    }

    public static void msgPergunta(String txt) {
        //chama a classe TelaMSG passando como parametro o tipo de icone e a menssagem
        new TelaMsg(3, "<html>" + txt.replaceAll("\n", "<br>") + "</html>");
    }

    public static void msgInformação(String txt) {
        //chama a classe TelaMSG passando como parametro o tipo de icone e a menssagem
        new TelaMsg(4, "<html>" + txt.replaceAll("\n", "<br>") + "</html>");
    }

    public static String dataParaSQL(String data) {
        String a[] = data.split("/");
        return a[2] + "-" + a[1] + "-" + a[0];
    }
}
