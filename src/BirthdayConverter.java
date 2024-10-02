import java.time.*;
import java.time.format.DateTimeFormatter;

public class BirthdayConverter {

    public static void main(String[] args) {

        // Your real birthday: October 2, 2006

        LocalDate myBirthday = LocalDate.of(2006, 10, 2);

        System.out.println("My Birthday (LocalDate): " + myBirthday);



        // Make a fake birthday (let's say January 1, 1990)

        LocalDate fakeBirthday = LocalDate.of(1990, 1, 1);

        System.out.println("Fake Birthday (LocalDate): " + fakeBirthday);



        // Define time zones: Default and Paris Time Zone

        ZoneId parisZone = ZoneId.of("Europe/Paris");

        ZoneId defaultZone = ZoneId.systemDefault(); // Default system zone



        // Convert both birthdays to Paris timezone at midnight

        ZonedDateTime myBirthdayInParis = myBirthday.atStartOfDay(defaultZone).withZoneSameInstant(parisZone);

        ZonedDateTime fakeBirthdayInParis = fakeBirthday.atStartOfDay(defaultZone).withZoneSameInstant(parisZone);



        // Format the date-time output in a readable format

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");



        // Print results for both birthdays in Paris timezone

        System.out.println("My Birthday in Paris Timezone: " + myBirthdayInParis.format(formatter));

        System.out.println("Fake Birthday in Paris Timezone: " + fakeBirthdayInParis.format(formatter));

    }

}

