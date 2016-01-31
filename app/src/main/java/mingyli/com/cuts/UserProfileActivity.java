package mingyli.com.cuts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ming on 1/31/2016.
 */
public class UserProfileActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userprofile);

        ImageView iv = (ImageView) findViewById(R.id.imageView2);
        iv.setImageResource(ImageAdapter.images[3]);
        iv.setScaleType(ImageView.ScaleType.CENTER_CROP);

        EditText name = (EditText) findViewById(R.id.nameText);
        EditText barber = (EditText) findViewById(R.id.barberNameText);
        EditText shampoo = (EditText) findViewById(R.id.shampooText);
        EditText tags = (EditText) findViewById(R.id.tagsText);

        Profile prof = new Profile();
        name.setText(prof.getName());
        barber.setText(prof.getBarber_name());
        shampoo.setText(prof.getShampoo_name());
        String temp = "";
        for(String s: prof.getTags_list())
            temp += s+" ";
        tags.setText(temp);
    }
}
