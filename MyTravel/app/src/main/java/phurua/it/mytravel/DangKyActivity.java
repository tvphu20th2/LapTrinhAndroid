package phurua.it.mytravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DangkyActivity extends AppCompatActivity {

    EditText username,password,confimpass,email;
    Button dangky;
    DataBaseHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangky);

        username = findViewById(R.id.editUser_dangky);
        password = findViewById(R.id.editPass_dangky);
        confimpass = findViewById(R.id.editConfimPassword);
        email = findViewById(R.id.editEmail);
        dangky = findViewById(R.id.buttonDangKy);
        DB = new  DataBaseHelper(this);

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
                                Toast.makeText(DangkyActivity.this,"Đăng ký thành công",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(DangkyActivity.this,DangNhapActivity.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(DangkyActivity.this,"Đăng ký thất bại",Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }
            }

        });
    }
    }
