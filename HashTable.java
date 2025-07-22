/*You will have to complete the FruitNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and insert()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the FruitNode objects
    private FruitNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new FruitNode[size];
    }
    
    //This method basically prints the HashTable
    //DO NOT change this method
    public void show(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" " );
            FruitNode n = ht[i];
            while (n!=null){
                System.out.print("('"+n.fruit[0]+"', "+n.fruit[1]+") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    //you need to COMPLETE this method
    private int hashFunction( String key ){
        // TO DO

        int len = key.length();
        int sum = 0;
        if ( len % 2 == 0) {
            for (int i = 0; i < len; i = i +2) {

                sum += (int) key.charAt(i);
            }
        }
        else {
            for (int i = 1; i < len; i = i +2) {

                sum += (int) key.charAt(i);
            }
        }
        return (sum % 5);
        // return -1; //remove this line
    }

    //you need to COMPLETE this method
    //The insert() method will create a FruitNode using name(Key) & price(value)
	//then inserts it in the proper hashed index
    //If collision occurs resolve using the steps explained in the question
    public void insert(String key, Integer value){
        // TO DO

        ht = new FruitNode[5];

        int idx = hashFunction(key);

        FruitNode pear = new FruitNode(key, value);

        if (ht[idx] == null) {

            ht[idx] = pear;
        }
        else {
            FruitNode present = ht[idx];
            while (present != null) {

                if (present.fruit[0] == key) {
                    present.fruit[1] = value;
                }
                present = present.next;
            }
        }



    }
    public static void main (String [] arg) {
        new HashTable()
        int idx = hashFunction("apple");
        System.out.println(idx));
    }

}












