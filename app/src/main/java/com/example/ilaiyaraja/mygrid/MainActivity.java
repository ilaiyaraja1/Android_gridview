package com.example.ilaiyaraja.mygrid;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    GridView gridView;
    Integer[] image={
            R.drawable.apps, R.drawable.facebook,
            R.drawable.camera, R.drawable.youtube,
            R.drawable.ic_baseline_check_circle_outline_24,
            R.drawable.chrome, R.drawable.food,
            R.drawable.costumer, R.drawable.google,
            R.drawable.donation, R.drawable.home,
            R.drawable.download, R.drawable.mx,
            R.drawable.email, R.drawable.meet,
            R.drawable.spotify, R.drawable.music,
            R.drawable.power, R.drawable.myw3schoolsimage,
            R.drawable.plus, R.drawable.netflix,
            R.drawable.pinterest, R.drawable.photography

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     gridView=findViewById(R.id.grid);

      gridView.setAdapter(new ImageAdapterGridView(this));
     gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
             //Toast.makeText(getApplicationContext(),"value"+(i)+"selected",Toast.LENGTH_LONG).show();
             if (i==0) {
                 Toast.makeText(getApplicationContext(), "google", Toast.LENGTH_LONG).show();
             }
         }
     });

    }
    private class ImageAdapterGridView extends BaseAdapter{
        private Context mContext;
        public ImageAdapterGridView(Context context) {
            mContext=context;

        }

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imageView;
            if(view==null){
                imageView=new ImageView(mContext);
                imageView.setLayoutParams(new RelativeLayout.LayoutParams(240,240));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(25,25,25,25);
            }else {
                imageView=(ImageView) view;
            }
            imageView.setImageResource(image[i]);
            return imageView;
        }
    }
}