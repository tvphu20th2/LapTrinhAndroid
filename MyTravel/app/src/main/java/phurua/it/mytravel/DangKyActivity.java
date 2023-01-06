package phurua.it.mytravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DangKyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);

        EditText username = findViewById(R.id.editUser_dangky);
        EditText password = findViewById(R.id.editPass_dangky);
        EditText confimpass = findViewById(R.id.editConfimPassword);
        EditText email = findViewById(R.id.editEmail);
        Button dangky = findViewById(R.id.buttonDangKy);
        DataBaseHelper DB = new  DataBaseHelper(this);

        dangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.equals("")||password.equals("")||confimpass.equals("")||email.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Không được bỏ trống",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(password.equals(confimpass)){
                        Boolean checkuser = DB.checkedusername(String.valueOf(username));
                        if(checkuser==false){
                            Boolean insert = DB.insertData(username,password);
                            if(insert==true){
                                Toast.makeText(getApplicationContext(),"Đăng ký thành công",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),DangNhapActivity.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(getApplicationContext(),"Đăng ký thất bại",Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }
            }

        });
    }
}