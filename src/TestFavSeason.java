public class TestFavSeason {
    public static void main(String[] args) {
        Seasons fav = Seasons.SPRING;

        System.out.println("Любимое время года: " + fav);
        System.out.println("Описание: " + fav.getDescription());

        printLove(fav);

        System.out.println("Все времена года:");
        for (Seasons s : Seasons.values()) {
            System.out.println(s.toString() + ", " + s.getDescription());
        }

    }
    public static void printLove(Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
            case SPRING:
                System.out.println("Я люблю весну!");
                break;
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень!");
                break;
        }
    }
}
