
public class Relogio {
    private int horas;
    private int minutos;
    private int segundos;

    public Relogio(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
    
    public void setHoras(int horas) {
        if (horas > 23) {
            zerarHorario();
        } else {
            this.horas = horas;
        }
    }

    public void setMinutos(int minutos) {
        if (minutos > 59) {
            zerarHorario();
        } else {
            this.minutos = minutos;
        }
    }

    public void setSegundos(int segundos) {
        if (segundos > 59) {
            zerarHorario();
        } else {
            this.segundos = segundos;
        }
    }

    private void zerarHorario() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    
    }
   
    public String getHorarioFormatado() {
    return String.format("%02d:%02d:%02d", horas, minutos, segundos);
}
    
    public void mostraHorario() {
    System.out.println(getHorarioFormatado());
    
}
 }



