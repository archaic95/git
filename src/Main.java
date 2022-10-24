import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите дату формата dd.MM.yyyy:");
        String date = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.MM.yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(localDate, now);
        System.out.printf("Разница дат: %d лет, %d месяцев и %d дней.", diff.getYears(), diff.getMonths(), diff.getDays());
    }
}