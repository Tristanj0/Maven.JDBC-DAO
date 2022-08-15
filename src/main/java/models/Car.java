package models;

public class Car {
    private Integer id;
    private String model;
    private String make;
    private Integer vin;

    public Car(String model, String make, Integer vin) {
        this.model = model;
        this.make = make;
        this.vin = vin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Integer getVin() {
        return vin;
    }

    public void setVin(Integer vin) {
        this.vin = vin;
    }
}
