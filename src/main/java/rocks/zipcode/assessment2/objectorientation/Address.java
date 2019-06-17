package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    String addressline1;
    String addressline2;
    String city;
    String state;
    String zipcode;

    public Address() {
        this.addressline1 = "";
        this.addressline2 = "";
        this.city = "";
        this.state = "";
        this.zipcode = "";

    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addressline1 = addressLine1;
        this.addressline2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressLine1() {
        return this.addressline1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressline1 = addressLine1;
    }

    public String getAddressLine2() {
        return this.addressline2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressline2 = addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


    @Override
    public String toString() {
        return "Address{addressLine1='"+this.addressline1+"', "+"addressLine2='"+this.addressline2+"', "+"city='"+this.city+"', "+"state='"+this.state+"', "+"zipcode='"+this.zipcode+"'}";
    }

    // @Override
    public boolean equals(Address o) {
        if(this.zipcode.equals(o.zipcode)){
            return true;
        } else return false;
    }
}
