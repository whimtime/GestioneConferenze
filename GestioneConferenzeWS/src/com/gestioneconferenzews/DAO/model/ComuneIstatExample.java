package com.gestioneconferenzews.DAO.model;

import java.util.ArrayList;
import java.util.List;

public class ComuneIstatExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comune_istat
     *
     * @mbggenerated Tue Mar 11 22:24:43 CET 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comune_istat
     *
     * @mbggenerated Tue Mar 11 22:24:43 CET 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comune_istat
     *
     * @mbggenerated Tue Mar 11 22:24:43 CET 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comune_istat
     *
     * @mbggenerated Tue Mar 11 22:24:43 CET 2014
     */
    public ComuneIstatExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comune_istat
     *
     * @mbggenerated Tue Mar 11 22:24:43 CET 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comune_istat
     *
     * @mbggenerated Tue Mar 11 22:24:43 CET 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comune_istat
     *
     * @mbggenerated Tue Mar 11 22:24:43 CET 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comune_istat
     *
     * @mbggenerated Tue Mar 11 22:24:43 CET 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comune_istat
     *
     * @mbggenerated Tue Mar 11 22:24:43 CET 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comune_istat
     *
     * @mbggenerated Tue Mar 11 22:24:43 CET 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comune_istat
     *
     * @mbggenerated Tue Mar 11 22:24:43 CET 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comune_istat
     *
     * @mbggenerated Tue Mar 11 22:24:43 CET 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comune_istat
     *
     * @mbggenerated Tue Mar 11 22:24:43 CET 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comune_istat
     *
     * @mbggenerated Tue Mar 11 22:24:43 CET 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table comune_istat
     *
     * @mbggenerated Tue Mar 11 22:24:43 CET 2014
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCdComuneIsNull() {
            addCriterion("CD_COMUNE is null");
            return (Criteria) this;
        }

        public Criteria andCdComuneIsNotNull() {
            addCriterion("CD_COMUNE is not null");
            return (Criteria) this;
        }

        public Criteria andCdComuneEqualTo(String value) {
            addCriterion("CD_COMUNE =", value, "cdComune");
            return (Criteria) this;
        }

        public Criteria andCdComuneNotEqualTo(String value) {
            addCriterion("CD_COMUNE <>", value, "cdComune");
            return (Criteria) this;
        }

        public Criteria andCdComuneGreaterThan(String value) {
            addCriterion("CD_COMUNE >", value, "cdComune");
            return (Criteria) this;
        }

        public Criteria andCdComuneGreaterThanOrEqualTo(String value) {
            addCriterion("CD_COMUNE >=", value, "cdComune");
            return (Criteria) this;
        }

        public Criteria andCdComuneLessThan(String value) {
            addCriterion("CD_COMUNE <", value, "cdComune");
            return (Criteria) this;
        }

        public Criteria andCdComuneLessThanOrEqualTo(String value) {
            addCriterion("CD_COMUNE <=", value, "cdComune");
            return (Criteria) this;
        }

        public Criteria andCdComuneLike(String value) {
            addCriterion("CD_COMUNE like", value, "cdComune");
            return (Criteria) this;
        }

        public Criteria andCdComuneNotLike(String value) {
            addCriterion("CD_COMUNE not like", value, "cdComune");
            return (Criteria) this;
        }

        public Criteria andCdComuneIn(List<String> values) {
            addCriterion("CD_COMUNE in", values, "cdComune");
            return (Criteria) this;
        }

        public Criteria andCdComuneNotIn(List<String> values) {
            addCriterion("CD_COMUNE not in", values, "cdComune");
            return (Criteria) this;
        }

        public Criteria andCdComuneBetween(String value1, String value2) {
            addCriterion("CD_COMUNE between", value1, value2, "cdComune");
            return (Criteria) this;
        }

        public Criteria andCdComuneNotBetween(String value1, String value2) {
            addCriterion("CD_COMUNE not between", value1, value2, "cdComune");
            return (Criteria) this;
        }

        public Criteria andDenominazioneComuneIsNull() {
            addCriterion("DENOMINAZIONE_COMUNE is null");
            return (Criteria) this;
        }

        public Criteria andDenominazioneComuneIsNotNull() {
            addCriterion("DENOMINAZIONE_COMUNE is not null");
            return (Criteria) this;
        }

        public Criteria andDenominazioneComuneEqualTo(String value) {
            addCriterion("DENOMINAZIONE_COMUNE =", value, "denominazioneComune");
            return (Criteria) this;
        }

        public Criteria andDenominazioneComuneNotEqualTo(String value) {
            addCriterion("DENOMINAZIONE_COMUNE <>", value, "denominazioneComune");
            return (Criteria) this;
        }

        public Criteria andDenominazioneComuneGreaterThan(String value) {
            addCriterion("DENOMINAZIONE_COMUNE >", value, "denominazioneComune");
            return (Criteria) this;
        }

        public Criteria andDenominazioneComuneGreaterThanOrEqualTo(String value) {
            addCriterion("DENOMINAZIONE_COMUNE >=", value, "denominazioneComune");
            return (Criteria) this;
        }

        public Criteria andDenominazioneComuneLessThan(String value) {
            addCriterion("DENOMINAZIONE_COMUNE <", value, "denominazioneComune");
            return (Criteria) this;
        }

        public Criteria andDenominazioneComuneLessThanOrEqualTo(String value) {
            addCriterion("DENOMINAZIONE_COMUNE <=", value, "denominazioneComune");
            return (Criteria) this;
        }

        public Criteria andDenominazioneComuneLike(String value) {
            addCriterion("DENOMINAZIONE_COMUNE like", value, "denominazioneComune");
            return (Criteria) this;
        }

        public Criteria andDenominazioneComuneNotLike(String value) {
            addCriterion("DENOMINAZIONE_COMUNE not like", value, "denominazioneComune");
            return (Criteria) this;
        }

        public Criteria andDenominazioneComuneIn(List<String> values) {
            addCriterion("DENOMINAZIONE_COMUNE in", values, "denominazioneComune");
            return (Criteria) this;
        }

        public Criteria andDenominazioneComuneNotIn(List<String> values) {
            addCriterion("DENOMINAZIONE_COMUNE not in", values, "denominazioneComune");
            return (Criteria) this;
        }

        public Criteria andDenominazioneComuneBetween(String value1, String value2) {
            addCriterion("DENOMINAZIONE_COMUNE between", value1, value2, "denominazioneComune");
            return (Criteria) this;
        }

        public Criteria andDenominazioneComuneNotBetween(String value1, String value2) {
            addCriterion("DENOMINAZIONE_COMUNE not between", value1, value2, "denominazioneComune");
            return (Criteria) this;
        }

        public Criteria andIdCodiceCatastoIsNull() {
            addCriterion("ID_CODICE_CATASTO is null");
            return (Criteria) this;
        }

        public Criteria andIdCodiceCatastoIsNotNull() {
            addCriterion("ID_CODICE_CATASTO is not null");
            return (Criteria) this;
        }

        public Criteria andIdCodiceCatastoEqualTo(String value) {
            addCriterion("ID_CODICE_CATASTO =", value, "idCodiceCatasto");
            return (Criteria) this;
        }

        public Criteria andIdCodiceCatastoNotEqualTo(String value) {
            addCriterion("ID_CODICE_CATASTO <>", value, "idCodiceCatasto");
            return (Criteria) this;
        }

        public Criteria andIdCodiceCatastoGreaterThan(String value) {
            addCriterion("ID_CODICE_CATASTO >", value, "idCodiceCatasto");
            return (Criteria) this;
        }

        public Criteria andIdCodiceCatastoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CODICE_CATASTO >=", value, "idCodiceCatasto");
            return (Criteria) this;
        }

        public Criteria andIdCodiceCatastoLessThan(String value) {
            addCriterion("ID_CODICE_CATASTO <", value, "idCodiceCatasto");
            return (Criteria) this;
        }

        public Criteria andIdCodiceCatastoLessThanOrEqualTo(String value) {
            addCriterion("ID_CODICE_CATASTO <=", value, "idCodiceCatasto");
            return (Criteria) this;
        }

        public Criteria andIdCodiceCatastoLike(String value) {
            addCriterion("ID_CODICE_CATASTO like", value, "idCodiceCatasto");
            return (Criteria) this;
        }

        public Criteria andIdCodiceCatastoNotLike(String value) {
            addCriterion("ID_CODICE_CATASTO not like", value, "idCodiceCatasto");
            return (Criteria) this;
        }

        public Criteria andIdCodiceCatastoIn(List<String> values) {
            addCriterion("ID_CODICE_CATASTO in", values, "idCodiceCatasto");
            return (Criteria) this;
        }

        public Criteria andIdCodiceCatastoNotIn(List<String> values) {
            addCriterion("ID_CODICE_CATASTO not in", values, "idCodiceCatasto");
            return (Criteria) this;
        }

        public Criteria andIdCodiceCatastoBetween(String value1, String value2) {
            addCriterion("ID_CODICE_CATASTO between", value1, value2, "idCodiceCatasto");
            return (Criteria) this;
        }

        public Criteria andIdCodiceCatastoNotBetween(String value1, String value2) {
            addCriterion("ID_CODICE_CATASTO not between", value1, value2, "idCodiceCatasto");
            return (Criteria) this;
        }

        public Criteria andCodiceIstatComuneIsNull() {
            addCriterion("CODICE_ISTAT_COMUNE is null");
            return (Criteria) this;
        }

        public Criteria andCodiceIstatComuneIsNotNull() {
            addCriterion("CODICE_ISTAT_COMUNE is not null");
            return (Criteria) this;
        }

        public Criteria andCodiceIstatComuneEqualTo(String value) {
            addCriterion("CODICE_ISTAT_COMUNE =", value, "codiceIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodiceIstatComuneNotEqualTo(String value) {
            addCriterion("CODICE_ISTAT_COMUNE <>", value, "codiceIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodiceIstatComuneGreaterThan(String value) {
            addCriterion("CODICE_ISTAT_COMUNE >", value, "codiceIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodiceIstatComuneGreaterThanOrEqualTo(String value) {
            addCriterion("CODICE_ISTAT_COMUNE >=", value, "codiceIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodiceIstatComuneLessThan(String value) {
            addCriterion("CODICE_ISTAT_COMUNE <", value, "codiceIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodiceIstatComuneLessThanOrEqualTo(String value) {
            addCriterion("CODICE_ISTAT_COMUNE <=", value, "codiceIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodiceIstatComuneLike(String value) {
            addCriterion("CODICE_ISTAT_COMUNE like", value, "codiceIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodiceIstatComuneNotLike(String value) {
            addCriterion("CODICE_ISTAT_COMUNE not like", value, "codiceIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodiceIstatComuneIn(List<String> values) {
            addCriterion("CODICE_ISTAT_COMUNE in", values, "codiceIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodiceIstatComuneNotIn(List<String> values) {
            addCriterion("CODICE_ISTAT_COMUNE not in", values, "codiceIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodiceIstatComuneBetween(String value1, String value2) {
            addCriterion("CODICE_ISTAT_COMUNE between", value1, value2, "codiceIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodiceIstatComuneNotBetween(String value1, String value2) {
            addCriterion("CODICE_ISTAT_COMUNE not between", value1, value2, "codiceIstatComune");
            return (Criteria) this;
        }

        public Criteria andSiglaProvinciaIsNull() {
            addCriterion("SIGLA_PROVINCIA is null");
            return (Criteria) this;
        }

        public Criteria andSiglaProvinciaIsNotNull() {
            addCriterion("SIGLA_PROVINCIA is not null");
            return (Criteria) this;
        }

        public Criteria andSiglaProvinciaEqualTo(String value) {
            addCriterion("SIGLA_PROVINCIA =", value, "siglaProvincia");
            return (Criteria) this;
        }

        public Criteria andSiglaProvinciaNotEqualTo(String value) {
            addCriterion("SIGLA_PROVINCIA <>", value, "siglaProvincia");
            return (Criteria) this;
        }

        public Criteria andSiglaProvinciaGreaterThan(String value) {
            addCriterion("SIGLA_PROVINCIA >", value, "siglaProvincia");
            return (Criteria) this;
        }

        public Criteria andSiglaProvinciaGreaterThanOrEqualTo(String value) {
            addCriterion("SIGLA_PROVINCIA >=", value, "siglaProvincia");
            return (Criteria) this;
        }

        public Criteria andSiglaProvinciaLessThan(String value) {
            addCriterion("SIGLA_PROVINCIA <", value, "siglaProvincia");
            return (Criteria) this;
        }

        public Criteria andSiglaProvinciaLessThanOrEqualTo(String value) {
            addCriterion("SIGLA_PROVINCIA <=", value, "siglaProvincia");
            return (Criteria) this;
        }

        public Criteria andSiglaProvinciaLike(String value) {
            addCriterion("SIGLA_PROVINCIA like", value, "siglaProvincia");
            return (Criteria) this;
        }

        public Criteria andSiglaProvinciaNotLike(String value) {
            addCriterion("SIGLA_PROVINCIA not like", value, "siglaProvincia");
            return (Criteria) this;
        }

        public Criteria andSiglaProvinciaIn(List<String> values) {
            addCriterion("SIGLA_PROVINCIA in", values, "siglaProvincia");
            return (Criteria) this;
        }

        public Criteria andSiglaProvinciaNotIn(List<String> values) {
            addCriterion("SIGLA_PROVINCIA not in", values, "siglaProvincia");
            return (Criteria) this;
        }

        public Criteria andSiglaProvinciaBetween(String value1, String value2) {
            addCriterion("SIGLA_PROVINCIA between", value1, value2, "siglaProvincia");
            return (Criteria) this;
        }

        public Criteria andSiglaProvinciaNotBetween(String value1, String value2) {
            addCriterion("SIGLA_PROVINCIA not between", value1, value2, "siglaProvincia");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table comune_istat
     *
     * @mbggenerated do_not_delete_during_merge Tue Mar 11 22:24:43 CET 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table comune_istat
     *
     * @mbggenerated Tue Mar 11 22:24:43 CET 2014
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}