package phurua.it.mytravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DangNhapActivity extends AppCompatActivity {

    DataBaseHelper dataBaseHelper;
    EditText username, password;
    Button dangnhap , dangky;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        username = findViewById(R.id.editUser_dangnhap);
        password = findViewById(R.id.editPass_dangnhap);
        dangnhap = findViewById(R.id.buttonDangNhap);
        dangky = findViewById(R.id.buttonDangKy_dangnhap);

        username.getText().toString();
        password.getText().toString();

        // kết nối CSDL
        dataBaseHelper = new DataBaseHelper(this);

        dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(username.equals("")||password.equals(""))
                {
                    Toast.makeText(DangNhapActivity.this,"Vui lòng nhập thông tin",Toast.LENGTH_SHORT).show();
                }
                else{
                    Boolean checkuserpassword = dataBaseHelper.checkeduserpassword(username,password);
                    if(checkuserpassword==true){
                        Toast.makeText(DangNhapActivity.this,"Đăng nhập thành công",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),DSDiaDiemActivity.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(DangNhapActivity.this,"Đăng nhập thất bại",Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });
        dangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DangNhapActivity.this,DangkyActivity.class);
                startActivity(intent);
            }
        });
    }
    }
