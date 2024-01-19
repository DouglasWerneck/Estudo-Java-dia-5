public class Main {

    public static void main(String[] args) {
        productList("Laranja", 15.20);
        productList("Banana", 17.50);
    }

    public static void productList(String productName, Double productValue){
        System.out.println(productName + " - " + productValue);
    }
}