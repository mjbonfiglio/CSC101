
import java.time.*;
import java.time.format.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;

class dateTime {
    public static void main(String[] args) {
        LocalDate time = LocalDate.now();
        System.out.println(time);

        DateTimeFormatter fTime = DateTimeFormatter.ofPattern("MMM, DD, YYYY - hh:mm:ss");
        System.out.println(time.format(fTime));

        LocalDate birthday = LocalDate.of(2003, 10, 5);
        System.out.println(birthday);
    }
}
