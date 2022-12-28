public class LinkedList {
    private class Node{
        int value;
        Node next;

        Node(int currentValue){
            value = currentValue;
            next = null;
        }

        Node( ) {
        }
    }

    private Node head = new Node();

    void pushFront(int currentValue){
        Node newNode = new Node(currentValue);

        if(head.next != null){
            newNode.next = head.next;
        }
        head.next = newNode;
    }

    void pushBack(int currentValue){
        Node newNode = new Node(currentValue);
        Node currentNode = head;

        while (currentNode.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    int showTail(){
        Node currentNode = head;

        while (currentNode.next != null){
            currentNode = currentNode.next;
        }

        return currentNode.value;
    }

    int getLenght(){
        Node currentNode = head;
        int counter = 0;
        while (currentNode.next != null){
            currentNode = currentNode.next;
            counter++;

        }

        return counter;
    }


    int showByIndex(int index){
        Node currentNode = head;
        int counter = 0;
        while (currentNode.next != null && index != counter){
            currentNode = currentNode.next;
            counter++;
        }

        return currentNode.value;
    }


}
