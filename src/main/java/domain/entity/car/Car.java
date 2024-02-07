package domain.entity.car;

import domain.entity.car.vo.CarName;
import domain.entity.car.vo.Position;

public class Car {

    private static final int MIN_VALUE = 4;

    private final Position position;
    private final CarName name;

    public Car(String name) {
        this(name, 0);
    }

    private Car(String name, int position) {
        this.name = new CarName(name);
        this.position = new Position(position);
    }


    public String getName() {
        return name.getValue();
    }

    public int getPosition() {
        return position.getValue();
    }

    public void move(int randomValue) {
        if (randomValue >= MIN_VALUE) {
            position.increase();
        }
    }
}