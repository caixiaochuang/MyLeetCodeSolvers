public class defangIPaddr {

    public String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }
}
