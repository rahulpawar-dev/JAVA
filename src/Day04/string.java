package Day04;

public class string {
    public static void main(String[] args) {

//        Strings are Immutable

//        String name = " rahul ";
//
//        name = name.concat(" Pawar ");
//
//        System.out.println(name);


//        string Builder here is not thread safe
        StringBuilder sb = new StringBuilder("java");
        sb.append("programming");
        System.out.println(sb);

//        Thread Safe
        StringBuffer sb2= new StringBuffer("JAVA ");

        sb2.append(" Programming ");

        System.out.println(sb2);



    }
}
