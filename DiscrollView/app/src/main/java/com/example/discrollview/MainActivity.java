package com.example.discrollview;

import android.animation.ObjectAnimator;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.google.android.gms.maps.model.Marker;
import com.ramotion.foldingcell.FoldingCell;

import java.util.HashMap;

import static android.R.id.message;
import static java.security.AccessController.getContext;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener
{

    private SliderLayout sliderLayout;
    private SliderLayout sponsorsSliderLayout;
    private Button events;
    private Button djNight;
    private Button comedyNight;
    private Button workshops;
    private Button intiatives;
    private ImageView unfoldedDJ;
    private ImageView foldedDJ;
    final int foldingCellArr[]=new int[6];

    private final LatLng LOCATION_IIITD = new LatLng(28.5459495, 77.2688703);
    private GoogleMap map;
    private Marker myMarker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();

        myMarker= map.addMarker(new MarkerOptions().position(LOCATION_IIITD).title("Find us here! IIITD"));

        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_IIITD, 15);
        map.animateCamera(update);

        map.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener()
        {

            @Override
            public boolean onMarkerClick(Marker arg0) {
                if(arg0.getTitle().equals("Find us here! IIITD"))
                {// if marker source is clicked
                     Toast.makeText(MainActivity.this, arg0.getTitle(), Toast.LENGTH_SHORT).show();// display toast
                     Uri gmmIntentUri = Uri.parse("google.navigation:q=" + "IIIT Delhi");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);
                }
                return true;
            }

        });



        unfoldedDJ=(ImageView) findViewById(R.id.unfoldedDJ);
        foldedDJ=(ImageView) findViewById(R.id.iconDJ);
        unfoldedDJ.getLayoutParams().height = Resources.getSystem().getDisplayMetrics().widthPixels;
        unfoldedDJ.getLayoutParams().width = Resources.getSystem().getDisplayMetrics().widthPixels;
        unfoldedDJ.requestLayout();

        foldedDJ.getLayoutParams().width = Resources.getSystem().getDisplayMetrics().widthPixels;
        foldedDJ.getLayoutParams().height= (int) Resources.getSystem().getDisplayMetrics().widthPixels/3;
        foldedDJ.requestLayout();

        foldingCellArr[0]=R.id.folding_cell;
        foldingCellArr[1]=R.id.folding_cell2;
        foldingCellArr[2]=R.id.folding_cell3;
        foldingCellArr[3]=R.id.folding_cell4;
        foldingCellArr[4]=R.id.folding_cell5;
        foldingCellArr[5]=R.id.folding_cell6;

        ImageButton facebook = (ImageButton) findViewById(R.id.facebookEsya);
        ImageButton instagram = (ImageButton) findViewById(R.id.instagramEsya);
        ImageButton twitter = (ImageButton) findViewById(R.id.twitterEsya);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/Fe9qooYPLQd"));
                    startActivity(intent);
                } catch(Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/EsyaIIITD")));
                }
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://instagram.com/_u/esya_iiitd");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/esya_iiitd")));
                }
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?screen_name=" + "esyaiiitd")));
                }catch (Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/#!/" + "esyaiiitd")));
                }
            }
        });

        ImageButton email = (ImageButton) findViewById(R.id.emailEsya);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","esya@iiitd.ac.in", null));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Query");
                intent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });


