package phurua.it.gioithieudiadiemdulichvn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterDiaDiem extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<DiaDiem> arrList;

    public AdapterDiaDiem(Context context, int layout, List<DiaDiem> arrList){
        this.context = context;
        this.layout = layout;
        this.arrList = arrList;

    }

    @Override
    public int getCount() {
        return arrList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout,null);

        DiaDiem diaDiem = arrList.get(position);
                // ánh xạ
        TextView ten = convertView.findViewById(R.id.txtProvince);
        ImageView hinh = convertView.findViewById(R.id.imageDiaDiem);
        TextView mota = convertView.findViewById(R.id.txtMota);

        ten.setText(diaDiem.getTendiadiem());
        hinh.setImageResource(diaDiem.getHinhanh());
        mota.setText(diaDiem.getMota());

        return convertView;
    }
}
