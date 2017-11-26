package seu.com.newsclient;

/**
 * Created by 91991 on 2017/11/15.
 */

public class News {
    private String title;
    private String author;
    private String time;
    private String content;
    private int imageId;
    private String ImageUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public News(String title, String author, String time, String content, int imageId, String imageUrl) {
        this.title = title;
        this.author = author;
        this.time = time;
        this.content = content;
        this.imageId = imageId;
        ImageUrl = imageUrl;
    }
}
