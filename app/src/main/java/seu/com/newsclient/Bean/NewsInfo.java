package seu.com.newsclient.Bean;

/**
 * Created by 91991 on 2017/11/16.
 */

public class NewsInfo {
    String Title;
    String Abstract;
    String Content;
    String Author;
    String PublishDate;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public NewsInfo(String title, String content, String author, String publishDate) {
        Title = title;
        Content = content;
        Author = author;
        PublishDate = publishDate;
    }

    @Override
    public String toString() {
        return "NewsInfo{" +
                "Title='" + Title + '\'' +
                ", Content='" + Content + '\'' +
                ", Author='" + Author + '\'' +
                ", PublishDate='" + PublishDate + '\'' +
                '}';
    }
}
