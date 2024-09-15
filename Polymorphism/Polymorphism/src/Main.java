import com.ship.Ship;
import com.cargoship.CargoShip;
import com.cruiseship.CruiseShip;

public class Main {
    public static void main(String[] args) {

        Ship[] shipArray = {
                new Ship("Generic Ship", "2000"),
                new CruiseShip("Queen Mary", "1936", 100),
                new CargoShip("Ever Given", "2021", 50000)
        };

        for (Ship arrayShip : shipArray) {
            arrayShip.print();
            System.out.println("----------------");
        }
    }
}