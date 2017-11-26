package seu.com.newsclient;

/**
 * Created by 91991 on 2017/11/15.
 */

public class Image {
    private String name;
    private int imageId;
    private String imageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Image(String name, int imageId, String imageUrl) {
        this.name = name;
        this.imageId = imageId;
        this.imageUrl = imageUrl;
    }
}
