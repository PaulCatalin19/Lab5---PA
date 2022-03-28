import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Book.class, name = "book"),
        @JsonSubTypes.Type(value = Article.class, name = "article")
})

 public abstract class Item implements Serializable{


        private String id;
        private String title;
        private String location;
        private String author;
        private int year;
        private String description;

     private Map<String,Object> tags= new HashMap<>();

     public Item() {
     }

     public Item(String id, String title, String location, int year, String author, String description){
         this.id = id;
         this.title = title;
         this.location = location;
         this.year = year;
         this.author = author;
         this.description = description;
     }

     public Item(String id, String title, String location,int year, String author) {
         this.id = id;
         this.title = title;
         this.location = location;
         this.year = year;
         this.author = author;
     }

     public void addTag(String key, Object obj) {
            tags.put(key, obj);
        }

     public String getId() {
            return id;
        }

     public void setId(String id) {
            this.id = id;
        }

     public Map<String, Object> getTags() {
            return tags;
        }


 }

