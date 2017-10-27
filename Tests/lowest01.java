public class lowest01{
    public static int lowest(int[] bases){
        boolean found = false;
        int n = 2;
        while(!found){
            int works = 0;
            for(int i = 0; i < bases.length; i++){
                String end = Integer.toString(Integer.parseInt(n + "", 10), bases[i]);
                int good = 0;
                for(int j = 0; j < end.length(); j++){
                    String test = end.charAt(j) + "";
                    // System.out.println(test + good);
                    good += (Integer.parseInt(test) <= 1) ? 1 : 0;
                    System.out.println(good);
                }
                works += (good == bases.length - 1) ? 1 : 0; 
            }
            if(works == bases.length) return n;
            // System.out.println(n);
            n++;
        }
        return 0;
    }
}