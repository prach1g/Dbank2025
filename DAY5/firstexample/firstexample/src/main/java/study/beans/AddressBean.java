package study.beans;

public class AddressBean {
    private String area, city, pin;

    public AddressBean() {}
    public AddressBean(String area, String city, String pin) {
        this.area = area;
        this.city = city;
        this.pin = pin;
    }



    public String getArea() { return area; }
    public void setArea(String area) {
            this.area = area;
    }
    public String getCity() {return city;}
    public void setCity(String city) {
        this.city = city;
    }
    public String getPin() {return pin;}
    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return area+","+city+","+pin;
    }
}
