public class Casa{

    private boolean sensoresActivados;
    private Sensor sensores[];

    private int numsensores;


    public Casa() {
       this.sensoresActivados = false;
       this.numsensores = 0;
    }
    public boolean SensorDuplicado(int id) {

        if (this.numsensores > id) {
            return true;
        } else{
            return false;
        }
    }
    public void AñadirSensor(int id, String ip){
        this.numsensores += 1;
        if (!(this.SensorDuplicado(id))){
            sensores[id] = new Sensor(id, ip, false);
            System.out.println("Sensor " + id + " añadido correctamente.");
        }else{
            System.out.println("Sensor " + id + " duplicado.");
        }

    }

    public void CambiarEstadoAlarma(){
        for (int i = 1; i<this.numsensores ;i++ ){
            this.sensores[i].Activar_Desactivar();
        }
    }
    public void añadirEvento(TipoEvento evento,String mensaje){
        this.sensores.Aña
    }
}
