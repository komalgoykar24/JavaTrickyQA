    import java.time.LocalDate;
    import java.time.LocalTime;

    public class DateTime {
        public static void main(String[] args) {
            LocalDate today = LocalDate.now();  // Current date
            System.out.println(today);  // Outputs something like 2024-09-10

            LocalDate specificDate = LocalDate.of(2020, 12, 25);  // Specific date
            System.out.println(specificDate);  // Outputs 2020-12-25

            LocalTime localTime=LocalTime.now();
            System.out.println(localTime);
        }
    }


