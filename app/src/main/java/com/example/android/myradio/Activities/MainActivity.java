package com.example.android.myradio.Activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.android.myradio.Fragments.DetailsFragment;
import com.example.android.myradio.Fragments.MainFragment;
import com.example.android.myradio.R;
import com.example.android.myradio.model.Station;

public class MainActivity extends AppCompatActivity {

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    private static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }

    private static MainActivity mainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity.setMainActivity(this);

        FragmentManager fm= getSupportFragmentManager();
        MainFragment mainFragment=(MainFragment) fm.findFragmentById(R.id.container_main);

        if(mainFragment==null){
            mainFragment=MainFragment.newInstance("blah","kal");
            fm.beginTransaction().add(R.id.container_main,mainFragment).commit();
        }

    }

    public void loadDetailsScreen(Station selectedStation){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_main, new DetailsFragment())
                .addToBackStack(null)
                .commit();
    }
}
