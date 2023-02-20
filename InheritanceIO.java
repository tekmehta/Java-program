import java.io.*;
import java.util.*;
class ResidentialSociety {
    String societyName;
    String location;
    String secretaryName;
    
    public ResidentialSociety(String societyName, String location, String secretaryName) {
        this.societyName = societyName;
        this.location = location;
        this.secretaryName = secretaryName;
    }
    
    public void viewSocietyDetails() {
        System.out.println("Society Name: " + societyName);
        System.out.println("Location: " + location);
        System.out.println(" Secretary Name: " + secretaryName+"\n\n");
    }
}

class Building extends ResidentialSociety {
    String buildingName;
    int totalNumberOfApartments;
    List<Apartment > apartments=new ArrayList<>();  
    
    public Building(String societyName, String location, String secretaryName, String buildingName, int totalNumberOfApartments) {
        super(societyName, location, secretaryName);
        this.buildingName = buildingName;
        this.totalNumberOfApartments = totalNumberOfApartments;
        
    }
    
    public void viewBuildingDetails() {
        System.out.println("Building Name: " + buildingName);
        System.out.println("Number of Apartments: " + totalNumberOfApartments);
    }
    
    public void viewApartmentDetails() {
        System.out.println("Apartment Details:");
        for (int i = 0; i <apartments.size(); i++) {
            System.out.println("Apartment " + (i + 1) + ":");
            apartments.get(i).viewApartmentDetails();
          
        }
    }
}

class Apartment extends Building {
    int apartmentNumber;
    String ownerName;
    String electricMeterNumber;
    
    public Apartment(String societyName, String location, String secretaryName, String buildingName, int totalNumberOfApartments, int apartmentNumber, String ownerName, String electricMeterNumber) {
        super(societyName, location, secretaryName, buildingName, totalNumberOfApartments);
        this.apartmentNumber = apartmentNumber;
        this.ownerName = ownerName;
        this.electricMeterNumber = electricMeterNumber;
    }
    
    public void viewApartmentDetails() {
        System.out.println("Apartment Number: " + apartmentNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Electric Meter Number: " + electricMeterNumber+"\n\n");
    }
}

public class InheritanceIO{
    public static void main(String[] args) {
        ResidentialSociety society = new ResidentialSociety("Aditya Residential Society", "SuramPalem, East Godavari", "ACBESD");
        
        Building building1 = new Building("Madhuri", "Gollaprolu, East Godavari", "MDVS", "Building1", 10);
        Building building2 = new Building("Madhuri", "Gollaprolu, East Godavari", "MDVS", "Building2", 10);
        Building building3 = new Building("Madhuri", "Gollaprolu, East Godavari", "MDVS", "Building3", 10);
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("apartments.csv"));
            String line;
        
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int apartmentNumber = Integer.parseInt(data[0]);
                String buildingName = data[1];
                String ownerName = data[2];
                String electricMeterNumber = data[3];
                
                Building building = null;
                if (buildingName.equals("A")) {
                    building = building1;
                } else if (buildingName.equals("B")) {
                    building = building2;
                } else if (buildingName.equals("C")) {
                    building = building3;
                }
                
                Apartment apartment = new Apartment(society.societyName, society.location, society.secretaryName, buildingName, building.totalNumberOfApartments, apartmentNumber, ownerName, electricMeterNumber);
                building.apartments.add(apartment);
              
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
        
        System.out.println("Society Details:");
        society.viewSocietyDetails();
        System.out.println();
        
        System.out.println("Building1");
        building1.viewBuildingDetails();
        building1.viewApartmentDetails();
        System.out.println();
        
        System.out.println("Building2:");
        building2.viewBuildingDetails();
        building2.viewApartmentDetails();
        System.out.println();
        
        System.out.println("Building3:");
        building3.viewBuildingDetails();
        building3.viewApartmentDetails();
    }
}
