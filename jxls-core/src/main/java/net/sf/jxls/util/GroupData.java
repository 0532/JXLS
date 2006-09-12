package net.sf.jxls.util;

import java.util.Collection;

/**
 * @author Leonid Vysochyn
 */
public class GroupData {
    Object item;
    Collection items;

    public GroupData(Object groupItem, Collection groupItems) {
        this.item = groupItem;
        this.items = groupItems;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public Collection getItems() {
        return items;
    }

    public void setItems(Collection items) {
        this.items = items;
    }
}
