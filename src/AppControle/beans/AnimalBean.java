/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AppControle.beans;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Thiago Carlos
 */
public class AnimalBean {

    private int codAnimal;
    private int mesNas;
    private int anoNas;
    private RacaBean raca;
    private String sexo;
    private String cor;
    private Date DataEntrada;
    private Date dataSaida;
    private float pesoSaida;
    private float valorCompra;
    private float valorSaida;
    private List<GastoBean> gastos;
    private float PesoEntrada;

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

    /**
     * @return the mesNas
     */
    public int getMesNas() {
        return mesNas;
    }

    /**
     * @param mesNas the mesNas to set
     */
    public void setMesNas(int mesNas) {
        this.mesNas = mesNas;
    }

    /**
     * @return the anoNas
     */
    public int getAnoNas() {
        return anoNas;
    }

    /**
     * @param anoNas the anoNas to set
     */
    public void setAnoNas(int anoNas) {
        this.anoNas = anoNas;
    }

    /**
     * @return the raca
     */
    public RacaBean getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(RacaBean raca) {
        this.raca = raca;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the DataEntrada
     */
    public Date getDataEntrada() {
        return DataEntrada;
    }

    /**
     * @param DataEntrada the DataEntrada to set
     */
    public void setDataEntrada(Date DataEntrada) {
        this.DataEntrada = DataEntrada;
    }

    /**
     * @return the dataSaida
     */
    public Date getDataSaida() {
        return dataSaida;
    }

    /**
     * @param dataSaida the dataSaida to set
     */
    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    /**
     * @return the pesoSaida
     */
    public float getPesoSaida() {
        return pesoSaida;
    }

    /**
     * @param pesoSaida the pesoSaida to set
     */
    public void setPesoSaida(float pesoSaida) {
        this.pesoSaida = pesoSaida;
    }

    /**
     * @return the valorCompra
     */
    public float getValorCompra() {
        return valorCompra;
    }

    /**
     * @param valorCompra the valorCompra to set
     */
    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    /**
     * @return the valorSaida
     */
    public float getValorSaida() {
        return valorSaida;
    }

    /**
     * @param valorSaida the valorSaida to set
     */
    public void setValorSaida(float valorSaida) {
        this.valorSaida = valorSaida;
    }

    /**
     * @return the gastos
     */
    public List<GastoBean> getGastos() {
        return gastos;
    }

    /**
     * @param gastos the gastos to set
     */
    public void setGastos(List<GastoBean> gastos) {
        this.gastos = gastos;
    }

    /**
     * @return the PesoEntrada
     */
    public float getPesoEntrada() {
        return PesoEntrada;
    }

    /**
     * @param PesoEntrada the PesoEntrada to set
     */
    public void setPesoEntrada(float PesoEntrada) {
        this.PesoEntrada = PesoEntrada;
    }
}
