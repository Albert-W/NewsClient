package seu.com.newsclient;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import seu.com.newsclient.Bean.Json_newslist;
import seu.com.newsclient.Bean.NewsList;

public class MainActivity extends Activity {
    private List<Image> imageList = new ArrayList<>();
    private List<News> newsList = new ArrayList<>();

    private void initNews(){
        //获取网络数据
        Json_newslist json_newslist = JsonUtil.parse(Constant.JSON_LIST,Json_newslist.class);

        for(int i =0;i<json_newslist.getNewsList().size();i++ ){
            NewsList ntemp = json_newslist.getNewsList().get(i);
            News one = new News(ntemp.getTitle(),ntemp.getAuthor(),ntemp.getPublishDate(),ntemp.getTitle(),R.drawable.news1+i%5,ntemp.getImageUrl());
            newsList.add(one);
        }
//        for(int i=0;i<2;i++){
//            News one = new News("title1","author1","time1","content1",R.drawable.news1);
//            newsList.add(one);
//            News two = new News("title2","author2","time2","content2",R.drawable.news2);
//            newsList.add(two);
//            News there = new News("title3","author3","time3","content3",R.drawable.news3);
//            newsList.add(there);
//            News four = new News("title4","author4","time4","content4",R.drawable.news4);
//            newsList.add(four);
//            News five = new News("title5","author5","time5","content5",R.drawable.news5);
//            newsList.add(five);
//        }
    }

    private void initImages(){
        for(int i=0;i<newsList.size();i++){
            Image temp = new Image(newsList.get(i).getTitle(),newsList.get(i).getImageId(),newsList.get(i).getImageUrl());
            imageList.add(temp);
        }
//        for(int i =0;i<10;i++){
//            Image one = new Image("one",R.drawable.one_pic);
//            imageList.add(one);
//            Image two = new Image("two",R.drawable.two_pic);
//            imageList.add(two);
//            Image three = new Image("three",R.drawable.three_pic);
//            imageList.add(three);
//        }
    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        initNews();
        initImages();
        //完成新闻图片栏（RecyclerView);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.my_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        GalleryAdapter adapter = new GalleryAdapter(this ,imageList);
        recyclerView.setAdapter(adapter);



        //完成标题栏点击；
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        final TextView textview = (TextView) findViewById(R.id.textView);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, textview.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        //做新闻列表
        NewsAdapter news_adapter = new NewsAdapter(
                MainActivity.this,R.layout.news_item,newsList);
        ListView listView = (ListView)findViewById(R.id.news_listview);
        listView.setAdapter(news_adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,WebViewActivity.class);
                startActivity(intent);
            }
        });

        //做新闻页面


    }
}
