import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();
        Relogio relogio = new Relogio(agora.getHour(), agora.getMinute(), agora.getSecond());

        System.out.println("Horário inicial: " + relogio);
        relogio.tic();
        System.out.println("Após 1 tic: " + relogio);
    }
}
