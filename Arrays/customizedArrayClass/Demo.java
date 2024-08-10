package Arrays.customizedArrayClass;

public class Demo {
    public static void main(String[] args){
        ArrayClass numbers = new ArrayClass(3);

        numbers.insert(6);
        numbers.insert(8);
        numbers.insert(10);
        numbers.insert(87);

       // numbers.print();

        numbers.removeAt(2);

        numbers.print();

        System.out.println(numbers.indexOf(87));
    }
}
