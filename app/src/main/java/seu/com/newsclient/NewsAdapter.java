package seu.com.newsclient;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by 91991 on 2017/11/15.
 */

public class NewsAdapter extends ArrayAdapter<News>{
    private int resourceId;

    public NewsAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<News> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        News news = getItem(position);
        View view;
        class ViewHolder{
            ImageView newsImage;
            TextView newsTitle;
            TextView newsAuthor;
            TextView newsTime;

        }
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.newsImage = (ImageView)view.findViewById(R.id.news_image);
            viewHolder.newsTitle = (TextView)view.findViewById(R.id.news_title);
            viewHolder.newsAuthor = (TextView)view.findViewById(R.id.news_author);
            viewHolder.newsTime = (TextView)view.findViewById(R.id.news_time);
            view.setTag(viewHolder);
        }else {
            view = convertView;
            viewHolder= (ViewHolder)view.getTag();
        }
        //viewHolder.newsImage.setImageResource(R.drawable.news_item_icon);
        Glide
                .with(getContext())
                .load(news.getImageUrl())
                .into(viewHolder.newsImage);

        viewHolder.newsTitle.setText(news.getTitle());
        viewHolder.newsAuthor.setText(news.getAuthor());
        viewHolder.newsTime.setText(news.getTime());

        return view;
    }
}
