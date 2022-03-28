import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog  implements Serializable {

    @JsonProperty("Catalog name")
    private String name;

    @JsonProperty("Catalog items")
    private List<Item> items = new ArrayList<>();

    public Catalog(String name) {
        this.name = name;
    }

    public Catalog() {
    }

    public void add(Item item){
        items.add(item);
    }

    public Item findById(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "name='" + name + '\'' +
                ", items=" + items +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
