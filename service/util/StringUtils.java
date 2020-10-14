package service.util;

public class StringUtils {

	public boolean isExist(CharSequence input) {
		if (org.apache.commons.lang3.StringUtils.isEmpty(input)
				|| org.apache.commons.lang3.StringUtils.isAnyBlank(input)) {
			return false;
		}
		return true;
	}

	public boolean isBlank(String input) {
		return org.apache.commons.lang3.StringUtils.isBlank(input);
	}
}
