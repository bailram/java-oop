package enumclass;

public class EnumClassApp {
    public static void main(String[] args) {
        System.out.println(Level.EASY.getDescription());

        System.out.println(Level.EASY.name());
        Level level = Level.valueOf("HARD"); // kalau inputnya salah jadi error, jadi kurang recommended
        System.out.println(level.name());
        System.out.println();
        System.out.println("List all level");
        Level[] levels = Level.values();
        for (var item :
                levels) {
            System.out.println(item.name());
        }
    }
}
