package week8.country;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManageEastAsiaCountries {
    private ArrayList<EastAsiaCountries> cl = new ArrayList<>();

    private boolean checkInput(float area) {
        if (area <= 0) {
            System.out.println("Phai lon hon 0");
            return false;
        }
        return true;
    }

    public boolean addCountryInf(EastAsiaCountries country) {
        if (!checkInput(country.getTotalArea())){ 
            return false;        
        }
        cl.add(country);
        return true;
    }

    public void DisplayInfCountry() {
        if (cl.isEmpty()) {
            System.out.println("Khong co dat nuoc nao");
            return;
        }
        for (EastAsiaCountries country : cl) {
            country.display();
        }
    }

    public EastAsiaCountries[] searchByName(String name) {
        ArrayList<EastAsiaCountries> foundCountries = new ArrayList<>();
        if (cl.isEmpty()) {
            System.out.println("khong co");
            return new EastAsiaCountries[0];
        }
        for (EastAsiaCountries country : cl) {
            if (country.getCountryName().toLowerCase().contains(name.toLowerCase())) {
                foundCountries.add(country);
            }
        }
        if (foundCountries.isEmpty()) {
            System.out.println("No countries found");
            return new EastAsiaCountries[0];
        }
        return foundCountries.toArray(new EastAsiaCountries[0]);
    }

    public void sortByASCD() {
        if (cl.isEmpty()) {
            System.out.println("Khong co dat nuoc nao");
            return;
        }
        Collections.sort(cl, (a, b) -> a.getCountryName().compareTo(b.getCountryName()));
        System.out.println("Dat nuoc da sap xep theo thap toi cao");
        for (EastAsiaCountries country : cl) {
            country.display();
        }
    }

    public static void main(String[] args) {
        ManageEastAsiaCountries manager = new ManageEastAsiaCountries();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("1.nhap quoc gia");
            System.out.println("2.hien thi danh sach moi nhap");
            System.out.println("3.tim kiem quoc gia");
            System.out.println("4.hien thi danh sach duoc sap xep");
            System.out.println("5.thoat");
            System.out.println("lua chon");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            
            switch (choice) {
                case 1:
                    
                        System.out.println("Enter code ");
                        String code = scanner.nextLine();
                        System.out.println("Ten");
                        String name = scanner.nextLine();
                        System.out.println("Dien tich");
                        float area = scanner.nextFloat();
                        scanner.nextLine();  
                        System.out.println("Chon dia hinh");
                        String terrain = scanner.nextLine();

                        if (manager.addCountryInf(new EastAsiaCountries(code, name, area, terrain))) {
                            System.out.println("Nhap thanh cong");
                        }
                        else {
                            System.out.println("thong tin khong hop le");
                        }
                    
                    break;
                case 2:
                    manager.DisplayInfCountry();
                    break;
                case 3:
                    System.out.println("Nhap ten muon tim kiem");
                    String searchName = scanner.nextLine();
                    EastAsiaCountries[] result = manager.searchByName(searchName);
                    for (EastAsiaCountries country : result) {
                        country.display();
                    }
                    break;
                case 4:
                    manager.sortByASCD();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        scanner.close();
    }
}
