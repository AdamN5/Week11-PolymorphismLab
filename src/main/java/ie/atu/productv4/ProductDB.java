package ie.atu.productv4;

public class ProductDB {

    public static Product getProduct(String productCode) {

    Product myProduct = null;
    Software mySoftware = null;
    Book myBook = null;
    TV myTV = null;
    Music myMusic = null;
        if (productCode.equalsIgnoreCase("studios")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct= mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct= mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct= mySoftware;
        } else if (productCode.equalsIgnoreCase("java")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct= myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct= myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct= myBook;
        }
        else if (productCode.equalsIgnoreCase("Bravia")) {
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Sony Bravia TV");
            myTV.setPrice(945);
            myTV.setManufacturer("Sony");
            myTV.setScreenSize("44 inch");
            myProduct= myTV;
        }
        else if (productCode.equalsIgnoreCase("monitor")) {
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Dell PC monitor");
            myTV.setPrice(240);
            myTV.setManufacturer("Dell");
            myTV.setScreenSize("12 inch");
            myProduct = myTV;
        }
        else if (productCode.equalsIgnoreCase("PINK")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setPrice(5);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Columbia Group");
            myProduct = myMusic;
        }
        else if (productCode.equalsIgnoreCase("Jackals")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Jackals cant be bothered to dream");
            myMusic.setPrice(5);
            myMusic.setArtist("Refused");
            myMusic.setLabel("Epitaph Records");
            myProduct = myMusic;
        }
        return  myProduct;
    }
}

