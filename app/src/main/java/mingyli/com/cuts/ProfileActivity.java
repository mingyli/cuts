package mingyli.com.cuts;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Ming on 1/31/2016.
 */
public class ProfileActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        int pos = getIntent().getExtras().getInt("selectedIndex");

        Toast.makeText(ProfileActivity.this, pos+"", Toast.LENGTH_SHORT).show();

        ImageView iv = (ImageView) findViewById(R.id.imageView2);
        iv.setImageResource(ImageAdapter.images[pos]);
//        iv.setImageResource(Resources.getSystem().getIdentifier("haircut" + pos, "drawable", "com.mingyli"));
        iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
