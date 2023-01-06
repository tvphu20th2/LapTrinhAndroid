package phurua.it.mytravel;

import android.content.Context;
import android.content.DialogInterface;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DSDiaDiemActivity extends AppCompatActivity {
    ArrayList<DiaDiem> arrayDiaDiem;
    DiaDiemAdapter adapterDiaDiem;
    ListView lv;
    Button btnAdd, btnUpdate,  btnSearch;
    EditText editText;
    Context context;
    int vitri=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsdia_diem);




        // ánh xạ

        btnSearch= findViewById(R.id.buttonSearch);
        editText = findViewById(R.id.editTextTenDiaDiem);

        lv=findViewById(R.id.lvDiaDiem);

        arrayDiaDiem = new ArrayList<>();// tạo mảng rỗng

        arrayDiaDiem.add(new DiaDiem("Đà Lạt","Ẩn mình trong Tây Nguyên, Đà Lạt đóng vai trò là người anh em mát mẻ hơn so với các điểm đến bên bờ biển của Việt Nam.",R.drawable.da_lat));
        arrayDiaDiem.add(new DiaDiem("Côn Đảo","Côn Đảo, một hòn đảo xinh đẹp nhất Việt Nam, là điểm đến lý tưởng cho những ai muốn khám phá vẻ đẹp hoang sơ.",R.drawable.con_dao));
        arrayDiaDiem.add(new DiaDiem("Chợ Nổi Cái Răng","Với tên gọi vừa hay vừa lạ đã là một niềm thích thú cho nhiều người tò mò rằng vì sao chợ lại có tên là Cái Răng",R.drawable.cho_noi_cai_rang));
        arrayDiaDiem.add(new DiaDiem("Cầu Vàng - Đà Nẵng","Nhìn từ xa, cầu Vàng trong giống như đôi tay của thần núi đang hỗ trợ mọi người đến vườn Thiên Thai.",R.drawable.cau_vang));
        arrayDiaDiem.add(new DiaDiem("Khu du lịch Đại Nam","Khu du lịch Đại Nam - nơi vọng ngưỡng tâm linh và tôn vinh tinh hoa dân tộc trải dài qua 4.000 năm văn hiến của  Việt Nam. ",R.drawable.dai_nam));
        arrayDiaDiem.add(new DiaDiem("Đảo Phú Quốc","Phú Quốc, thiên đường nhiệt đới nằm trong Vịnh Thái Lan, là hòn đảo lớn nhất của Việt Nam nằm ở phía Tây Nam thuộc tỉnh Kiên Giang",R.drawable.dao_phu_quoc));
        arrayDiaDiem.add(new DiaDiem("Hồ Gươm","Hồ Hoàn Kiếm (hay còn gọi là Hồ Gươm) là trái tim của Hà Nội. cơn mưa lá vàng và những giọt mưa phùn lất phất bay của mùa đông.",R.drawable.ho_guom_1661248781));
        arrayDiaDiem.add(new DiaDiem("Hội an","Phố cổ Hội An là một thành phố nổi tiếng của tỉnh Quảng Nam, một phố cổ giữ được gần như nguyên vẹn với hơn 1000 di tích kiến trúc từ phố xá, nhà cửa,...",R.drawable.hoi_an));
        arrayDiaDiem.add(new DiaDiem("Vũng Tàu","Cách trung tâm thành phố Hồ Chí Minh chỉ khoảng 3 tiếng lái xe, với đường bờ biển trải dài 20km.",R.drawable.vung_tau_1661248679));
        arrayDiaDiem.add(new DiaDiem("Miếu bà chúa xứ Núi sam","Châu Đốc, một địa danh gắn liền với sự linh thiêng với thế phong thủy tiền tam giang.",R.drawable.mieubachuaxu_nuisam));

        adapterDiaDiem = new DiaDiemAdapter(this,R.layout.activity_detail_dia_diem, arrayDiaDiem);
        lv.setAdapter((ListAdapter) adapterDiaDiem);




        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        lv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // sự kiện xóa
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(context);
                dialog.setTitle("Xác nhận");
                dialog.setMessage("Bạn có đồng ý xóa không ?");
                dialog.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        arrayDiaDiem.remove(position);
                        adapterDiaDiem.notifyDataSetChanged();
                    }
                });
                dialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = dialog.create();
                alertDialog.show();
                return false;
            }
        });

    }
}