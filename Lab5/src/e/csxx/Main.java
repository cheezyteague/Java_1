package cscc.edu;

public class Main {
    public static void main(String[] args){
        WaterTank tank= new WaterTank(350,300);
        tank.print();
        tank.add(100);
        tank.drain(200);
        tank.print();
        tank.add(50);
        tank.drain(200);
        tank.print();
        tank.drain(50);
        tank.add(275);
        tank.drain(142);
        tank.print();

    }
}
