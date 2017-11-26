package seu.com.newsclient.Bean;

/**
 * Created by 91991 on 2017/11/16.
 */

public class NewsList {
    String NewsId;
    String Title;
    String ImageUrl;
    String PublishDate;
    String Author;

    public String getNewsId() {
        return NewsId;
    }

    public void setNewsId(String newsId) {
        NewsId = newsId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return "NewsList{" +
                "NewsId='" + NewsId + '\'' +
                ", Title='" + Title + '\'' +
                ", ImageUrl='" + ImageUrl + '\'' +
                ", PublishDate='" + PublishDate + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }
}
