package program;
import java.util.*;
public class Main {
    public static void main(String[] args){

        Controller controller = new Controller();
        int option = 1;
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("***********************************************************************");
        System.out.println("***********************************************************************");
        System.out.println("**                                                                   **");
        System.out.println("**   WELCOME TO CAR/CUSTOMER MANAGEMENT AND CAR RENTAL SYSTEM        **");
        System.out.println("**                                                                   **");
        System.out.println("***********************************************************************");
        System.out.println("***********************************************************************");
        System.out.println();
            do {
                try{
                    if(controller.getToken() == null){
                        controller.login();
                    }else{
                        System.out.println("\nAvailable Options");
                        System.out.println("-----------------");

                        System.out.println("\nMANAGE CARS\n");

                        System.out.println("  1. Add a new car for sale");
                        System.out.println("  2. Add a new car for rent");
                        System.out.println("  3. Display available cars for sale");
                        System.out.println("  4. Display available cars for rent");
                        System.out.println("  5. Display rented cars");
                        System.out.println("  6. Display sold cars ");
                        System.out.println("  7. Rent car");
                        System.out.println("  8. Buy car");
                        System.out.println("  9. Return Rented Car");
                        System.out.println("  10. Delete a car for sale");
                        System.out.println("  11. Delete a car for rent");

                        System.out.println("\nMANAGE CUSTOMERS\n");

                        System.out.println("  12. Add a new customer");
                        System.out.println("  13. View all customers");
                        System.out.println("  14. Remove customer from system");

                        System.out.println("\nMANAGE EMPLOYEES\n");

                        System.out.println("  15. Add a new Employee");
                        System.out.println("  16. View all Employees");
                        System.out.println("  17. Remove Employee from system");
                        System.out.println(" ");
                        System.out.println("  18. Logout");
                        System.out.println("  0. Terminate/Exit System / log out");

                        System.out.println();

                        System.out.print("Choose a command option: ");
                        option = input.nextInt();
                        if(option == 1)
                            controller.addNewCarForSale();
                        else if(option == 2)
                            controller.addNewCarForRent();
                        else if(option == 3)
                            controller.displayAvilableCarsForSale();
                        else if(option == 4)
                            controller.displayAvilableCarsForRent();
                        else if(option == 5)
                            controller.displayRentedCars();
                        else if(option == 6)
                            controller.displaySoldCars();
                        else if(option == 7)
                            controller.rentCar();
                        else if(option == 8)
                            controller.buyCar();
                        else if(option == 9)
                            controller.returnRentedCar();
                        else if(option == 10)
                            controller.deleteCarForSale();
                        else if(option == 11)
                            controller.deleteCarForRent();
                        else if(option == 12)
                            controller.addNewCustomer();
                        else if(option == 13)
                            controller.displayCustomers();
                        else if(option == 14)
                            controller.deleteCustomer();
                        else if(option == 15)
                            controller.addEmployee();
                        else if(option == 16)
                            controller.displayEmployees();
                        else if(option == 17)
                            controller.removeEmployee();
                        else if(option == 18)
                            controller.logout();
                        else if(option != 0)
                            System.out.println("Invalid input");

                    }
                }catch (InputMismatchException err){
                    System.out.println("Invalid input");
                    input.next();
                }
            }while(option != 0);
    }
}