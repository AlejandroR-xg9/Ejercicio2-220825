import java.time.LocalDate;

public class Salon{
    private String Nombre;
    private TamañoDeSalon TipoDeSalon;
    private String Encargado;
    private String TipoDeEvento;
    private LocalDate Fecha;
    private int Horario;
    
    //constructor we
    public Salon(String nombre, String encargado, TamañoDeSalon tipoDeSalon,String tipoDeEvento, LocalDate fecha, int horario) {
        this.Nombre = nombre;
        this.Encargado = encargado;
        this.TipoDeSalon = tipoDeSalon;
        this.TipoDeEvento = tipoDeEvento;
        this.Fecha = fecha;
        this.Horario = horario;
    }
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public TamañoDeSalon getTipoDeSalon() {
        return TipoDeSalon;
    }
    public void setTipoDeSalon(TamañoDeSalon tipoDeSalon) {
        TipoDeSalon = tipoDeSalon;
    }
    public String getEncargado() {
        return Encargado;
    }
    public void setEncargado(String encargado) {
        Encargado = encargado;
    }
    public String getTipoDeEvento() {
        return TipoDeEvento;
    }
    public void setTipoDeEvento(String tipoDeEvento) {
        TipoDeEvento = tipoDeEvento;
    }
    public LocalDate getFecha() {
        return Fecha;
    }
    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }
    public int getHorario() {
        return Horario;
    }
    public void setHorario(int horario) {
        this.Horario = horario;
    }
}

