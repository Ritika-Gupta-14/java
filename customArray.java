import java.lang.*;

public class customArray<T> {
    int size=0;
    int defaultSize=5;
    private Object[] list;
    public customArray (){
    list=new Object[defaultSize];}

    public void insert(T val){
        if(size>= list.length){
            defaultSize= list.length*2;
            Object[] temp=new Object[defaultSize];
            for(int i=0;i<list.length;i++){
                temp[i]=list[i];
            }
            list= temp;
        }
        list[size++]=val;

    }
    public void printArray(){
         for(int i=0;i<size;i++){
                System.out.println(list[i]);
            }

    }

    public T delete(){
        T val= (T)list[--size];
        return val;
    }

    public static void main(String[] args) {
    customArray <Integer> list=new customArray <>();
       for(int i=1;i<7;i++){
              
                list.insert(i);
            }
            for(int i=1;i<3;i++){
              
               Integer delval=list.delete();
                System.out.println("delval: "+delval);
            }

    list.printArray();
}


}
    


