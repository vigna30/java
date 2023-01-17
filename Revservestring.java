public class Revservestring {
    public static void main(String args[]) {
      String source = "Hello";

for (String part : source.split(" ")) {
    System.out.print(new StringBuilder(part).reverse().toString());
    System.out.print(" ");
}
}
}
