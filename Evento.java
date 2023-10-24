public class Evento {

    private String mensaje;
    private TipoEvento evento;

    public Evento(TipoEvento evento) {
        this.evento = evento;
        this.Mensaje();
    }

    public void Mensaje(){
        switch (evento) {
            case ROBO -> mensaje = "Me roban";
            case DESCONEXION -> mensaje = "Desconecto";
            case CONEXION -> mensaje = "Conectado";
            case DESCONOCIDO -> mensaje = " ";
        }


    }
}
