class NeedleHaystack {
    public int strStr(String haystack, String needle) {
        // if (needle.length() == 0)
        //     return 0;
        // if (haystack.length() == 0)
        //     return -1;
        
        // for(int i=0; i< haystack.length(); i++){
        //     //not enough space for needle after i
        //     if(i+ needle.length()> haystack.length()) break;

        //     for(int j=0; j< needle.length(); j++){
        //         if(haystack.charAt(i+j)!= needle.charAt(j))
        //             break;
        //         if(j == needle.length()-1)
        //             return i;
        //     }
        // }
        // return -1;
        for(int i=0; ; i++){
            for(int j=0; ; j++){
                if(j==needle.length()) return i;
                if(i+j == haystack.length()) return -1;
                if(needle.charAt(j) != haystack.charAt(i+j)) break;
            }
        }
    }
}