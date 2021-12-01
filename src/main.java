public class main {
    public static void main(String[] args) {
        int [] name = new int []{5, 10, 15, 20, 25};
        int tmp = name[0];
        name [0] = name[4];



        System.out.println(name.length + " " + name [0] + " " + name [2] );
    }
}
