package seu.com.newsclient;
import android.text.TextUtils;
import com.google.gson.Gson;

/**
 * Created by 91991 on 2017/11/16.
 */

public class JsonUtil {
    static Gson gson;
    public static <T> T parse(String content,Class<T>t){
        if(gson==null)gson = new Gson();
        if(TextUtils.isEmpty(content))return null;
        return gson.fromJson(content,t);
    }
}
