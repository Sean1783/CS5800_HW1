import com.baseemployee.BaseEmployee;
import com.commissionemployee.CommissionEmployee;
import com.salariedemployee.SalariedEmployee;
import com.hourlyemployee.HourlyEmployee;

public class Main {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployeeJones = new SalariedEmployee(
                "Joe",
                "Jones",
                "111-11-1111",
                2500);
        salariedEmployeeJones.print();

        HourlyEmployee hourlyEmployeeSmith = new HourlyEmployee(
                "Stephanie",
                "Smith",
                "222-22-2222",
                25,
                32);
        hourlyEmployeeSmith.print();

        HourlyEmployee hourlyEmployeeQuinn = new HourlyEmployee(
                "Mary",
                "Quinn",
                "333-33-3333",
                19,
                47);
        hourlyEmployeeQuinn.print();

        CommissionEmployee commissionEmployeeDior = new CommissionEmployee(
                "Nicole",
                "Dior",
                "444-44-4444",
                .15,
                50000);
        commissionEmployeeDior.print();

        SalariedEmployee salariedEmployeeChanel = new SalariedEmployee(
                "Renwa",
                "Chanel",
                "555-55-5555",
                1700);
        salariedEmployeeChanel.print();

        BaseEmployee baseEmployeeDavenport = new BaseEmployee(
                "Mike",
                "Davenport",
                "666-66-6666",
                95000);
        baseEmployeeDavenport.print();

        CommissionEmployee commissionEmployeeVaziri = new CommissionEmployee(
                "Mahnaz",
                "Vaziri",
                "777-77-7777",
                .22,
                40000);
        commissionEmployeeVaziri.print();
    }
}