package atlas.DTO;

public class Usuario {
    private int Id;
    private int Run;
    private String Dv;
    private String Nombre;
    private String Email;
    private String Contrasena;
    private int Edad;
    private int Telefono;
    

    public Usuario(){
        this.Id = 0;
        this.Run = 0;
        this.Dv = "";
        this.Nombre = "";
        this.Email = "";
        this.Contrasena = "";
        this.Edad = 0;
        this.Telefono = 0;
    } 

    public Usuario(int Id, int Run, String Dv, String Nombre, String Email, String Contrasena, int Edad, int Telefono) {
        this.Id = Id;
        this.Run = Run;
        this.Dv = Dv;
        this.Nombre = Nombre;
        this.Email = Email;
        this.Contrasena = Contrasena;
        this.Edad = Edad;
        this.Telefono = Telefono;
    }
    
    public int getRun() {
        return Run;
    }

    public void setRun(int Run, char Dv) {
        if(this.validarRun(Run, Dv)){
            this.Run = Run;
            this.Dv = Dv+"";
        }
    }
    
    public String getDv() {
        return Dv;
    }
    
    public Usuario(int Edad) {
        this.Edad = Edad;
    }
    
    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        if(Nombre.length() >= 18 ){
            this.Edad = Edad;
        }
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;  
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        if(Nombre.length() <= 4 ){
            this.Nombre = Nombre;        
        }
    }        
    
    public String getEmail(){
        return Email;
    }

    public void setEmail(String Email) {
        if(Email.length() > 5 && Email.contains("@")){
            this.Email = Email;
        }
    }
    
    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        StringBuilder sb = new StringBuilder();
        sb.append(Telefono);
        
        if(sb.length() >= 10){
            this.Telefono = Telefono;
        }
    }

    public void setContrasena(String Contrasena) {
        if(Contrasena.length() > 6 && Contrasena.contains("[A-Z]*") && Contrasena.contains("[0-9]*")){
            this.Contrasena = Contrasena;
        }
    }
    
    public boolean validarRun(int run, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; run != 0; run /= 10) {
                s = (s + run % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
}    
