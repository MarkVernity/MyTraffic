package vernity.mark.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.PrivateKey;

public class DetailActivity extends AppCompatActivity {


    //explicit

    private TextView headTextView, detailTextView;
    private ImageView trafficImage;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Bind Widget
        bindWidget();

        // Show View
        showView();

    } // Main Method

    private void showView() {

        // Show Head
        String strHead = getIntent().getStringExtra("Head");
        headTextView.setText(strHead);

        // Show Image
        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        trafficImage.setImageResource(intImage);

        // Show Detail
        int intIndex = getIntent().getIntExtra("Index", 0);
        String[] strDetail = getResources().getStringArray(R.array.detail);
        detailTextView.setText(strDetail[intIndex]);

    }

    private void bindWidget() {

        headTextView = (TextView) findViewById(R.id.textView2);
        detailTextView = (TextView) findViewById(R.id.textView3);
        trafficImage = (ImageView) findViewById(R.id.imageView);


    }

} // Main Class
