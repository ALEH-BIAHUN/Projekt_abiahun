public class Main {
    public static void main(String[] args) {

        //todo Тут увольняем айтишников

        int[]numberOfItSpecialists = new int[100];

        for (int i = 2; i <= numberOfItSpecialists.length; i = i+2) {
            if (i%2 == 0)
            System.out.println("Уволен айтишник с id " + i );
        }
    }
}