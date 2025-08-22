import java.time.LocalDate;
public class Controlador {

    
public void MostrarEventos(){
//Instancias epicas
TamañoDeSalon Pequeño = new TamañoDeSalon("Pequeño");
TamañoDeSalon Grande = new TamañoDeSalon("Grande");
TamañoDeSalon Mediano = new TamañoDeSalon("Mediano");

Salon[] Eventos = {
    new Salon("PepitoFiesta", "Pepito",Pequeño ,"Fiesta", LocalDate.of(2025,5,5), 1700),
    new Salon("PepitoFiesta", "Pepito",Grande ,"Gala", LocalDate.of(2025,5,5), 1700),
    new Salon("PepitoFiesta", "Pepito",Mediano ,"Fiesta", LocalDate.of(2025,5,5), 1700)
};

System.out.println(Eventos[2]);

}
public void MostrarSalones(){

//Instancias epicas
TamañoDeSalon Pequeño = new TamañoDeSalon("Pequeño");
TamañoDeSalon Grande = new TamañoDeSalon("Grande");
TamañoDeSalon Mediano = new TamañoDeSalon("Mediano");

Salon[] Salones = {
    new Salon("Disponible 1",null,Pequeño, null,null ,0),
    new Salon("Disponible 2",null,Mediano, null,null ,0),
    new Salon("Disponible 3",null,Grande, null,null ,0),
    new Salon("Disponible 4",null,Grande, null,null ,0)
    };
    System.out.println(Salones[2]);
}
}
