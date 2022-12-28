public class Main {
    public static void main(String[] args) {
        LinkedList currenListL1 = new LinkedList();
        LinkedList currenListL2 = new LinkedList();

        currenListL1.pushBack(2);
        currenListL1.pushBack(4);
        currenListL1.pushBack(3);

        currenListL2.pushBack(5);
        currenListL2.pushBack(6);
        currenListL2.pushBack(4);

//      243
//      564
//      708

        StringBuilder firstString = new StringBuilder();
        StringBuilder secondString = new StringBuilder();

        for(int i = 1; i <= currenListL1.getLenght(); i++){
            firstString.append(currenListL1.showByIndex(i));
        }

        for(int i = 1; i <= currenListL2.getLenght(); i++){
            secondString.append(currenListL2.showByIndex(i));
        }

        int total = Integer.parseInt(firstString.reverse().toString()) + Integer.parseInt(secondString.reverse().toString());
        System.out.println(total);


    }
}