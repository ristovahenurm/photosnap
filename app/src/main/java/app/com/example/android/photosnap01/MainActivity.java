package app.com.example.android.photosnap01;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import app.com.example.android.photosnap01.R;

public class MainActivity extends ListActivity {

    String[] itemname ={
            "Kuusemetsa 22a",
            "Pikksilma 34/3",
            "Vabaduse puiestee põik 3a",
            "FireFox",
            "UC Browser",
            "Android Folder",
            "VLC Player",
            "Cold War",
            "Safari",
            "Camera",
            "Global",
            "FireFox",
            "UC Browser",
            "Android Folder",
            "VLC Player"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setListAdapter(new ArrayAdapter<String>(
                this, R.layout.activity_plan_list_view,
                R.id.firstLine, itemname));
    }
}
