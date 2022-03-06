/*
 *
 */
package motowarehouse.enums;

/**
 *
 * @author Luis E. Vásquez
 */
public enum Departamentos {
    AHUACHAPAN(1, "Ahuachapan"),
    CABANAS(2, "Cabañas"),
    CUSCATLAN(3, "Cuscatlán"),
    LIBERTAD(4, "Libertad"),
    LAPAZ(5, "La Paz"),
    UNION(6, "La Unión"),
    MORAZAN(7, "Morazán"),
    SANMIGUEL(8, "San Miguel"),
    SANSALVADOR(9, "San Salvador"),
    SANVICENTE(10, "San Vicente"),
    SANTAANA(11, "Santa Ana"),
    SONSONATE(12, "Sonsonate"),
    USULUTAN(13, "Usulután"),
    CHALATENANGO(14, "Chalatenango");

    private Departamentos(int code, String descripcion) {
        this.code = code;
        this.descripcion = descripcion;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public String getDescripcionUpper() {
        return descripcion.toUpperCase();
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private int code;

    private String descripcion;

}
