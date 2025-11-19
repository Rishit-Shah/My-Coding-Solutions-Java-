class Solution {
    public String decodeString(String s) {
       Stack<Character> c1= new Stack<>(); 
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)==']'){
            List<Character> decodCharacters= new ArrayList<>();

        while(c1.peek()!='['){
            decodCharacters.add(c1.pop());

        }
        c1.pop();
        int base=1;
        int k=0;
        while(!c1.isEmpty() && Character.isDigit(c1.peek())){
            k=k+(c1.pop()-'0')*base;
            base*=10;

        }
        while(k!=0){
            for(int j=decodCharacters.size()-1;j>=0;j--){
                c1.push(decodCharacters.get(j));

            }
            k--;

        }

        } else{
            c1.push(s.charAt(i));
        }

       }
       char[] results= new char[c1.size()];
       for(int i=results.length-1;i>=0;i--){
            results[i]=c1.pop();

       }
       return new String(results);
    }
}
