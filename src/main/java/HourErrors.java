public class HourErrors {
    public static void main(String[] args) {
        final int hour = 1;

        if ((hour >= 4) && (hour < 11)) {
            System.out.println(hour + " ч - Утро");
        } else if ((hour >= 11) && (hour < 16)) {
            System.out.println(hour + " ч - День");
        } else if ((hour >= 16) && (hour <= 23)) {
            System.out.println(hour + " ч - Вечер");
        } else if ((hour > 0) && (hour < 4)) {
            System.out.println(hour + " ч - Ночь");
        } else if (hour < 0) {
            System.out.println("Вы ввели не корректное число часов!Введите часы заново!");
        } else if (hour > 23) {
            System.out.println("Вы ввели не корректное число часов!Вернитель на планету Земля!");
        }
    }
}

