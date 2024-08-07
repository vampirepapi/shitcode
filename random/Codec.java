import java.util.HashMap;

public class Codec {

    // Encodes a URL to a shortened URL.
    //need a hashmap to store tinyUrl:longUrl key val pair
    HashMap<String,String> map = new HashMap<>();
    //init a base so that hash of longUrl can be concatenated
    String base = "http://tinyurl.com/4e9iAk/";

    public String encode(String longUrl) {
        //generating tinyUrl
        String tinyUrl = base + longUrl.hashCode();
        //put tinyUrl:longUrl key val pair
        map.put(tinyUrl, longUrl);
        //return tinyUrl so that the return value gets in decode method
        return tinyUrl;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        //for the tinyUrl key return the value from hashmap using get(key) function
        return map.get(shortUrl);
        
    }
    public static void main(String[] args) {
        Codec codec = new Codec();
        String url = "https://leetcode.com/problems/design-tinyurl";
        System.out.println(codec.decode(codec.encode(url)));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));