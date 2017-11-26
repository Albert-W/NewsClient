package seu.com.newsclient.Bean;

/**
 * Created by 91991 on 2017/11/16.
 */

public class Json_NewsInfo {
    seu.com.newsclient.Bean.NewsInfo NewsInfo;
    int ResultCode;
    String ResultMessage;

    public seu.com.newsclient.Bean.NewsInfo getNewsInfo() {
        return NewsInfo;
    }

    public void setNewsInfo(seu.com.newsclient.Bean.NewsInfo newsInfo) {
        NewsInfo = newsInfo;
    }

    public int getResultCode() {
        return ResultCode;
    }

    public void setResultCode(int resultCode) {
        ResultCode = resultCode;
    }

    public String getResultMessage() {
        return ResultMessage;
    }

    public void setResultMessage(String resultMessage) {
        ResultMessage = resultMessage;
    }

    public Json_NewsInfo(seu.com.newsclient.Bean.NewsInfo newsInfo, int resultCode, String resultMessage) {
        NewsInfo = newsInfo;
        ResultCode = resultCode;
        ResultMessage = resultMessage;
    }

    @Override
    public String toString() {
        return "Json_NewsInfo{" +
                "NewsInfo=" + NewsInfo.getContent() +
                ", ResultCode=" + ResultCode +
                ", ResultMessage='" + ResultMessage + '\'' +
                '}';
    }
}
