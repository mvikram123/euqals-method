class Main {

    public static void main(String args[]){
        String a = "bikini";
        String b = new String("bikini");
        String c = new String("bikini");

        System.out.println(a.equals(b));// equals method match the value of variable a and b so output gets true
        System.out.println(b.equals(c));

        System.out.println(a==b);// == it matches the references of a and b so output gets false.here references is different of a and b
        System.out.println(b==c);
    }

}