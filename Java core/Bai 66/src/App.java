public class App {
    public static void main(String[] args) {
        Box<String, Integer> box1 = new Box<>("Long", 19);
        System.out.println(" - Ten: " + box1.getTen() + "\n - Tuoi: " + box1.getTuoi());

        Box<String, String> box2 = new Box<>("Long", "Muời Chín");
        System.out.println(" - Ten: " + box2.getTen() + "\n - Tuoi: " + box2.getTuoi());
        
        Box<String, Double> box3 = new Box<>("Long", 19.6);
        System.out.println(" - Ten: " + box3.getTen() + "\n - Tuoi: " + box3.getTuoi());
    }
}