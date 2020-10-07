package ClassObjectField;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * sort()會依照給予的比對大小規則，將元素由小到大排序（ASC）
 * <p>
 * 而在compare()中，<br>
 * 回傳任意正整數代表 o1 在邏輯上比 o2 大，也就是o1要排在o2後面的意思<br>
 * 回傳任意負整數則相反，<br>
 * 回傳0則表示兩者相等，sort()不會交換邏輯大小相等的元素(stable)
 * <p>
 * 
 * 如果想要依照相同的邏輯但得到DESC的結果的話，<br>
 * 只要將return正的改成負的，負的改成正的就好了。
 * <p>
 */
public class ComparatorDemo {

	static public String execute(String[] inputs) {
		String result = null;
		if (inputs == null) {
			return null;
		}
		List<String> inputList = Arrays.asList(inputs);
		inputList.sort(new Comparator<String>() {
			/**
			 * Comparator #1
			 * <p>
			 * 這個comparator的排序是：
			 * <ol>
			 * <li>字串長度短的優先
			 * <li>長度相同，則依照字母順序由小到大排序
			 * </ol>
			 */
//			@Override
//			public int compare(String o1, String o2) {
//				if (o1.length() > o2.length())
//					return 1;
//				if (o1.length() < o2.length())
//					return -1;
//				for (int i = 0; i < o1.length(); i++) {
//					if (o1.charAt(i) > o2.charAt(i))
//						return 1;
//					if (o1.charAt(i) < o2.charAt(i))
//						return -1;
//				}
//				return 0;
//			}
			/**
			 * Comparator #2
			 * <p>
			 * 這個comparator的排序是：
			 * <ol>
			 * <li>字串長度長的優先
			 * <li>長度相同，則依照字母順序由大到小排序
			 * </ol>
			 * <p>
			 * (基本上就是上一個的reverse版)
			 */
//			@Override
//			public int compare(String o1, String o2) {
//				if (o1.length() > o2.length())
//					return -1;
//				if (o1.length() < o2.length())
//					return 1;
//				for (int i = 0; i < o1.length(); i++) {
//					if (o1.charAt(i) > o2.charAt(i))
//						return -1;
//					if (o1.charAt(i) < o2.charAt(i))
//						return 1;
//				}
//				return 0;
//			}
			/**
			 * Comparator #3
			 * <p>
			 * 這個comparator的排序是：
			 * <ol>
			 * <li>字串長度長的優先
			 * <li>長度相同，則依照字母順序由小到大排序
			 * </ol>
			 */
//			@Override
//			public int compare(String o1, String o2) {
//				if (o1.length() > o2.length())
//					return -1;
//				if (o1.length() < o2.length())
//					return 1;
//				for (int i = 0; i < o1.length(); i++) {
//					if (o1.charAt(i) > o2.charAt(i))
//						return 1;
//					if (o1.charAt(i) < o2.charAt(i))
//						return -1;
//				}
//				return 0;
//			}
			/**
			 * Comparator #4
			 * <p>
			 * 這個comparator的排序是：
			 * <ol>
			 * <li>字串長度短的優先
			 * <li>長度相同且不小於二，則依照字串中第二字元的字母大小順序由小到大排序
			 * </ol>
			 */
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() > o2.length())
					return 1;
				if (o1.length() < o2.length())
					return -1;
				if (o1.length() >= 2) {
					if (o1.charAt(1) > o2.charAt(1))
						return 1;
					if (o1.charAt(1) < o2.charAt(1))
						return -1;
				}
				return 0;
			}

		});
		
		//使用下面定義好的comparator
		//inputList.sort(ComparatorDemo.myComparator());
		
		
		result = "";
		for (String input : inputList) {
			result += "," + input;
		}
		return result.substring(1);
	}

	/**
	 * Comparator #5
	 * <p>
	 * 除了直接在sort()裡面邊new邊override外，當然也可以根據需要的邏輯寫好好幾個，需要的時候呼叫使用。
	 * <p>
	 * 底下這個的邏輯與第一個Comparator #1一樣
	 * 
	 */
	static public Comparator<String> myComparator() {
		return new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() > o2.length())
					return 1;
				if (o1.length() < o2.length())
					return -1;
				for (int i = 0; i < o1.length(); i++) {
					if (o1.charAt(i) > o2.charAt(i))
						return 1;
					if (o1.charAt(i) < o2.charAt(i))
						return -1;
				}
				return 0;
			}
		};
	}

	public static void main(String[] args) {
		String[] inputs = { "acb", "abc", "cba", "bca", "ab", "c", "cb", "ac", "ba", "ca", "bc", "cab", "bac", "a",
				"b" };
		System.out.println(ComparatorDemo.execute(inputs));
	}

}
