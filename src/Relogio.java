public class Relogio {
    private int horas;
    private int minutos;
    private int segundos;

    public Relogio() {
        this(0, 0, 0);
    }

    public Relogio(int horas, int minutos, int segundos) {
        ajustarHorario(horas, minutos, segundos);
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

    public void ajustarHorario(int horas, int minutos, int segundos) {
        validar(horas, 0, 23, "horas");
        validar(minutos, 0, 59, "minutos");
        validar(segundos, 0, 59, "segundos");

        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void tic() {
        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    private void validar(int valor, int minimo, int maximo, String campo) {
        if (valor < minimo || valor > maximo) {
            throw new IllegalArgumentException(
                "Valor inválido para " + campo + ": " + valor
            );
        }
    }
}
