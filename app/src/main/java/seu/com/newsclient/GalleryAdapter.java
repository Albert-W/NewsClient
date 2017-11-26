package seu.com.newsclient;


import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.io.IOException;
import java.io.InputStream;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;


/**
 * Created by 91991 on 2017/11/15.
 */

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder>
{
    //传入图片列表，和上下文context;
    private List<Image> mimageList;
    private Context mcontext;
    public GalleryAdapter(Context context    ,List<Image> imageList){
        mcontext = context;
        mimageList = imageList;
    }

    //向ViewHolder中传入每个item的view;
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView mImg;
        TextView mTxt;

        public ViewHolder(View itemView) {
            super(itemView);
            mImg = (ImageView) itemView.findViewById(R.id.imageView2);
            mTxt = (TextView) itemView.findViewById(R.id.textView2);
        }

    }


    //将布局文件传给holder;
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.picture_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        holder.mImg.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),WebViewActivity.class);
                view.getContext().startActivity(intent);
            }
        });


        return holder;
    }

    //将单项的资源文件载入holder中；
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Image image = mimageList.get(position);
//        holder.mImg.setImageResource(image.getImageId());
        Glide
                .with(mcontext)
                .load(image.getImageUrl())
                .into(holder.mImg);
//        holder.mImg.setImageBitmap(getBitMBitmap(image.getImageUrl()));
//        holder.mImg.setImageBitmap(getBitMBitmap("http://www.qq.com"));
        holder.mTxt.setText(image.getName());
    }

    public static Bitmap getBitMBitmap(String urlpath) {
        Bitmap map = null;
        Log.i("wyc", "Bitmap map = null;");
        try {
            URL url = new URL(urlpath);
            URLConnection conn = url.openConnection();
            Log.i("wyc", url.toString());
            //conn.setRequestMethod("GET");
            //conn.setConnectTimeout(8000);
            //conn.setReadTimeout(8000);
            //conn.connect();
//            conn.setRequestProperty("accept","*/*");
//            conn.setRequestProperty("connection","Keep-Alive");
//            conn.setRequestProperty("user-agent","Mozilla/4.0(compatible;MSIE 6.0;Windows NT 5.1; SV1)");
//            conn.connect();
            InputStream in;
            Log.i("wyc", "生成inputStream");
            in = conn.getInputStream();
            Log.i("wyc", "in = conn.getInputStream();");
            map = BitmapFactory.decodeStream(in);
            Log.i("wyc", "get the picture");
            // TODO Auto-generated catch block
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }


    @Override
    public int getItemCount() {
        return mimageList.size();
    }

}
