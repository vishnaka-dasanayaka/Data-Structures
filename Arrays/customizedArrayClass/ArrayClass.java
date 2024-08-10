package Arrays.customizedArrayClass;


public class ArrayClass {
    private int[] arr;
    private int count = 0;

    ArrayClass(int length){
        arr = new int[length];
    }

    public void insert(int newValue){
        if(count == arr.length){
            int[] newArr = new int[count*2];
            for(int i = 0;  i < count; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;

        }
        arr[count] = newValue;
        count ++;
    }

    public void removeAt(int at){
        if(at<0 || at >= count){
            throw new IllegalArgumentException();
        }

        for(int i = at; i < count; i++){
            arr[i] = arr[i+1];
        }

        count --;
    }

    public int indexOf(int value){
        for (int i = 0; i< count; i++) if (arr[i] == value) return i;
        return -1  ;
    }

    public void print(){
        for (int i = 0; i < this.count; i++){
            System.out.println(arr[i]);
        }
    }
}
