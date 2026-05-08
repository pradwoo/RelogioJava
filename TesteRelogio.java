public class TesteRelogio {
    public static void main(String[] args) {

        Relogio relogio = new Relogio(8, 15, 30);
        System.out.print("Horário inicial: ");
        relogio.mostraHorario();

        // gets
        System.out.println("Horas: " + relogio.getHoras());
        System.out.println("Minutos: " + relogio.getMinutos());
        System.out.println("Segundos: " + relogio.getSegundos());

        // sets
        relogio.setHoras(12);
        relogio.setMinutos(60);
        relogio.setSegundos(60);
        relogio.mostraHorario();

        // teste com valor inválido
        relogio.setMinutos(70); // inválido
        System.out.print("Após valor inválido (minutos=70): ");
        relogio.mostraHorario();

        // teste com valor válido
        relogio.setHoras(22);
        relogio.setMinutos(59);
        relogio.setSegundos(51);
        System.out.print("Horário final: ");
        relogio.mostraHorario();
    }
}
