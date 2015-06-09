package com.example.pluglibrary_1.utils;

import android.content.Context;

/**
 * ͨ��������� ��ȡ��Դ��̬IDֵ
 */
public class IDUtils {

	/**
	 * @param paramContext �����Ķ���
	 * @param paramString layout����
	 * @return resourceId
	 */
	public static int getLayoutId(Context paramContext, String paramString) {
		return paramContext.getResources().getIdentifier(paramString, "layout",
				paramContext.getPackageName());
	}

	/**
	 * @param paramContext �����Ķ���
	 * @param paramString String����
	 * @return resourceId
	 */
	public static int getStringId(Context paramContext, String paramString) {
		return paramContext.getResources().getIdentifier(paramString, "string",
				paramContext.getPackageName());
	}

	/**
	 * @param paramContext �����Ķ���
	 * @param paramString drawable����
	 * @return resourceId
	 */
	public static int getDrawableId(Context paramContext, String paramString) {
		return paramContext.getResources().getIdentifier(paramString,
				"drawable", paramContext.getPackageName());
	}

	/**
	 * @param paramContext �����Ķ���
	 * @param paramString style����
	 * @return resourceId
	 */
	public static int getStyleId(Context paramContext, String paramString) {
		return paramContext.getResources().getIdentifier(paramString, "style",
				paramContext.getPackageName());
	}

	/**
	 * @param paramContext �����Ķ���
	 * @param paramString viewId
	 * @return resourceId
	 */
	public static int getId(Context paramContext, String paramString) {
		return paramContext.getResources().getIdentifier(paramString, "id",
				paramContext.getPackageName());
	}

	/**
	 * @param paramContext �����Ķ���
	 * @param paramString color����
	 * @return resourceId
	 */
	public static int getColorId(Context paramContext, String paramString) {
		return paramContext.getResources().getIdentifier(paramString, "color",
				paramContext.getPackageName());
	}

	/**
	 * @param paramContext �����Ķ���
	 * @param paramString StringArray����
	 * @return resourceId
	 */
	public static int getArrayId(Context paramContext, String paramString) {
		return paramContext.getResources().getIdentifier(paramString, "array",
				paramContext.getPackageName());
	}
}
