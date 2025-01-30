package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item); // x005.add(x001("마늘", 2000, 2))
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "items=" + items +
                '}';
    }
}
