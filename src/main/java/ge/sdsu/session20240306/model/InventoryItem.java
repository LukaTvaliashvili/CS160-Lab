package ge.sdsu.session20240306.model;

import ge.sdsu.session20240306.exceptions.NotUniqueIdException;

import java.util.List;
import java.util.Objects;

public class InventoryItem {

    private int id;
    private String name;
    private int quantity;

    public InventoryItem(){}
    public InventoryItem(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public boolean addInventoryItem(List<InventoryItem> list, InventoryItem item) throws NotUniqueIdException {
        if (list.contains(item)) {
            throw new NotUniqueIdException("Item " + item + " already exists in the inventory");
        }
        return list.add(item);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InventoryItem that = (InventoryItem) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, quantity);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}
