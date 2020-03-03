import java.util.Scanner;
import java.util.ArrayList;

/**
 * User
 */
class User {
    boolean isPriv;

    User(boolean isPriv) {
        this.isPriv = isPriv;
    }

    boolean isprivilaged() {
        return isPriv;
    }
}

/**
 * Ratecalculator
 */
abstract class Ratecalculator {
    double calculateRate(InventoryItem i) {
        return i.unitprice;
    }
}

/**
 * UsualRateCalc
 */
class UsualRateCalc extends Ratecalculator {

    double calculateRate(InventoryItem i) {
        return super.calculateRate(i);
    }
}

/**
 * OfferRateCalc
 */
class OfferRateCalc extends Ratecalculator {

    double calculateRate(InventoryItem i) {
        return Math.max(i.unitprice - i.unitprice * i.offerrate, 0);
    }
}

/**
 * InventoryItem
 */
class InventoryItem {
    int inventroyId, avilableUnits, unitprice, offerrate;
    String inventroyName;
    Ratecalculator ratecalculator;
    double calcPrice()
    {
        return ratecalculator.calculateRate(this);
    }
}

/**
 * InventoryManagement
 */
class InventoryManagement {
    ArrayList<InventoryItem> list = new ArrayList<InventoryItem>();

    void addItem(InventoryItem i) {
        list.add(i);
    }

    void showList() {
        System.out.println("ItemId\n" + "Item Name");
        for (int k = 0; k < list.size(); k++) {
            System.out.println(list.get(k).inventroyId);
            System.out.println(list.get(k).inventroyName);

        }
        System.out.println("Available Units");
        for (int k = 0; k < list.size(); k++) {

            System.out.println(list.get(k).avilableUnits);
        }
        System.out.println("unit price");
        for (int k = 0; k < list.size(); k++) {

            System.out.println(list.get(k).unitprice);

        }

    }

    void modifyItem(InventoryItem i) {

    }

    InventoryItem findItem(InventoryItem i) {
        for (InventoryItem inventoryItem : list) {
            if (i.inventroyId == inventoryItem.inventroyId && i.inventroyName.equals(inventoryItem.inventroyName)) {
                if (i.avilableUnits <= inventoryItem.avilableUnits) {
                    return inventoryItem;
                }
                return null;
            }
        }
        return null;
    }

    boolean canPurchase(InventoryItem i) {
        for (InventoryItem inventoryItem : list) {
            if (i.inventroyId == inventoryItem.inventroyId && i.inventroyName.equals(inventoryItem.inventroyName)) {
                if (i.avilableUnits <= inventoryItem.avilableUnits) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    void finishShopping(InventoryManagement shopList, User u) {
        double amount = 0;
        for (InventoryItem shoppingItem : shopList.list) {
                InventoryItem i = findItem(shoppingItem);
                i.avilableUnits -= shoppingItem.avilableUnits;
                amount += shoppingItem.calcPrice();
        }
        if(u.isprivilaged())
            amount = amount - amount*0.1;
        System.out.println("Total is " + amount);
    }
}

/**
 * CODE3
 */
public class CODE3 {

    public static void main(String[] args) {

        Scanner in = new java.util.Scanner(System.in);
        InventoryManagement I = new InventoryManagement();
        while (true) {
            System.out.println("1. Inventory Management");
            System.out.println("2 Invoice Generation");
            System.out.println("3 exit");
            int i = in.nextInt(), j;
            switch (i) {
            case 1:

                while (true) {
                    System.out.println("1 Add New Item");
                    System.out.println("2 Display Item");
                    System.out.println("3 exit");
                    j = in.nextInt();
                    if (j == 1) {
                        InventoryItem item = new InventoryItem();

                        System.out.print("Inventory Id ");
                        item.inventroyId = in.nextInt();

                        in.nextLine();
                        System.out.print("Inventory Name ");
                        item.inventroyName = in.nextLine();

                        System.out.print("Available Units ");
                        item.avilableUnits = in.nextInt();

                        System.out.print(" Unit Price ");
                        item.unitprice = in.nextInt();

                        System.out.print("Offerrate ");
                        item.offerrate = in.nextInt();

                        if (item.offerrate > 0) {
                            item.ratecalculator = new OfferRateCalc();
                        } else
                            item.ratecalculator = new UsualRateCalc();

                        I.addItem(item);

                        System.out.println("New Inventory Added!!");
                    } else if (j == 2) {
                        I.showList();
                    } else if (j == 3) {
                        break;
                    }
                }

                break;
            case 2:
                InventoryManagement shoppingList = new InventoryManagement();

                while (true) {
                    System.out.println("1 Add New Item toShoppingCart");
                    System.out.println("2 Finish Shopping");
                    j = in.nextInt();
                    if (j == 1) {
                        InventoryItem item = new InventoryItem();

                        System.out.print("Inventory Id ");
                        item.inventroyId = in.nextInt();

                        in.nextLine();
                        System.out.print("Inventory Name ");
                        item.inventroyName = in.nextLine();

                        System.out.print("desired Units ");
                        item.avilableUnits = in.nextInt();

                        if (I.canPurchase(item)) {
                            System.out.println("Item Added to shoping List!!");
                            shoppingList.addItem(item);
                        } else
                            System.out.println("Item Not Added to shoping List!!");

                    } else if (j == 2) {
                        System.out.println("are you a privilaged user");
                        boolean b = in.nextBoolean();
                        I.finishShopping(shoppingList, new User(b));
                        break;
                    }
                }

                break;
            case 3:
                System.exit(0);
                break;

            default:
                break;
            }
        }
    }
}