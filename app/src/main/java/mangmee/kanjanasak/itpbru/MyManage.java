package mangmee.kanjanasak.itpbru;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by lap324-10 on 6/7/2016 AD.
 */
public class MyManage {

    private myOpenHelper myOpenHelper;
    private SQLiteDatabase sqLiteDatabase;

    public static final  String user_table = "userTABLE";
    public static  final  String column_id = "_id";
    public  static  final  String column_name="Name";
    public  static  final  String column_user = "User";
    public  static  final  String column_password = " Password";
    private  static final  String clumn_surename="Surename";


    public MyManage(Context context) {

        myOpenHelper = new myOpenHelper( context);
        sqLiteDatabase = myOpenHelper.getWritableDatabase();




    } //Constructor

    public long addNewUser(String strID,String strName,
                           String strSuername,
                           String strUser,
                           String strPassword){
        ContentValues contentValues = new ContentValues();
        contentValues.put(column_id,strID);
        contentValues.put(column_name, strName);
        contentValues.put(column_user,strUser);
        contentValues.put(clumn_surename,strSuername);
        contentValues.put(column_password,strPassword);
        return 0;
    }

} // Mane class
