import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarArrayList {




    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setRegNum(123);
        c1.setModel("Toyota");

        Car c2 = new Car();
        c2.setRegNum(234);
        c2.setModel("Jaguar");

        Car c3 = new Car();
        c3.setRegNum(345);
        c3.setModel("Ferrari");

        Car c4 = new Car();
        c4.setRegNum(456);
        c4.setModel("Honda");

        List carsWithSameModel = new ArrayList();
        carsWithSameModel.add(c1);
        carsWithSameModel.add(c2);
        carsWithSameModel.add(c3);
        carsWithSameModel.add(c4);

        System.out.println("The Items in a List are "+carsWithSameModel.size());


        Set nonsportscar = new HashSet();
        nonsportscar.add(c1);
        nonsportscar.add(c2);
        nonsportscar.add(c3);
        nonsportscar.add(c4);

        System.out.println("The Items ina Set is  "+nonsportscar.size());

    }


}