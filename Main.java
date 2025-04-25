//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /// Пример с урока
//    public static char[] myTrim(char[] str){
//        int countL = 0 , countR = 0;
//        for (int i = 0; i < str.length; i++) {
//            if (str[i] == ' ' ){
//                countL++;
//            }else{
//                break;
//            }
//        }
//
//        for (int i = str.length-1; i>= 0; i--) {
//            if (str[i] == ' ' ){
//                countR++;
//            }else{
//                break;
//            }
//        }
//
//        //                           11         3          3   =>   5
//        char[] result = new char[str.length - countL - countR];
//        //                                8
//        for (int i = countL,j = 0; i < str.length - countR; i++,j++) {
//            result[j] = str[i];
//        }
//
//        return result;
//    }
    public static boolean myEquals(char []str, char[]strCompare){
        if(str==strCompare){
            return true;
        }
        if(str.length!=strCompare.length){
            return false;
        }if(str==null && strCompare==null){
            return false;
        }
        for (int i = 0 ; i < str.length ; i++) {
            if( str[i]!=strCompare[i]){
                return false;
            }
        }
        return true;
    }
public static boolean myEndsWith(char[] str, char[] ending) {
    if (str == null || ending == null) {
        return false;
    }
    int endingLength = ending.length;
    int strLength = str.length;

    if (endingLength > strLength) {
        return false;
    }
    for (int i = 0; i < endingLength; i++) {
        if (str[strLength - endingLength + i] != ending[i]) {//15-2+ 2= 14!= 2
            return false;
        }
    }
    return true;
}

public static boolean myStartsWith(char[]str,char[]strstart ){
    for (int i = 0; i < strstart.length; i++) {
        if (str[i] != strstart[i] && strstart!=str) {
            return false;
        }
    }return true;
}
public static char[]myReplace(char[]str,char replace,char newreplace ){
    for (int i = 0; i < str.length; i++) {
        if(str[i]==replace){
            str[i]=newreplace;
        }
    }
    return str;
}
//public static char[] myToCharArray(String str){
//    for (int i = 0; i < str.length(); i++) {
//        char[]arr = new char[str[i]];
//    }
//    return arr;
//}
    public static boolean myEqualsIgnoreCase(char[] str,char [] strCheck ){
        for (int i = 0; i < strCheck.length; i++) {
            if(str[i] != strCheck[i] && strCheck!=str){
                return false;
            }
            if(str[i]>='A'&& str[i]<='Z'){
                str[i]+=32;
                return true;

            }if(str[i]>='a'&& str[i]<='z'){
                str[i]-=32;
                return true;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        String str =("Albert Einstein");
        String str1 =("Albert");
        char[] strArr =str.toCharArray();;
        char[] strArr1 =str1.toCharArray();;

//        +     equals("Farid"));
//        System.out.println(str1.equals("Albert"));
//        System.out.println(myEquals(strArr1,strArr));

//        +     endsWith("dlayev"));
//        System.out.println(str.endsWith("in"));
//        System.out.println(myEndsWith(strArr,new char[]{'i','n'}));

//        -     startsWith("Abdullayev"));
//        System.out.println(str.startsWith("Albert"));
//        System.out.println(myStartsWith(strArr,new char[]{'A','l','b','e','r','t'}));

//        -     replace('F','Z'));
//        System.out.println(str.replace('A','z'));
//        System.out.println(myReplace(strArr,'A','G'));

//        -     toCharArray());
      //  System.out.println(str.toCharArray());


//        -     equalsIgnoreCase("Farid"));
        System.out.println(str1.equalsIgnoreCase("aLbert"));
        System.out.println(myEqualsIgnoreCase(strArr,new char[]{'A','l','b','e','r','t'}));
//        -     substring(10));
//        -     substring(10,20));
//        +     trim());

//        -     contains("  "));
//        -     split("Farid"));
//        -     replace("Farid","Dima"));






















//       1+  str.length()
        //1
//        System.out.println(str.length());
//        System.out.println(Mylength(str1));
//       2+  str.indexOf('a',5)
        //2
//        System.out.println(str.indexOf('a',1));
//        int otvet=myindexOf(str1,'e',0);
//        System.out.println(otvet);
//       3+  str.lastIndexOf('a')
        //3
//        System.out.println(str.lastIndexOf('a'));
//        System.out.println(mylastIndexOf(str1,'e'));
//       4+  str.lastIndexOf('a',5)
        //4
//        System.out.println(str.lastIndexOf('e',1));
//        System.out.println(mylastIndexOf(str1,'e',1));
//       5+  str.toLowerCase()
        //5
//        System.out.println(str.toLowerCase());
//        System.out.println(myToUpperCase(str1));
//       6+  charAt(10)
        //6
//        System.out.println(str.charAt(2));
//        System.out.println(mycharAt(str1,2));
//       7+  isEmpty()
        //7
//        System.out.println(str.isEmpty());
//       System.out.println(myisEmpty(str1));
        //8
//        System.out.println(str.isBlank());
//        System.out.println(myisBlank(str1));







































    }
}





















