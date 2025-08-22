import java.util.Scanner;

public class Main{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int menu2 = 1;
int menu1 = 1;

Controlador Array = new Controlador();

while (menu1 == 1)
    while(menu2 == 1){
    System.out.println("Hacer Reserva: \n1.Reservar Salones disponibles \n 2.Ver eventos en espera");
    int ReservaC = scanner.nextInt();
        while(ReservaC == 1){
            Array.MostrarEventos();
        ReservaC = 0;
        }

}
menu2 = 0;



scanner.close();

}
}
