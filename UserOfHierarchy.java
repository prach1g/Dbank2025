public class UserOfHierarchy {
    public static void main(String[] args) {

        ScientificBook b = new ScientificBook("AI","MLREf ","ARTificial",200,"prachi");

        //REUSE
        /*System.out.println(b.getDomain());
        System.out.println(b.getReference());
        System.out.println(b.getTitle());
        System.out.println(b.getNumOfPages());
        System.out.println(b.getAuthor());
*/
        b.show();

    }
}
