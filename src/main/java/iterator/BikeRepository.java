package iterator;

public class BikeRepository {
    private String [] bikes;
    private int index;

    public BikeRepository(){
        bikes = new String[10];
        index = 0;
    }

    public void addBike(String bike){
        if(index == bikes.length){
            String[] largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
            largerBikes = null;
        }
        bikes[index] = bike;
        index++;
    }
}
