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

    public String setName(String n){
        name = n;
    }

    public String setCategory(String n ){
        category = n;
    }
    
}
