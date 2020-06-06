import java.util.Scanner;
import java.util.Stack;

/**
 * @program: 20200606
 * @description
 * @author: Zhang Baolu
 * @create: 2020-06-06 14:29
 **/
public class TestDemo {
    //读入一个字符串str，输出字符串str中的连续最长的数字串
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()) {
                String str = sc.nextLine();
                int max = 0;
                int count = 0;
                int end = 0;
                for(int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if(c >= '0' && c <= '9') {
                        count++;
                        if(count > max) {
                            max = count;
                            end = i;
                        }
                    }else{
                        count = 0;
                    }
                }
                System.out.println(str.substring(end-max+1,end+1));
            }
        }

    //对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
    //给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
    public class Parenthesis {
        public boolean chkParenthesis(String A, int n) {
            // write code here
            Stack<Character> stack = new Stack<Character>();
            if(A == null){
                return false;
            }
            for(int i = 0; i < A.length(); i++){
                char c = A.charAt(i);
                if(c == '('){
                    stack.push(c);
                }else if(c == ')'){
                    if(stack.empty()){
                        return false;
                    }else{
                        stack.pop();
                    }
                }else{
                    return false;
                }
            }
            if(!stack.empty()){
                return false;
            }else{
                return true;
            }
        }
    }

    //输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are students.”和”aeiou”，
    // 则删除之后的第一个字符串变成”Thy r stdnts.”
    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            char[] ch = str1.toCharArray();
            for(int i = 0; i < ch.length; i++) {
                char c = ch[i];
                if(!str2.contains(String.valueOf(ch[i]))) {
                    System.out.print(ch[i]);
                }
            }
        }
    }
}

