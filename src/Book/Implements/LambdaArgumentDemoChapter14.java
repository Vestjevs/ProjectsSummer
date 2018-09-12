package Book.Implements;

import Book.Interfaces.StringFunc;

public class LambdaArgumentDemoChapter14 {
    static String changeStr(StringFunc strfun, String s) {
        return strfun.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda Expressions Expand Java";
        String outStr;

        System.out.println("Выходная строка: " + inStr);

        outStr = changeStr((str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        }, inStr);
        System.out.println("Обращенная строка: " + outStr);

        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("Строка с замененными пробелами: " + outStr);

        StringFunc UpperLower = (str) -> {
            String result = "";


            for (int i = 0; i < str.length(); i++) {

                if (Character.isUpperCase(str.charAt(i)))
                    result += Character.toLowerCase(str.charAt(i));
                else
                    result += Character.toUpperCase(str.charAt(i));
            }
            return result;
        };

        outStr = changeStr(UpperLower, inStr);

        System.out.println("Строка с обращенным регистром букв: " + outStr);

//        StringFunc ReplaceOf = (str) -> {
//            String result = "";
//            for (int i = 0; i < str.length(); i++) if (str.charAt(i) == ' ') result += str.charAt(i);
//            return result;
//        };
        outStr = changeStr((str) -> str.replaceAll(" ", ""), inStr);
        System.out.println(outStr + " ");
    }
}
