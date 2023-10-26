import java.util.ArrayList;

public class Casa{

    private boolean sensoresActivados;
    ArrayList<Sensor> sensores;
    ArrayList<Evento> evento;



    public Casa() {
       this.sensoresActivados = false;

    }
    public boolean SensorDuplicado(int id) {

        if (sensores.size() > id) {
            return true;
        } else{
            return false;
        }
    }
    public void AñadirSensor(int id, String ip){

        if (this.SensorDuplicado(id)){
            sensores.add(new Sensor(id,ip,false));
            System.out.println("Sensor "+ id + " correctamente.");
        }else {
            System.out.println("Sensor " + id + " duplicado.");
        }

    }

    public void CambiarEstadoAlarma(boolean estado){

        for (Sensor sensor: sensores){

            sensor.setEstado(estado);
        }

    }


    public Casa(ArrayList<Evento> evento) {
        this.evento = evento;
    }

    public void añadirEvento(TipoEvento evento, String mensaje){
        Evento aux = new Evento(evento,mensaje);
        this.evento.add(aux);
    }
}
