public class Terning {
    public static void main(String[] args) {
        int eyes = (int)(Math.random()*6+1);
        System.out.print("Du kaster en almindelig 6-sidet terning... ");

        switch (eyes){
            case 1: System.out.println("og det er en 1'er."); break;
            case 2: System.out.println("og det er en 2'er."); break;
            case 3: System.out.println("og det er en 3'er."); break;
            case 4: System.out.println("og det er en 4'er."); break;
            case 5: System.out.println("og det er en 5'er."); break;
            case 6: System.out.println("og det er en 6'er."); break;

        }
    }
}
