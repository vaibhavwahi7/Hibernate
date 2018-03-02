

import javax.persistence.Embeddable;



@Embeddable
public class Address {                       //Q10.
    @Override
    public String toString() {
        return "Address{}";
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    String streetNumber;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    String location;

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    String State;



}