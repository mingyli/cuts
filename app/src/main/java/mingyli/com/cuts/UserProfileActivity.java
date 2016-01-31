package mingyli.com.cuts;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;


public class UserProfileActivity extends Activity {
    ImageView iv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userprofile);

        iv = (ImageView) findViewById(R.id.imageView2);
        iv.setImageResource(R.drawable.takephoto);
        iv.setScaleType(ImageView.ScaleType.CENTER_CROP);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(takePictureIntent, 1);

                }
            }
        });

        EditText name = (EditText) findViewById(R.id.nameText);
        EditText barber = (EditText) findViewById(R.id.barberNameText);
        EditText shampoo = (EditText) findViewById(R.id.shampooText);
        EditText tags = (EditText) findViewById(R.id.tagsText);

        name.setText("Your Name");
        barber.setText("Barber's Name");
        shampoo.setText("Your Shampoo");
        tags.setText("#mullet #perm #wig");
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            iv.setImageBitmap(imageBitmap);
        }
    }

}
