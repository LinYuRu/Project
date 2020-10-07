package Sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayList_AddAllOfNull_test {

	public static void main(String[] args) {
		List<String> all = new ArrayList<String>();
		List<String> one = new ArrayList<String>();
		List<String> two = new ArrayList<String>();
		List<String> three = new ArrayList<String>();

		addAllIfNotNull(all, one);
		addAllIfNotNull(all, two);
		addAllIfNotNull(all, three);

		ArrayList arrList = new ArrayList();
		if(arrList.isEmpty()) {
			
		}
	}

	public static <E> void addAllIfNotNull(List<E> list, Collection<? extends E> c) {
		if (c != null) {
			list.addAll(c);
		}
	}
	// 判斷list not null,用上面方法可以避免一堆if
//	 List<OcmImageData> fullImagePool = new ArrayList<>();
//	    if (CollectionUtils.isNotEmpty(style.getTestMH())) {
//	        fullImagePool.addAll(style.getTestMH());
//	    }
//	    if (CollectionUtils.isNotEmpty(style.getTrousers())) {
//	        fullImagePool.addAll(style.getTrousers());
//	    }
//	    if (CollectionUtils.isNotEmpty(style.getDetailRevers())) {
//	        fullImagePool.addAll(style.getDetailRevers());
//	    }
//	    if (CollectionUtils.isNotEmpty(style.getDetailCuffs())) {
//	        fullImagePool.addAll(style.getDetailCuffs());
//	    }
	// 參考:
	// https://stackoverflow.com/questions/30739105/any-null-safe-alternative-to-arraylist-addall
}
