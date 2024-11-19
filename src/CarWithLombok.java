import lombok.Data;


@Data public class CarWithLombok {
  private String model;
  private String brand;
  private int year;
  private int price;
  private String color;
  private int quantity;

  public CarWithLombok(String model, String brand, int year, int price, String color, int quantity) {
    this.model = model;
    this.brand = brand;
    this.year = year;
    this.price = price;
    this.color = color;
    this.quantity = quantity;
  }
}


class CarDemoWithLombok{
  public static void main(String[] args) {
    CarWithLombok CarWithLombok1 = new CarWithLombok("GLE","Mercedes",2020,350_000,"white",5);
    CarWithLombok CarWithLombok2 = new CarWithLombok("GLC","Mercedes",2023,200_000,"silver",3);
    System.out.println(CarWithLombok1);
    System.out.println(CarWithLombok2);
    System.out.println(CarWithLombok1.getColor());
    int year = CarWithLombok1.getYear();
    CarWithLombok1.setColor("black");
    System.out.println("Are these objects equal? " + CarWithLombok1.equals(CarWithLombok2));
    System.out.println("The HashCode of this object is: " + CarWithLombok2.hashCode());
    System.out.println("The HashCode of this object is: " + CarWithLombok1.hashCode());
  }
}



