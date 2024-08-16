package ObserverPattern.StoreExample;

import static ObserverPattern.StoreExample.Event.*;

public class StoreDemo {

    public static void main(String[] args) {

        // We see the benefit of Polymorphism below!

        Store store = new Store();
        store.getService().subscribe(NEW_ITEM, new EmailMsgListener("geekific@like.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("geekific@like.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("geekific@subs.com"));
        store.getService().subscribe(NEW_ITEM, new MobileAppListener("GeekificLnS"));

        store.newItemPromotion();

        System.out.println("==========================================");

        System.out.println("==========================================");

        store.getService().unsubscribe(SALE, new EmailMsgListener("geekific@like.com"));
    }

}
