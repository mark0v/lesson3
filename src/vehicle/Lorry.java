package vehicle;

public class Lorry extends Car{
    int capacity = 3000;
    int power = 300;
    String brand = "Caterpillar";
    int weight = 2000;

    public Lorry(){
        getBrand(brand);
        getWeight(weight);
        getPower(power);
        getCapacity(capacity);
    }


    public void getCapacity(int capacity) {
        System.out.println("Vehicle capacity: " + this.capacity);
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void setPower(int power){
        this.power = power;
    }

    void setBrand(String brand){
        this.brand = brand;
    }

    void setWeight(int weight){
        this.weight = weight;
    }

}
