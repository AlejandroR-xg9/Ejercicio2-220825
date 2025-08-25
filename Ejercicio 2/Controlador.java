import java.util.ArrayList;

public class Controlador {

    public void MostrarEventos(ArrayList<Salon> eventos){
    for (Salon evento : eventos) {
            System.out.println(evento);
        }

}

public void MostrarSalones(ArrayList<Salon> salones){
    for (Salon salon : salones) {
    System.out.println("Salon disponible: " + salon.getNombre()+ ", Tipo: " + salon.getTipoDeSalon());
}
}
}
