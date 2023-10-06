package Oct06;

import java.util.Calendar;

public class WeekEx {
    // Enum을 사용해보는 간단한 예제
    public static void main(String[] args) {

        Week today = null;

        Calendar cal  = Calendar.getInstance();

        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1: today = Week.SUNDAY; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            case 7: today = Week.SATURDAY;
        }

        System.out.println(today);

        if (today == Week.SUNDAY || today == Week.SATURDAY)
            System.out.println("주말입니다. 낮잠을 잡시다.");
        else
            System.out.println("주중입니다. 공부합시다.");

    }
}
