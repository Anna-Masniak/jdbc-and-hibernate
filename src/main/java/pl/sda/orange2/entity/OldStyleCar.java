package pl.sda.orange2.entity;

public class OldStyleCar {
    private Long id;
    private String colour;
    private String brand;
    private String model;

    public OldStyleCar(Long id, String colour, String brand, String model) {
        this.id = id;
        this.colour = colour;
        this.brand = brand;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public OldStyleCar() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
