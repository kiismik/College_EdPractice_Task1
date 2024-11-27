public class Main {
    public static void main(String[] args) {
        Gallery gallery = Gallery.getInstance("Лувр");

        Picture pic1 = new Picture("Мона Ліза", (short) 1503, "Леонардо да Вінчі");
        Picture pic2 = new Picture("Відплиття на острів Кіферу", (short) 1717, "Антуана Ватто");
        Picture pic3 = new Picture("Пліт Медузи", (short) 1819, "Теодора Жеріко");

        gallery.addPicture(pic1);
        gallery.addPicture(pic2);
        gallery.addPicture(pic3);

        System.out.println("Назва галереї: " + gallery.getName());
        System.out.println("Article: " + gallery.getArticle());
        System.out.println("Кількість картин: " + gallery.getPictureCount());

        for (Picture picture : gallery.getPictures()) {
            System.out.println(gallery.describePicture(picture));
        }

        gallery.removePicture(pic2);
        System.out.println("Кількість картин після видалення: " + gallery.getPictureCount());
    }
}