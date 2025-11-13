import java.util.ArrayList;

class ParkingSystem {
    ArrayList<Integer> i;

    public ParkingSystem(int big, int medium, int small) {
        i = new ArrayList<>();
        i.add(big);    
        i.add(medium); 
        i.add(small);
    }
    
    public boolean addCar(int carType) {
        int index = carType - 1; 
        
        
        if (i.get(index) > 0) {
            i.set(index, i.get(index) - 1);
            return true;
        }
        
        return false;
    }
}

