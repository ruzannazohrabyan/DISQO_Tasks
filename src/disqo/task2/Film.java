package disqo.task2;

public class Film {
    private String title;
    private int rating;

    public Film(String name, int number){
        title = name;
        rating = number;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "\"" + getTitle() + "\"" +  " Rating: " + getRating();
    }
}
