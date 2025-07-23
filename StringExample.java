public class StringExample {
    public static void main(String[] args) {
        String s1 = "alphabet";
        int l = s1.length();
        System.out.println("length of " + s1 + "=" + l);
        String uS1 = s1.toUpperCase();
        System.out.println("s1=" + s1 + " us1=" + uS1);
        String cS1 = s1.concat("of english");
        System.out.println("s1=" + s1 + " cs1=" + cS1);
        System.out.println(s1.charAt(2));
        System.out.println(s1.substring(2, 5));
        String s2 = "red,green,blue,yellow,violet,white";
        String[] arr = s2.split(",");
        //print the arr  and print the length of each value of arr
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " " + arr[i].length());

        //for each string s in arr
        for (String s : arr) {
            System.out.println(s + " " + s.length());
        }




    }
}
