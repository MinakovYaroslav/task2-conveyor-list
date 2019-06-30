public class Main {

    public static void main(String[] args) {

        //Create list
        ConveyorList list = new ConveyorList(10);

        //Print list
        System.out.println(list.toString());

        //Fill list
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        //Print
        System.out.println(list.toString());

        //Add next element
        list.add(10);

        //Print result
        System.out.println(list.toString());
    }
}
