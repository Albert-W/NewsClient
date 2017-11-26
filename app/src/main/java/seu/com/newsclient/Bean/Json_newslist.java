package seu.com.newsclient.Bean;

import java.util.ArrayList;

/**
 * Created by 91991 on 2017/11/16.
 */

public class Json_newslist {
    ArrayList<NewsList> NewsList;
    int Pages;
    int ResultCode;
    String ResultMessage;

    public ArrayList<seu.com.newsclient.Bean.NewsList> getNewsList() {
        return NewsList;
    }

    public void setNewsList(ArrayList<seu.com.newsclient.Bean.NewsList> newsList) {
        NewsList = newsList;
    }

    public int getPages() {
        return Pages;
    }

    public void setPages(int pages) {
        Pages = pages;
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

    @Override
    public String toString() {
        return "Json_newslist{" +
                "NewsList=" + NewsList +
                ", Pages=" + Pages +
                ", ResultCode=" + ResultCode +
                ", ResultMessage='" + ResultMessage + '\'' +
                '}';
    }
}
