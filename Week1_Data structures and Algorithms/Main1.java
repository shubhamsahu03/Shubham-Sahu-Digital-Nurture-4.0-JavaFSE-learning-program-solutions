public class Main1 {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Phone", "Electronics"),
            new Product(105, "Bag", "Accessories")
        };

        // Linear Search
        System.out.println("Linear Search:");
        Product result1 = SearchEngine.linearSearch(products, "Phone");
        System.out.println(result1 != null ? result1 : "Product not found");

        // Binary Search 
        SearchEngine.sortProducts(products);
        System.out.println("\nBinary Search:");
        Product result2 = SearchEngine.binarySearch(products, "Phone");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
