package phurua.it.mytravel;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;

public class DataBaseHelper extends SQLiteOpenHelper {


    public DataBaseHelper(Context context) {
        super(context, "login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create Table users(username TEXT primary key, password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int oldVersion, int newVersion) {
        MyDB.execSQL("drop Table if exists users");
    }

    public Boolean insertData(EditText username, EditText password)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", String.valueOf(username));
        contentValues.put("password", String.valueOf(password));
        long result = MyDB.insert("users",null,contentValues);
        if(result==1)
            return false;
        else
            return true;
    }
    public Boolean checkedusername(String username){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from users where username = ? ",new String[] {username});
        if(cursor.getCount() > 0)
            return false;
        else
            return true;
    }
    public Boolean checkeduserpassword(EditText username, EditText password){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from users where username = ? and password = ?",new String[] {String.valueOf(username)});
        if(cursor.getCount() > 0)
            return false;
        else
            return true;
    }
}
