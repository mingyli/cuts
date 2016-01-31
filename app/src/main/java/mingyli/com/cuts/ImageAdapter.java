package mingyli.com.cuts;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * hardcoded image adapter to showcase the use of grid and gallery project 
 */
public class ImageAdapter extends BaseAdapter{

    private static LayoutInflater inflater = null;


    public static int[] images = {
            R.drawable.haircut0, R.drawable.haircut1,
            R.drawable.haircut2, R.drawable.haircut3,
            R.drawable.haircut4, R.drawable.haircut5,
            R.drawable.haircut6, R.drawable.haircut7,
    };


    public ImageAdapter(Activity act, String mode){
        inflater = (LayoutInflater) act.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return new Integer(images[position]);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null) {
            view = inflater.inflate(R.layout.each_image, null);
        }
        ImageView iv = (ImageView)view.findViewById(R.id.imageView);

        iv.setImageResource(images[position]);
        iv.setScaleType(ImageView.ScaleType.CENTER_CROP);

        return view;
    }

}
