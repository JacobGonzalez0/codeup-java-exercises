package src.movies;

public class Movie {
    private String name;
    private String category;

    Movie(String n, String c){
        this.name = n;
        this.category = c;
    }

    public String getName(){
        return name;
    }
    
    public String getCategory(){
        return category;
    }

    public void setName(String n){
        name = n;
    }

    public void setCategory(String n ){
        category = n;
    }
    
}
