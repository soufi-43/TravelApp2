package comm.khkjh.travelapp.datasupplier;

import java.util.ArrayList;
import java.util.List;

import comm.khkjh.travelapp.model.Destination;

public class DestinationSupplier {
    public  static List<Destination> getDestination(){
        ArrayList<Destination> destinations =new ArrayList<>();
        destinations.add(new Destination(1,"egypt",
                "https://www.infographicdesignteam.com/blog/wp-content/uploads/2017/03/The_Egyptians_and_Infographics-770x360.jpg",
                PlacesSupplier.getPlaces()));
        destinations.add(new Destination(2,"iraq",
                "https://www.infographicdesignteam.com/blog/wp-content/uploads/2017/03/The_Egyptians_and_Infographics-770x360.jpg",
                PlacesSupplier.getPlaces()));



        return  destinations ;
    }
}
