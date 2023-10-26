public class Evento {

    private String mensaje;
    private TipoEvento evento;

    public Evento(TipoEvento evento,String mensaje) {
        this.mensaje = mensaje;
        this.evento = evento;
    }
}
