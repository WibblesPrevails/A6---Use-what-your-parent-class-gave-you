/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building{
  
  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(boolean hasDiningRoom, String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<String>(1);
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom() {
    return hasDiningRoom;
  }

  public int nResidents() {
    return residents.size();
  }

  public void moveIn(String name) {
    residents.add(name);
  }
  
  public String moveOut(String name) {
    if (residents.contains(name)) {
      residents.remove(residents.indexOf(name));
      return name;
    }
    else {
      System.out.println("There is no boarder of that name.");
      return "";
    }
  }

  public boolean isResident(String person) {
    return residents.contains(name);
  }

  public static void main(String[] args) {
    new House(false, "home", "905 Kennebec RD", 3);
  }

}