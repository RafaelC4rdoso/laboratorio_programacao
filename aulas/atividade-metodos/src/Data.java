import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class Data {
    public static Integer getDia(String data) {
        if (isDataValida(data)) {
            return Integer.valueOf(data.substring(0, 2));
        } else {
            return 0;
        }
    }

    public static Integer getMes(String data) {
        if (isDataValida(data)) {
            return Integer.valueOf(data.substring(3, 5));
        } else {
            return 0;
        }
    }

    public static Integer getAno(String data) {
        if (isDataValida(data)) {
            return Integer.valueOf(data.substring(6, 10));
        } else {
            return 0;
        }
    }

    public static boolean isDataValida(String data) {
        String dataFormat = "dd/MM/uuuu";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dataFormat).withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate date = LocalDate.parse(data, dtf);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
