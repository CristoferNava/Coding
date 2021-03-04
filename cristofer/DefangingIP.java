public class DefangingIP {
    public String defangIPaddr(String address) {
        var builder = new StringBuilder();
        
        for (int i = 0; i < address.length(); i++) {
            char current = address.charAt(i);
            if (current == '.') builder.append("[.]");
            else builder.append(address.charAt(i));
        }
        
        return builder.toString();
    }
}

// Time: O(n) we have to traverse all the n chars in the string
// Space: O(n) we have to build a new string