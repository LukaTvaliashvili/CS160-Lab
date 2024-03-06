package ge.sdsu.session20240306;

import ge.sdsu.session20240306.exceptions.NotUniqueIdException;
import ge.sdsu.session20240306.model.InventoryItem;

import java.util.ArrayList;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {

        List<InventoryItem> inventory = new ArrayList<>();
        inventory.add(new InventoryItem(1, "Table", 2));

        InventoryItem inventoryManager = new InventoryItem();
        try {
            inventoryManager.addInventoryItem(inventory, new InventoryItem(1, "Chair", 3));
        }catch (NotUniqueIdException e){
            System.out.println(e.getMessage());
        }
    }
}
