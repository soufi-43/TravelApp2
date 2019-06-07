package comm.khkjh.travelapp.datasupplier;

import java.util.ArrayList;
import java.util.List;

import comm.khkjh.travelapp.R;
import comm.khkjh.travelapp.model.OnBoardingModel;

public class OnBoardingSupplier {

    public static List<OnBoardingModel> getOnBoardingObjects() {
        ArrayList<OnBoardingModel> objects = new ArrayList<OnBoardingModel>();
        objects.add(new OnBoardingModel(R.drawable.airplane, "easy planes", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam"));
        objects.add(new OnBoardingModel(R.drawable.bag, "ready your bags", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam"));
        objects.add(new OnBoardingModel(R.drawable.camera, "take pictures", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam"));
        objects.add(new OnBoardingModel(R.drawable.location, "nice locations", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam"));


        return objects;

    }

}
