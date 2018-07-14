public class Test {
    public static void main(String[] args) {
        MyCollectionFixSize<String> myCollectionFixSize = new MyCollectionFixSize();
        for(int i = 0; i < 25; i++){
            myCollectionFixSize.add("String" + " - " + i);
        }
        for(Object s : myCollectionFixSize){
            System.out.print(s + " ");
        }
        myCollectionFixSize.add(null);
        System.out.println();
        for(Object s : myCollectionFixSize){
            System.out.print(s + " ");
        }
    }
}
