package mangmee.kanjanasak.itpbru;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Explicit
    private  MyManage myManage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myManage = new MyManage(this);

        deleteAllSQLite();
    }   //Main Method

    private  void  deleteAllSite(){
        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE,null)
                sqLiteDatabase.delete(MyManage.user_table,null,null)
    }


    public void clickSignUpMain(View view) {
   startActivity(new Intent(MainActivity.this, SignUpActivity.class));
    }
}  //Main Class คลาสหลัก
