import java.sql.Timestamp;
import java.util.Timer;
import java.util.TimerTask;

public class BombaDagua {

    private Boolean status;

    public void ligar(Integer breaktime) throws InterruptedException {
        status = true;
        Timer timer = new Timer();
        int i = 0;
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(i + 1);
            }
        }, 1, breaktime);
        desligar();
    };

    public void desligar(){
        status = false;
    };


}
