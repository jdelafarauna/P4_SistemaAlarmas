public class Sensor {


    private int id;
    private boolean activado;
    private Camara camara;
    private Evento evento;

    public Sensor(int id, String ip,boolean activado) {
        Camara camara = new Camara(ip);
        this.id = id;
        this.activado = activado;
    }
    public void Activar_Desactivar(){
        this.activado = !this.activado;
    }

    public void AñadirEvento(TipoEvento evento,String mensaje ) {

        this.evento.Mensaje();

    }
}
