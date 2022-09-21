public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        String hex = String.format("#%02x%02x%02x", r, g, b);

        String buffer = hex.substring(1);
        
        for(int i = 0; i < buffer.length(); i++){
            if(buffer.charAt(i))
        }

        return buffer;
    }
}
