package VehicleTest;
import org.example.Car;
import org.example.Motorcycle;
import org.example.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    Проверить, что объект Car создается с 4-мя колесами.
    Проверить, что объект Motorcycle создается с 2-мя колесами.
    Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
 */

public class VehicleTest {
    private static Car car;
    private static Motorcycle motorcycle;

    @BeforeAll
    /*
    Создаем объекты для тестирования
     */
    public static void createObjectsForTesting(){
        car = new Car("some", "any",2001);
        motorcycle = new Motorcycle("some", "any", 2000);
    }

    /*
    Проверка, что Car является Vehicle
     */
    @Test
    public void carIsVehicle(){
        assertTrue (car instanceof Vehicle);
    }

    /*
    Проверить, что объект Car создается с 4-мя колесами.
     */
    @Test
    public void carHas4Wheels(){
        int result = car.getNumWheels();
        Assertions.assertEquals(4, result, "wheels number is wrong");
    }
    /*
    Проверить, что объект Motorcycle создается с 2-мя колесами.
     */
    @Test
    public void motorcycleHas2Wheels(){
        int result = motorcycle.getNumWheels();
        Assertions.assertEquals(2,result,"wheels number is wrong");
    }
    /*
    Проверить, что объект Car развивает скорость 60 в режиме тестового вождения
    (используя метод testDrive()).
     */
    @Test
    public void carSpeed(){
        car.testDrive();
        int result = car.getSpeed();
        Assertions.assertEquals(60, result,"speed is wrong");
    }

    /*
    Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения
    (используя метод testDrive())
     */
    @Test
    public void motorcycleSpeed(){
        motorcycle.testDrive();
        int result = motorcycle.getSpeed();
        Assertions.assertEquals(75, result,"speed is wrong");
    }

    /*
    Проверить, что в режиме парковки
    (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    машина останавливается (speed = 0).
     */
    @Test
    public void carStop(){
        car.testDrive();
        car.park();
        int result = car.getSpeed();
        Assertions.assertEquals(0, result,"car didn't stop");
    }
    /*
    Проверить, что в режиме парковки
    (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    мотоцикл останавливается (speed = 0).
     */
    @Test
    public void motorocycleStop(){
        motorcycle.testDrive();
        motorcycle.park();
        int result = motorcycle.getSpeed();
        Assertions.assertEquals(0,result,"motorcycle didn't stop");
    }
}
