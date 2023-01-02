public class PracticeString {
    public static void main(String args[]){
        String name = "kiran fatima";

       boolean res = name.equals("kiran fatima");
        System.out.println(res);
        boolean res2 = name.equalsIgnoreCase("Kiran Fatima");
        System.out.println(res2);

        int res1 = name.length();
        System.out.println(res1);

        String lc = name.toLowerCase();
        System.out.println(lc);

        String up = name.toUpperCase().charAt(2) + "";
        System.out.println(up);

      boolean cont =  name.contains("0");
        System.out.println(cont);

        System.out.println( name.charAt(6));

        String sub = name.substring(0 , 6);
        System.out.println(sub);

        String re = name.replace("a", "e");
        System.out.println(re);

        boolean st = name.startsWith("ki");
        System.out.println(st);

       String co = name.concat(" hani");
        System.out.println(co);

        boolean end = name.endsWith("0");
        System.out.println(end);

      int com = name.compareTo("aa");
        System.out.println(com);

       boolean emp = name.isEmpty();
        System.out.println(emp);

       String rep = name.repeat(4);
        System.out.println(rep);

        String all = name.replaceAll("k" , "yy");
        System.out.println(all);


          /*   char s3 =s2.concat(password).charAt(0) ;

       boolean val = num.contains(s3 + "");

        System.out.println(val);*/

    }



}
