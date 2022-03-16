package motwarehouse.utils;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author Luis E. Vásquez
 */
public class HandleStringsUtils {

    public static String converNumbersToLetter(String stringParameter) {

        StringBuilder s = new StringBuilder();
        char a;
        for (int i = 0; i < stringParameter.length(); i++) {
            a = stringParameter.charAt(i);

            if (i == 0) {
                if (Character.isDigit(a)) {
                    if(a == '1') {
                        s.append("UNO");
                    } else {
                        s.append(NumberToLetterConverter.convertNumberToLetter(String.valueOf(a)));
                    }
                } else {
                    s.append(String.valueOf(a).toUpperCase());
                }

            } else {
                if (Character.isDigit(a)) {
                   if(a == '1') {
                        s.append(" ").append("UNO");
                    } else {
                        s.append(" ").append(NumberToLetterConverter.convertNumberToLetter(String.valueOf(a)));
                    }
                } else {
                    s.append(" ").append(String.valueOf(a).toUpperCase());
                }
            }
        }

        return s.toString();

    }
    
    public static String formatearCalendar(Calendar c) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault());
        return df.format(c.getTime());
    }
    
    public static String obtenerDia(Calendar c) {
        int dia = c.get(Calendar.DAY_OF_MONTH);
        String diaLetras;

        if (dia == '1') {
            diaLetras = "UNO";
        } else {
            diaLetras = NumberToLetterConverter.convertNumberToLetter(String.valueOf(dia));
        }
        return diaLetras;
    }
    
    public static String obtenerMes(Calendar c) {
        TimeZone tz = c.getTimeZone();
        ZoneId zid = tz == null ? ZoneId.systemDefault() : tz.toZoneId();
        LocalDate localDate = LocalDateTime.ofInstant(c.toInstant(), zid).toLocalDate();
        Month month = localDate.getMonth();

        String nombreMes = month.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));

        return nombreMes.toUpperCase();
    }
    
    public static String obtenerMesActual() {
        // Obtienes el mes actual
        Month month = LocalDate.now().getMonth();

        // Obtienes el nombre del mes
        String nombreMes = month.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        return nombreMes.toUpperCase();
    }
    
    public static String obtenerAnio(Calendar c) {
        int anio = c.get(Calendar.YEAR);
        return NumberToLetterConverter.convertNumberToLetter(String.valueOf(anio));
    }
    
    public static String construirFechaString(Calendar c) {
        String ret = "";
        ret = obtenerDia(c) + " DE " + obtenerMes(c) + " DEL " + obtenerAnio(c);

        return ret;
    }
}
