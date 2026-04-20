package lld03.inheritanceandpolymorphism;

// For understanding deepCopy and shallow copy
public class Address {
    private String city;
    private String country;
    private String zip;

    public Address(String city, String country, String zip){
        this.city = city;
        this.country = country;
        this.zip = zip;
    }

    public Address(Address other){
        this.city = other.city;
        this.country = other.country;
        this.zip = other.zip;
    }

    public String getCity() {
        return city;
    }
    public String getCountry() {
        return country;
    }
    public String getZip() {
        return zip;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
}
