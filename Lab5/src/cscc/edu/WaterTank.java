package cscc.edu;

public class WaterTank {
    private int current, maxCapacity;

    public  WaterTank(int current, int maxCapacity) {
        this.current = current;
        this.maxCapacity = maxCapacity;

        if (this.current > this.maxCapacity) {
            this.current = this.getMaxCapacity();
        }
    }


    //Getters
    public int getCurrent(){
        return(current);
    }
    public int getMaxCapacity(){
        return(maxCapacity);
    }
    void add(int volume) {
        this.current += volume;

        if (this.current > this.maxCapacity) {
            this.current = this.maxCapacity;
        }
    }
    void drain(int volume) {
        this.current -= volume;

        if (this.current < 0){
            this.current = 0;
        }
    }
    void print(){
        System.out.println("The tank volume is "+this.current+" gallons");
    }
}



