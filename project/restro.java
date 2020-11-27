class restro {
    //    this is our restro class in which we provide the food service to all type of the hotel booked customers and this will be a completely different type of class which will not be inherited by the Hotel class
    int totalCost = 0;
    int totalItems = 0;
    int[] arr;

    restro() {
        arr = new int[5];
        for (int i = 1; i <= 4; i++) arr[i] = 0;
    }

    //return the services provided by the restro
    String getServices() {
        return "\n==========\n   Menu:  \n==========\n\n1.Sandwich\tRs.50\n2.Pasta\t\tRs.60\n3.Noodles\tRs.70\n4.Coke\t\tRs.30\n";
    }

    //method to order the food
    void order(int i) {
        switch (i) {
            case 1:
                System.out.println("Sandwich\tRs.50 added.");
                updateCost(i);
                arr[i] = arr[i] + 1;
                totalItems++;
                System.out.println("your total cost is: " + getTotalCost());
                break;
            case 2:
                System.out.println("Pasta\tRs.60 added.");
                updateCost(i);
                arr[i] = arr[i] + 1;
                totalItems++;
                System.out.println("Your total cost is: " + getTotalCost());
                break;
            case 3:
                System.out.println("Noodles\tRs.70 added.");
                updateCost(i);
                arr[i] = arr[i] + 1;
                totalItems++;
                System.out.println("Your total cost is: " + getTotalCost());
                break;
            case 4:
                System.out.println("Coke\tRs.30 added.");
                updateCost(i);
                arr[i] = arr[i] + 1;
                totalItems++;
                System.out.println("Your total cost is: " + getTotalCost());
                break;
            default:
                System.out.println("Please enter a valid food code.");
                break;
        }
    }

    //update the total cost according to the selected items
    void updateCost(int i) {
        switch (i) {
            case 1:
                totalCost += 50;
                break;
            case 2:
                totalCost += 60;
                break;
            case 3:
                totalCost += 70;
                break;
            case 4:
                totalCost += 30;
                break;
            default:
                break;
        }
    }

    int getTotalCost() {
        return totalCost;
    }

    //method to print the bill after ordering food from restro
    void printBill() {
        System.out.println(arr[1] + " Sandwich," + arr[1] + " * " + 50 + " = Rs " + 50 * arr[1]);
        System.out.println(arr[2] + " Pasta," + arr[2] + " * " + 60 + " = Rs " + 60 * arr[2]);
        System.out.println(arr[3] + " Noodles," + arr[3] + " * " + 70 + " = Rs " + 70 * arr[3]);
        System.out.println(arr[4] + " Coke," + arr[4] + " * " + 30 + " = Rs " + 30 * arr[4]);
        System.out.println(" ******** Total cost without gst: " + getTotalCost() + "Rs");
        float gstTotal = (float) ((0.18) * (getTotalCost()));
        System.out.println(" ******** Total cost with gst: " + "Rs " + (getTotalCost() + gstTotal));
    }

}