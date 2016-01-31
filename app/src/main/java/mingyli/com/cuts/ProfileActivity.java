package mingyli.com.cuts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Created by Ming on 1/31/2016.
 */
public class ProfileActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//todo



        int pos = getIntent().getExtras().getInt("selectedIndex");

        Toast.makeText(ProfileActivity.this, pos+"", Toast.LENGTH_SHORT).show();
    }
}
