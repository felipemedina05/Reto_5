package Modelo;

public class Sucursal {

    private int idsucursal;
    private String nombreSucursal;

    public Sucursal() {
        this.idsucursal = 0;
        this.nombreSucursal = "";
    }

    public int getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(int idsucursal) {
        this.idsucursal = idsucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    @Override
    public String toString() {
        return getNombreSucursal();
    }

}
