package Algorithm.Recursion;

/**
 * @Author : luhaoc
 * @Date : Create in  2019/10/13
 */


import java.util.ArrayList;
import java.util.List;

/**
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 * <p>
 * 例如，给出 n = 3，生成结果为：
 * <p>
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 */


public class GenerateParenthesis {

    public static void main(String[] args) {
        generateParenthesis(3);
    }


    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        generate(res, "", 0, 0, n);
        return res;
    }

    /**
     * 每次生成的字符串长度为 2n 并且包含n个( 和 n个 )
     * 传入字符串集合，满足条件的字符串,（的个数，）的个数，以及n
     *
     * @param n
     * @return
     */

    public static void generate(List<String> res, String ans, int count1, int count2, int n) {
        if (count1 > n || count2 > n) return;

        if (count1 == n && count2 == n) res.add(ans);

        //当左括号比右括号多或者相等时,生成括号字符串，边界条件为n，将大于n的排除掉，只有等于n的放入
        if (count1 >= count2) {
            String ans1 = new String(ans);
            generate(res, ans + "(", count1 + 1, count2, n);
            generate(res, ans1 + ")", count1, count2 + 1, n);
        }
    }

}
