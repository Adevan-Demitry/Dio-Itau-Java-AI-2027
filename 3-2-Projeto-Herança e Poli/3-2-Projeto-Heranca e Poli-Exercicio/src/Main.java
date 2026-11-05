
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        // Obtém o horário atual do Windows
        LocalTime agora = LocalTime.now();

        // Cria o relógio brasileiro
        Clock brlClock = new BRLClock();

        // Define o horário atual no relógio brasileiro
        brlClock.setHour(agora.getHour());
        brlClock.setMinute(agora.getMinute());
        brlClock.setSecond(agora.getSecond());

        // Exibe o horário brasileiro
        System.out.println("Relógio Brasileiro: " + brlClock.getTime());

        // Cria o relógio americano e converte o horário
        Clock usClock = new USClock();

        usClock.convert(brlClock);

        // Exibe o horário americano
        System.out.println("Relógio Americano: " + usClock.getTime());
    }
}
