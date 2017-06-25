package com.example.discrollview;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
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
import com.ramotion.foldingcell.FoldingCell;

import java.util.HashMap;

import static android.R.id.message;
import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {

    private SliderLayout sliderLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ImageView img = (ImageView) findViewById(R.id.starterImage);
//        img.setBackgroundResource(R.drawable.progress_animation);
//        AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
//        frameAnimation.start();

        ImageButton facebook = (ImageButton) findViewById(R.id.facebookEsya);
        ImageButton instagram = (ImageButton) findViewById(R.id.instagramEsya);
        ImageButton twitter = (ImageButton) findViewById(R.id.twitterEsya);
        //ImageButton website = (ImageButton) findViewById(R.id.websiteEsya);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Uri uri = Uri.parse("https://www.facebook.com/EsyaIIITD/"); // missing 'http://' will cause crashed
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//                getOpenFacebookIntent(getApplicationContext());
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


        //ImageView navigate = (ImageView) findViewById(R.id.navigateEsya);
        Button navigate = (Button) findViewById(R.id.navigateEsya);

        //Button navigate = (Button) findViewById(R.id.navigateEsya);
        navigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q="+"IIIT Delhi");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);


            }
        });

        final FoldingCell fc = (FoldingCell) findViewById(R.id.folding_cell);
        // attach click listener to folding cell
        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc.toggle(false);
            }
        });

        final FoldingCell fc2 = (FoldingCell) findViewById(R.id.folding_cell2);
        // attach click listener to folding cell
        fc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc2.toggle(false);
            }
        });

        final FoldingCell fc3 = (FoldingCell) findViewById(R.id.folding_cell3);
        // attach click listener to folding cell
        fc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc3.toggle(false);
            }
        });

        final FoldingCell fc4 = (FoldingCell) findViewById(R.id.folding_cell4);
        // attach click listener to folding cell
        fc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc4.toggle(false);
            }
        });

        final FoldingCell fc5 = (FoldingCell) findViewById(R.id.folding_cell5);
        // attach click listener to folding cell
        fc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc5.toggle(false);
            }
        });


        final FoldingCell fc6 = (FoldingCell) findViewById(R.id.folding_cell6);
        // attach click listener to folding cell
        fc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc6.toggle(false);
            }
        });

//        sliderShow = (SliderLayout) findViewById(R.id.slider);
//        TextSliderView textSliderView1 = new TextSliderView(this);
//        textSliderView1
//                .description("Image 1")
//                .image("https://scontent.fdel1-1.fna.fbcdn.net/v/t1.0-9/18893217_1926482404043877_1443193016012393349_n.jpg?oh=0e314474e7d8de6f0e669d6e045d8a01&oe=59D17054");
//
//        sliderShow.addSlider(textSliderView1);
//        onStop();
//
//        TextSliderView textSliderView2 = new TextSliderView(this);
//        textSliderView2
//                .description("Image 2")
//                .image("https://scontent.fdel1-1.fna.fbcdn.net/v/t1.0-9/13934896_1492546327437489_2987325064525604867_n.jpg?oh=cb62dd6d5dca23b730bff042cbc3a30b&oe=59DF8F71");
//
//        sliderShow.addSlider(textSliderView2);
//        onStop();
//
//        TextSliderView textSliderView3 = new TextSliderView(this);
//        textSliderView3
//                .description("Image 3")
//                .image("https://scontent.fdel1-1.fna.fbcdn.net/v/t1.0-9/13935114_1487768377915284_7396714088998725695_n.png?oh=a4723bf4562be6d74913157719efe086&oe=59D461EC");
//
//        sliderShow.addSlider(textSliderView3);
//        onStop();

        TextView web = (TextView) findViewById(R.id.websiteEsya);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.esya.iiitd.edu.in")));
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