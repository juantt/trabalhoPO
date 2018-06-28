/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasperSoft;

/**
 *
 * @author ReturnOfPc
 */
public class Relatorio {
    private int CODJOGO;
    private String NOMEJOGO;
    private String CATJOGO;
    private int CODPLAT;
    private String NOMEPLAT;
    private String MULT;
    private String ONLINE;
    private String PORTATIL;

    public int getCODJOGO() {
        return CODJOGO;
    }

    public void setCODJOGO(int CODJOGO) {
        this.CODJOGO = CODJOGO;
    }

    public String getNOMEJOGO() {
        return NOMEJOGO;
    }

    public void setNOMEJOGO(String NOMEJOGO) {
        this.NOMEJOGO = NOMEJOGO;
    }

    public String getCATJOGO() {
        return CATJOGO;
    }

    public void setCATJOGO(String CATJOGO) {
        this.CATJOGO = CATJOGO;
    }

    public int getCODPLAT() {
        return CODPLAT;
    }

    public void setCODPLAT(int CODPLAT) {
        this.CODPLAT = CODPLAT;
    }

    public String getNOMEPLAT() {
        return NOMEPLAT;
    }

    public void setNOMEPLAT(String NOMEPLAT) {
        this.NOMEPLAT = NOMEPLAT;
    }

    public String getMULT() {
        return MULT;
    }

    public void setMULT(String MULT) {
        this.MULT = MULT;
    }

    public String getONLINE() {
        return ONLINE;
    }

    public void setONLINE(String ONLINE) {
        this.ONLINE = ONLINE;
    }

    public String getPORTATIL() {
        return PORTATIL;
    }

    public void setPORTATIL(String PORTATIL) {
        this.PORTATIL = PORTATIL;
    }

}

   /* public void getRelatorio(List<relatorio> lista) {
            JasperPrint print = null;
            JRDataSource dataSource = new JRBeanCollectionDataSource(lista);
                try {
                    print = JasperFillManager.fillReport("C:\Users\Domi\JaspersoftWorkspace\MyReports\Games4.jasper", null, dataSource);
                    JasperPrintManager.printReport(print, true);
                } catch (Exception erro) {
                    erro.printStackTrace();
                }
*/
            