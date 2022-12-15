package phurua.it.hienthidiadiemdulich;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<DiaDiem> diaDiemArrayList= new ArrayList<DiaDiem>();
   // GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv =  findViewById(R.id.list_diadiem);

        diaDiemArrayList.add((new DiaDiem("Hà Tiên",104.44569,10.38210)));




        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,diaDiemArrayList);
        lv.setAdapter(adapter);

        lv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View arg1, int arg2, long arg3) {

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("diadiem", diaDiemArrayList.get(arg2));

                intent.putExtra("data", bundle);
                startActivity(intent);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });

    }

    /* Tạo Marker

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in LongXuyen and move the camera
        LatLng LX = new LatLng(10.377534112776233, 105.41731301614516);
        mMap.addMarker(new MarkerOptions().position(LX).title("Marker in Long Xuyên"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LX));
    }*/
}