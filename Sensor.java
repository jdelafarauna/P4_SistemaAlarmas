public class Sensor {


    private int id;
    private boolean activado;
    private Camara camara;

    public Sensor(int id, String ip,boolean activado) {
        Camara camara = new Camara(ip);
        this.id = id;
        this.activado = activado;
    }
    public void Activar_Desactivar(){
        this.activado = !this.activado;
    }

}
