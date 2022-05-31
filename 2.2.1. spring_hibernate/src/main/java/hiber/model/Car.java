package hiber.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class Car {
    @OneToOne(mappedBy = "car")
    private User user;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String model;
    private int series;
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Car() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car " +
                "model = '" + model + '\'' +
                ", series = " + series;
    }
}
