
package motwarehouse.utils;

import java.util.Calendar;

/**
 *
 * @author Luis E. Vásquez
 */
public class CreditoModel {

    private Calendar fechaCompra;

    private Calendar fechaPlazoFin;

    private Double prima;

    private Double couta;

    private Double interes;

    private Integer plazos;

    public CreditoModel(Calendar fechaCompra, Calendar fechaPlazoFin, Double prima, Double couta, Double interes, Integer plazos) {
        this.fechaCompra = fechaCompra;
        this.fechaPlazoFin = fechaPlazoFin;
        this.prima = prima;
        this.couta = couta;
        this.interes = interes;
        this.plazos = plazos;
    }

    /**
     * @return the fechaCompra
     */
    public Calendar getFechaCompra() {
        return fechaCompra;
    }

    /**
     * @param fechaCompra the fechaCompra to set
     */
    public void setFechaCompra(Calendar fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    /**
     * @return the fechaPlazoFin
     */
    public Calendar getFechaPlazoFin() {
        return fechaPlazoFin;
    }

    /**
     * @param fechaPlazoFin the fechaPlazoFin to set
     */
    public void setFechaPlazoFin(Calendar fechaPlazoFin) {
        this.fechaPlazoFin = fechaPlazoFin;
    }

    /**
     * @return the prima
     */
    public Double getPrima() {
        return prima;
    }

    /**
     * @param prima the prima to set
     */
    public void setPrima(Double prima) {
        this.prima = prima;
    }

    /**
     * @return the couta
     */
    public Double getCouta() {
        return couta;
    }

    /**
     * @param couta the couta to set
     */
    public void setCouta(Double couta) {
        this.couta = couta;
    }

    /**
     * @return the interes
     */
    public Double getInteres() {
        return interes;
    }

    /**
     * @param interes the interes to set
     */
    public void setInteres(Double interes) {
        this.interes = interes;
    }

    /**
     * @return the plazos
     */
    public Integer getPlazos() {
        return plazos;
    }

    /**
     * @param plazos the plazos to set
     */
    public void setPlazos(Integer plazos) {
        this.plazos = plazos;
    }

}
