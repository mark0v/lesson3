package vehicle;


public class Car {
     String brand = "Volvo";
     int weight = 1000;
     int power = 150;



    public Car(){
        getBrand(brand);
        getWeight(weight);
        getPower(power);
    }
    void setBrand(String brand){

        this.brand = brand;
    }

    void getBrand(String brand){
        System.out.println("The brand is: " + brand);
    }

    void setWeight(int weight){
        this.weight = weight;
    }

    void getWeight(int weight){
        System.out.println("Vehicle weight: " + weight);
    }

    void setPower(int power){ this.power = power;
    }

    void getPower(int power){
        System.out.println("The rower: " + power);
    }

}
