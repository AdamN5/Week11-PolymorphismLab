package ie.atu.productv4;

public class TV extends Product {

    private String manufacturer;
    private String screensize;

    public TV() {
        super();
        manufacturer = "";
        screensize = "";
        count++;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setScreenSize(String screensize) {
        this.screensize = screensize;
    }

    public String getScreenSize() {
        return screensize;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + manufacturer
                + "\nScreensize is: " + screensize;

    }
}
