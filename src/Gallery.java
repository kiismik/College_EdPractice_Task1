import java.util.ArrayList;
import java.util.List;

class Gallery {
    private List<Picture> pictures;
    private String name;
    private String article;
    private static final java.util.Map<String, Gallery> instances = new java.util.HashMap<>();


    private Gallery(String name) {
        this.name = name;
        this.article = "Default Article";
        this.pictures = new ArrayList<>();
    }


    public static Gallery getInstance(String name) {
        return instances.computeIfAbsent(name, Gallery::new);
    }


    public boolean addPicture(Picture picture) {
        if (!pictures.contains(picture)) {
            pictures.add(picture);
            return true;
        }
        return false;
    }


    public boolean removePicture(Picture picture) {
        return pictures.remove(picture);
    }


    public String describePicture(Picture picture) {
        if (pictures.contains(picture)) {
            return picture.toString();
        }
        return "Такої картини немає в галереї.";
    }


    public Picture getPicture(String name) {
        for (Picture picture : pictures) {
            if (picture.getName().equals(name)) {
                return picture;
            }
        }
        return null;
    }


    public List<Picture> getPictures() {
        return new ArrayList<>(pictures);
    }


    public long getPictureCount() {
        return pictures.size();
    }


    public String getName() {
        return name;
    }


    public String getArticle() {
        return article;
    }
}
