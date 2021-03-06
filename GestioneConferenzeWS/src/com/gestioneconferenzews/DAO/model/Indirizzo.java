package com.gestioneconferenzews.DAO.model;

import java.util.Date;

public class Indirizzo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column indirizzo.cd_indirizzo
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    private Integer cdIndirizzo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column indirizzo.indirizzo
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    private String indirizzo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column indirizzo.cd_comune_istat
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    private String cdComuneIstat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column indirizzo.data_annullamento
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    private Date dataAnnullamento;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column indirizzo.tipo
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    private Integer tipo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column indirizzo.cd_persona
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    private Integer cdPersona;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column indirizzo.cd_indirizzo
     *
     * @return the value of indirizzo.cd_indirizzo
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    public Integer getCdIndirizzo() {
        return cdIndirizzo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column indirizzo.cd_indirizzo
     *
     * @param cdIndirizzo the value for indirizzo.cd_indirizzo
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    public void setCdIndirizzo(Integer cdIndirizzo) {
        this.cdIndirizzo = cdIndirizzo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column indirizzo.indirizzo
     *
     * @return the value of indirizzo.indirizzo
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column indirizzo.indirizzo
     *
     * @param indirizzo the value for indirizzo.indirizzo
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column indirizzo.cd_comune_istat
     *
     * @return the value of indirizzo.cd_comune_istat
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    public String getCdComuneIstat() {
        return cdComuneIstat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column indirizzo.cd_comune_istat
     *
     * @param cdComuneIstat the value for indirizzo.cd_comune_istat
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    public void setCdComuneIstat(String cdComuneIstat) {
        this.cdComuneIstat = cdComuneIstat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column indirizzo.data_annullamento
     *
     * @return the value of indirizzo.data_annullamento
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    public Date getDataAnnullamento() {
        return dataAnnullamento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column indirizzo.data_annullamento
     *
     * @param dataAnnullamento the value for indirizzo.data_annullamento
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    public void setDataAnnullamento(Date dataAnnullamento) {
        this.dataAnnullamento = dataAnnullamento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column indirizzo.tipo
     *
     * @return the value of indirizzo.tipo
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    public Integer getTipo() {
        return tipo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column indirizzo.tipo
     *
     * @param tipo the value for indirizzo.tipo
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column indirizzo.cd_persona
     *
     * @return the value of indirizzo.cd_persona
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    public Integer getCdPersona() {
        return cdPersona;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column indirizzo.cd_persona
     *
     * @param cdPersona the value for indirizzo.cd_persona
     *
     * @mbggenerated Wed Mar 12 22:35:50 CET 2014
     */
    public void setCdPersona(Integer cdPersona) {
        this.cdPersona = cdPersona;
    }
}