package ie.atu.productv3;

import ie.atu.productv2.Book;
import ie.atu.productv2.Software;

public class ProductDB  extends Software {

    public static Product getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data
    Product myProduct = null;

        if (productCode.equalsIgnoreCase("studios")) {
            myProduct = new ie.atu.productv3.Software();
            myProduct.setCode(productCode);
            myProduct.setDescription("Visual Studios");
            myProduct.setPrice(57.50);
            myProduct.setVersion("Microsoft 1.1");
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            myProduct = new ie.atu.productv3.Software();
            myProduct.setCode(productCode);
            myProduct.setDescription("Build Java apps");
            myProduct.setPrice(57.50);
            myProduct.setVersion("Eclipse Neon");
        } else if (productCode.equalsIgnoreCase("oracle")) {
            myProduct = new Product();
            myProduct.setCode(productCode);
            myProduct.setDescription("Latest MySQL");
            myProduct.setPrice(54.50);
            myProduct.setVersion("Oracle 3.0");
        } else if (productCode.equalsIgnoreCase("java")) {
            myProduct = new ie.atu.productv3.Book();
            myProduct.setCode(productCode);
            myProduct.setDescription("ATU Java Programming");
            myProduct.setPrice(57.50);
            myProduct.setAuthor("Joe Brown");
        } else if (productCode.equalsIgnoreCase("jsp")) {
            myProduct = new ie.atu.productv3.Book();
            myProduct.setCode(productCode);
            myProduct.setDescription("Java Servlets and JSP");
            myProduct.setPrice(57.50);
            myProduct.setAuthor("Mike White");
        } else if (productCode.equalsIgnoreCase("mysql")) {
            myProduct = new Product();
            myProduct.setCode(productCode);
            myProduct.setDescription("Lennon's MySQL");
            myProduct.setPrice(54.50);
            myProduct.setAuthor("Jim Lennon");
        }
    //We need all the book and software objects, but what kind of object do we return?
        return  myProduct;
    }
}

