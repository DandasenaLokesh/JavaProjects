package JavaProjects.ProjectClasses.LinkedList;

public class SumOfLinkedList {
//    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//    You may assume the two numbers do not contain any leading zero, except the number 0 itself.\
//    Input: l1 = [2,4,3], l2 = [5,6,4]
//    Output: [7,0,8]
//    Explanation: 342 + 465 = 807.

    public static void sumOf2LinkesList(Node list1, Node list2){
        Node newList = new Node(0);// note this is acting as an referance head like cary =0 and whenever we change the current this also saves the values
        Node current = newList;
        int cary = 0;
        while (list1 != null || list2 != null) {
            int num1 = 0, num2 = 0, sum;
            if(list1 != null){
                num1 = list1.getData();
                list1 = list1.getNext();
            }
            if(list2 != null) {
                num2 = list2.getData();
                list2 = list2.getNext();
            }
            sum = cary+ num1 + num2;
            cary = sum/10;
            current.setNext(new Node(sum % 10));
            current = current.getNext();

//            newList.setNext(new Node(sum % 10));
        }
        if(cary > 0){
            newList.setNext(new Node(cary));
        }

        while (newList != null) {
            System.out.println(newList.getData());
            newList = newList.getNext();
        }
    }
}
