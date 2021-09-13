/*
Some new cashiers started to work at your restaurant.

They are good at taking orders, but they don't know how to capitalize words, or use a space bar!

All the orders they create look something like this:

"milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"

The kitchen staff are threatening to quit, because of how difficult it is to read the orders.

Their preference is to get the orders as a nice clean string with spaces and capitals like so:

"Burger Fries Chicken Pizza Pizza Pizza Sandwich Milkshake Milkshake Coke"

The kitchen staff expect the items to be in the same order as they appear in the menu.

The menu items are fairly simple, there is no overlap in the names of the items:

1. Burger
2. Fries
3. Chicken
4. Pizza
5. Sandwich
6. Onionrings
7. Milkshake
8. Coke
*/

public class Solution {
    public static String getOrder(String input) {
        String resp = "";
        String[] items = { "burger", "fries", "chicken", "pizza", "sandwich", "onionrings", "milkshake", "coke" };
        String repeated = input;
        for (String item : items) {
            if (input.contains(item)) {
                int count = 0;
                while (repeated.indexOf(item) > -1) {
                    repeated = repeated.substring(repeated.indexOf(item) + item.length(), repeated.length());
                    count++;
                    System.out.println(item + count);
                }
                for (int i = 0; i <= count; i++) {
                    resp = resp.concat(item.substring(0, 1).toUpperCase() + item.substring(1) + " ");
                }
            }
        }
        System.out.println(resp);
        return resp;
    }
}