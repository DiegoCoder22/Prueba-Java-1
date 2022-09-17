package atlas.DTO;

public class Club {
    private String Codigo;
    private String Nombre;
    private String Lema;
    private int Valor;
    private String Colores;
    
    public Club(){
        this.Codigo = "";
        this.Nombre = "";
        this.Lema = "";
        this.Valor = 0;
        this.Colores = "";  
    }

    public Club(String Codigo, String Nombre, String Lema, int Valor, String Colores) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Lema = Lema;
        this.Valor = Valor;
        this.Colores = Colores;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public String getColores() {
        return Colores;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    } 
    
}
