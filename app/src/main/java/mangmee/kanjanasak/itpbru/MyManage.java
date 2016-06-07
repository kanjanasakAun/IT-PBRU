package mangmee.kanjanasak.itpbru;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by lap324-10 on 6/7/2016 AD.
 */
public class MyManage {

    private myOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;


    public MyManage(Context context) {

        myOpenHelper = new myOpenHelper( context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();




    } //Constructor

} // Mane class
