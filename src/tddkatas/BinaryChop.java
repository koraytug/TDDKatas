package tddkatas;

import java.util.ArrayList;

public class BinaryChop {

    public int chop(int searchItem, ArrayList<Integer> items) {
        if (items.size() == 0)
            return -1;

        int index = containsNode(searchItem, 0, items.size() - 1, items);


        return index;
    }


    private int containsNode(int searchItem, int startIndex, int endIndex, ArrayList<Integer> items) {
        int middle = startIndex + ((endIndex - startIndex) / 2);

        if (endIndex < startIndex) {
            return -1;
        }

        if (searchItem == items.get(middle)) {
            return middle;
        } else if (searchItem < items.get(middle)) {
            return containsNode(searchItem, startIndex, middle - 1, items);
        } else {
            return containsNode(searchItem, middle + 1, endIndex, items);
        }

    }

   /*  class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void addItem(int value) {
        root = add(root, value);
    }

    private Node add(Node current, int value) {

        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = add(current.left, value);
        } else if (value > current.value) {
            current.right = add(current.right, value);
        }

        return current;
    }

    public boolean containsNode(int value) {
        return containsNode(root, value);
    }

    private boolean containsNode(Node current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.value) {
            return true;
        }

        return value < current.value
                ? containsNode(current.left, value)
                : containsNode(current.right, value);
    }*/


}
