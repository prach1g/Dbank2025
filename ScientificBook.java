//ScientificBook is a subclass of Book1 super
public class ScientificBook extends Book1{
    private String domain;
    private String reference;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public ScientificBook(String domain, String reference,String t ,int n, String a) {
        super(t,a,n); //calls super class constr
        System.out.println("the param-constr of Scientific Book called");
        this.domain = domain;
        this.reference = reference;
    }

    public void show()
    {
        super.show();
        System.out.println("domain =" +this.domain);
    }

    public ScientificBook() {
    }
}
