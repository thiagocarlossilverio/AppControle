/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package AppControle.beans;

import java.util.Date;

/**
 *
 * @author Thiago Carlos
 */
public class GastoBean {

private int codGasto;
private Date dataGasto;
private double valorGasto;
private String descricaoGasto;
private TipoGastoBean tipoGasto;
private int codTipo;
private int codAnimal;   
/**
     * @return the codGasto
     */
    public int getCodGasto() {
        return codGasto;
    }

    /**
     * @param codGasto the codGasto to set
     */
    public void setCodGasto(int codGasto) {
        this.codGasto = codGasto;
    }

    /**
     * @return the dataGasto
     */
    public Date getDataGasto() {
        return dataGasto;
    }

    /**
     * @param dataGasto the dataGasto to set
     */
    public void setDataGasto(Date dataGasto) {
        this.dataGasto = dataGasto;
    }

    /**
     * @return the valorGasto
     */
    public double getValorGasto() {
        return valorGasto;
    }

    /**
     * @param valorGasto the valorGasto to set
     */
    public void setValorGasto(double valorGasto) {
        this.valorGasto = valorGasto;
    }

    /**
     * @return the descricaoGasto
     */
    public String getDescricaoGasto() {
        return descricaoGasto;
    }

    /**
     * @param descricaoGasto the descricaoGasto to set
     */
    public void setDescricaoGasto(String descricaoGasto) {
        this.descricaoGasto = descricaoGasto;
    }

    /**
     * @return the tipoGasto
     */
    public TipoGastoBean getTipoGasto() {
        return tipoGasto;
    }

    /**
     * @param tipoGasto the tipoGasto to set
     */
    public void setTipoGasto(TipoGastoBean tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    /**
     * @return the codTipo
     */
    public int getCodTipo() {
        return codTipo;
    }

    /**
     * @param codTipo the codTipo to set
     */
    public void setCodTipo(int codTipo) {
        this.codTipo = codTipo;
    }

    /**
     * @return the codAnimal
     */
    public int getCodAnimal() {
        return codAnimal;
    }

    /**
     * @param codAnimal the codAnimal to set
     */
    public void setCodAnimal(int codAnimal) {
        this.codAnimal = codAnimal;
    }

}
