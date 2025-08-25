public class TamañoDeSalon{
    private String Tamaño;

    @Override
public String toString() {
    return Tamaño;
}

    public String getTamaño() {
        return Tamaño;
    }
    public TamañoDeSalon (String tamaño){
        this.Tamaño = tamaño;
    }
    public void setTamaño(String tamaño) {
        Tamaño = tamaño;
    }
    


    
}

