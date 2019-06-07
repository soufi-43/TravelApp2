package comm.khkjh.travelapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

public class DeciderActivity extends Activity {

    Intent intent ;
    protected static  String MyPREFERENCES = "comm.khkjh.SHARED_PREF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_decider);
        prepareProperties() ;
        finish();
    }

    private void prepareProperties() {
        SharedPreferences sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        boolean seen = sharedpreferences.getBoolean("seen",false);
        if (seen){
            intent =new Intent(this,HomeScreen.class) ;

        }else{
            intent = new Intent(this,OnBoardingScreen.class) ;


        }
        startActivity(intent);








    }
}
