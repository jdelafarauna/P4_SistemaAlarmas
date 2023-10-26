import java.util.ArrayList;

public class Sensor {


    private int id;
    private boolean estado;
    private Camara camara;

    public Sensor(int id, String ip, boolean estado) {

        Camara camara = new Camara(ip);
        this.id = id;
        this.estado = estado;
    }


    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
