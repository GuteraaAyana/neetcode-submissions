class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder("");
        StringBuilder size_str = new StringBuilder("");
        for(String s : strs){
            size_str.append(s.length()).append(',');
        }
        encoded.append(size_str).append('#');
        for(String s : strs){
            encoded.append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        StringBuilder to_make;
        int idx = 0;
        while(str.charAt(idx) != '#'){
            to_make = new StringBuilder();
            while(str.charAt(idx) != ','){
                to_make.append(str.charAt(idx));
                idx++;
            }
            sizes.add(Integer.parseInt(to_make.toString()));
            idx++;
        }
        idx++;
        for(int s : sizes){
            decoded.add(str.substring(idx, idx + s));
            idx += s;
        }

        return decoded;
    }
}
