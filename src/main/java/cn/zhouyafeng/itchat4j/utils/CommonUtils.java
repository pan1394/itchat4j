package cn.zhouyafeng.itchat4j.utils;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONObject;

public class CommonUtils {

	public static String getName(JSONObject object) {
		Objects.requireNonNull(object);
		String remarkName = object.getString("RemarkName");
		String nickName = object.getString("NickName");
		return StringUtils.isNotBlank(nickName) ? nickName : remarkName;
	}
}
