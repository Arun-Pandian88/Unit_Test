class Battery {
    int Battery_Capacity;
    int Battery_Max_Capacity;

    {
        Battery_Max_Capacity = 1024;
    }

    public void Battery_Charge(int battery_Capacity, int Battery_Max_Capacity) {
        this.Battery_Capacity = battery_Capacity;
        this.Battery_Max_Capacity = Battery_Max_Capacity;
        if (Battery_Capacity <= Battery_Max_Capacity) {
            System.out.println("Eligible for the Battery Capacity");
        } else {
            System.out.println("not eligile for the Battery Capacity");
        }
    }
}

class Engine {
    int Engin_Speed;
    int Engin_Max_Speed = 200;

    public void Speed(int engin_Min_Speed, int engin_Max_Speed) {
        this.Engin_Max_Speed = engin_Max_Speed;
        this.Engin_Speed = engin_Min_Speed;
        if (Engin_Speed == engin_Max_Speed) {
            if (Engin_Max_Speed == Engin_Speed) {
                System.out.println("Speed is correct");
            } else {
                System.out.println("Speed is incorrect  ");
            }
        }
        if (Engin_Speed > Engin_Max_Speed) {
            System.out.println("Over the speed");
        } else {
            System.out.println("low speed");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Battery vehicle = new Battery();
        vehicle.Battery_Charge(1202, 1024);

        Engine vehicle1 = new Engine();
        vehicle1.Speed(122, 200);
    }
}
