package phurua.it.hienthidiadiemdulich;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    ImageView imageProvice;
    TextView tvTen;
    Button food, travel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        DiaDiem diaDiem = (DiaDiem) bundle.getSerializable("diadiem");

        tvTen = findViewById(R.id.txtDiadiem);
        tvTen.setText(diaDiem.getTendiadiem());
        food = findViewById(R.id.btnFood);
        travel = findViewById(R.id.btnTravel);
        imageProvice= findViewById(R.id.imgProvince);

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent amthuc = new Intent(DetailActivity.this,AmThucActivity.class);
                startActivity(amthuc);
            }
        });

        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dulich = new Intent(DetailActivity.this, DuLichActivity.class);
                startActivity(dulich);
            }
        });





        //wv.getSettings().setJavaScriptEnabled(true);
        //wv.loadData("<iframe width='100%' height='100%' frameborder='0' style='border:0' src='https://www.google.com/maps/embed/v1/place?key=AIzaSyCi5fy1hSfq-UmzgLG6dINJkndeY4gHKt0&zoom=10&maptype=satellite&q="+diaDiem.getTendiadiem()+"'></iframe>","text/html", "UTF-8");

    }
}