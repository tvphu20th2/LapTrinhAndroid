package phurua.it.mytravel;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DiaDiemAdapter extends ArrayAdapter<DiaDiem> {
    int resource;
    ArrayList<DiaDiem> array;

    TextView tvTenDiaDiem;
    TextView tvMota;
    ImageView ivHinh;

    Activity context;
    DiaDiem diadiem;

    public DiaDiemAdapter(Activity context, int diadiem_layout, ArrayList<DiaDiem> diaDiemList) {
        super(context, R.layout.activity_dsdia_diem);
        this.context=context;
        this.array = diaDiemList;
        this.resource = diadiem_layout;
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(R.layout.diadiem_layout, null);


        diadiem = array.get(position);
        if (diadiem != null) {

            tvTenDiaDiem = (TextView) row.findViewById(R.id.txtTenDiaDiem);
            tvMota = (TextView) row.findViewById(R.id.txtMoTa);
            ivHinh = (ImageView) row.findViewById(R.id.imageViewDiaDiem);


            tvTenDiaDiem.setText(diadiem.getTendiadiem());
            tvMota.setText(diadiem.getMota() + "");
            ivHinh.setImageResource(diadiem.getHinhanh());

        }
        return row;
    }}