//        Button navigate = (Button) findViewById(R.id.navigateEsya);
//
//        navigate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Uri gmmIntentUri = Uri.parse("google.navigation:q="+"IIIT Delhi");
//                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//                mapIntent.setPackage("com.google.android.apps.maps");
//                startActivity(mapIntent);
//
//
//            }
//        });

        TextView web = (TextView) findViewById(R.id.websiteEsya);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.esya.iiitd.ac.in")));
            }
        });

        final FoldingCell fc = (FoldingCell) findViewById(R.id.folding_cell);
        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUnfolder(R.id.folding_cell);
                fc.toggle(false);
            }
        });

        final FoldingCell fc2 = (FoldingCell) findViewById(R.id.folding_cell2);
        // attach click listener to folding cell
        fc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUnfolder(R.id.folding_cell2);
                fc2.toggle(false);
            }
        });

        final FoldingCell fc3 = (FoldingCell) findViewById(R.id.folding_cell3);
        // attach click listener to folding cell
        fc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUnfolder(R.id.folding_cell3);
                fc3.toggle(false);
            }
        });

        final FoldingCell fc4 = (FoldingCell) findViewById(R.id.folding_cell4);
        // attach click listener to folding cell
        fc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUnfolder(R.id.folding_cell4);
                fc4.toggle(false);
            }
        });

        final FoldingCell fc5 = (FoldingCell) findViewById(R.id.folding_cell5);
        // attach click listener to folding cell
        fc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUnfolder(R.id.folding_cell5);
                fc5.toggle(false);
            }
        });


        final FoldingCell fc6 = (FoldingCell) findViewById(R.id.folding_cell6);
        // attach click listener to folding cell
        fc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUnfolder(R.id.folding_cell6);
                fc6.toggle(false);
            }
        });


        sliderLayout = (SliderLayout) findViewById(R.id.slider);
        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("Image 1", R.drawable.esya01);
        file_maps.put("Image 2", R.drawable.esya02);
        file_maps.put("Image 3", R.drawable.esya03);
        file_maps.put("Image 4", R.drawable.esya04);
        for(String name : file_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(MainActivity.this);
            textSliderView

                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);


            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra", name);
            sliderLayout.addSlider(textSliderView);

        }
        sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        sliderLayout.setPresetTransformer(SliderLayout.Transformer.Accordion);
        sliderLayout.setCustomAnimation(new DescriptionAnimation());
        sliderLayout.setDuration(1250);
        sliderLayout.addOnPageChangeListener(this);


        sponsorsSliderLayout=(SliderLayout) findViewById(R.id.sponsors);
        HashMap<String,Integer> sponsor_maps = new HashMap<String, Integer>();
        sponsor_maps.put("Image 1", R.drawable.esya01);
        sponsor_maps.put("Image 2", R.drawable.esya02);
        sponsor_maps.put("Image 3", R.drawable.esya03);
        sponsor_maps.put("Image 4", R.drawable.esya04);
        for(String name : file_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(MainActivity.this);
            textSliderView

                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);


            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra", name);
            sponsorsSliderLayout.addSlider(textSliderView);

        }

        sponsorsSliderLayout.setPresetTransformer(SliderLayout.Transformer.Default);
        sponsorsSliderLayout.setCustomAnimation(new DescriptionAnimation());
        sponsorsSliderLayout.setDuration(2000);
        sponsorsSliderLayout.addOnPageChangeListener(this);


        events=(Button) findViewById(R.id.events);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventsIntent= new Intent(MainActivity.this, EventsMainActivity.class);
                startActivity(eventsIntent);
            }
        });

        djNight=(Button) findViewById(R.id.djNight);
        djNight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent djIntent= new Intent(MainActivity.this, DjNight.class);
                startActivity(djIntent);
            }
        });

        comedyNight=(Button) findViewById(R.id.comedyNight);
        comedyNight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    public void checkUnfolder(int unfolderID)
    {
        for(int i=0;i<6;i++)
        {
            FoldingCell fc=(FoldingCell) findViewById(foldingCellArr[i]);
            if(fc.isUnfolded())
            {
                fc.toggle(false);
            }
        }
    }


    @Override
    protected void onStop(){
        sliderLayout.stopAutoCycle();
        super.onStop();
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

        Toast.makeText(this,slider.getBundle().get("extra") + "",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

    @Override
    public void onPageSelected(int position) {

        Log.d("Slider Demo", "Page Changed: " + position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {}


}