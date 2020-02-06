package model.logic;

public class Multa
{

    //todos los parametros de una multa
    int OBJECTID;
    String FECHA_HORA;
    String MEDIO_DETE;
    String CLASE_VEHI;
    String TIPO_SERVI;
    String INFRACCION;
    String DES_INFRAC;
    String LOCALIDAD;

    //inicializa la multa
    public Multa(int id, String fecha, String medio, String clase, String servicio, String infraccion, String desInfraccion, String localidad)
    {
        OBJECTID = id;
        FECHA_HORA = fecha;
        MEDIO_DETE = medio;
        CLASE_VEHI = clase;
        TIPO_SERVI = servicio;
        INFRACCION = infraccion;
        DES_INFRAC = desInfraccion;
        LOCALIDAD = localidad;
    }

    
}