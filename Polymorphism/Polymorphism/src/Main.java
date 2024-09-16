import java.util.Scanner;

import com.ship.Ship;
import com.cargoship.CargoShip;
import com.cruiseship.CruiseShip;

public class Main {
    public static void main(String[] args) {

        Ship[] shipArray = new Ship[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < shipArray.length; i++) {
            System.out.println("Pick ship (" + (i + 1) + ") type: 1=Ship, 2=CruiseShip, 3=CargoShip");
            int shipType = scanner.nextInt();
            Ship ship = null;

            switch (shipType) {
                case 1:
                    ship = new Ship("Generic Ship", "2000");
                    shipArray[i] = ship;
                    break;
                case 2:
                    ship = new CruiseShip("Queen Mary", "1936", 100);
                    shipArray[i] = ship;
                    break;
                case 3:
                    ship = new CargoShip("Ever Given", "2021", 50000);
                    shipArray[i] = ship;
                    break;
                default:
                    System.out.println("Invalid ship type");
            }
            shipArray[i] = ship;
        }

        for (Ship arrayShip : shipArray) {
            arrayShip.print();
            System.out.println("----------------");
        }
    }

}