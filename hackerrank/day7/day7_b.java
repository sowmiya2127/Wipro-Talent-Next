char[] v = { 'a', 'e', 'i', 'o', 'u' };
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        char c;
        int vCount = -1;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            int value = charCount.get(c) == null ? 0 : charCount.get(c) + 1;
            if (value == 0) {

                if (c == v[vCount + 1]) {
                    value = vCount >= 0 ? charCount.get(v[vCount]) + 1 : 1;
                    vCount++;
                }
                
                charCount.put(c, value);

            } else {
                charCount.put(c, value);
            }
        }
        return charCount.get('u').intValue();
