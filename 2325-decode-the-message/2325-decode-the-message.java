class Solution {
    public String decodeMessage(String key, String message) {
         String real = "";
        char alphabet = 'a';
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == ' ') {
                continue;
            } else if (!hashMap.containsKey(key.charAt(i))) {
                hashMap.put(key.charAt(i), alphabet);
            } else {
                continue;
            }
            alphabet = (char) (alphabet + 1);
        }
        for (int m = 0; m < message.length(); m++) {
            if (message.charAt(m) == ' ') {
                real += " ";
            }
            else if (hashMap.containsKey(message.charAt(m))) {
                real += hashMap.get(message.charAt(m));
            }
        }
        return real;
    }
}