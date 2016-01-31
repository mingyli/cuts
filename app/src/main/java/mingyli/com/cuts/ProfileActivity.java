package mingyli.com.cuts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;


public class ProfileActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        int pos = getIntent().getExtras().getInt("selectedIndex");

        Toast.makeText(ProfileActivity.this, pos+"", Toast.LENGTH_SHORT).show();

        ImageView iv = (ImageView) findViewById(R.id.imageView2);
        iv.setImageResource(ImageAdapter.images[pos]);
        iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
