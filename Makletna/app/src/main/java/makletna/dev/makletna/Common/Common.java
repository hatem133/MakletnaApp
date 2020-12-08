package makletna.dev.makletna.Common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import makletna.dev.makletna.Model.User;


public class Common {
    public static User currentUser;

    private static final String BASE_URL = "https://fcm.googleapis.com/";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static final  String UPDATE ="Modifier";


    public static final String USER_KEY="User";

    public static final String PWD_KEY="Password";


    public static boolean isConnectedToInternet(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if(connectivityManager != null)
        {
            NetworkInfo[] info = connectivityManager.getAllNetworkInfo();
            if(info != null)
            {
                for(int i=0;i<info.length;i++)
                {
                    if(info[i].getState()==NetworkInfo.State.CONNECTED)
                        return true;
                }
            }
        }
        return false;
    }
}
