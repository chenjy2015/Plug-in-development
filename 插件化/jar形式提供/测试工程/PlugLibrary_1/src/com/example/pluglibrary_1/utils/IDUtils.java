package com.example.pluglibrary_1.utils;

import android.content.Context;

/**
 * 通过反射机制 获取资源动态ID值
 */
public class IDUtils {

	/**
	 * @param paramContext 上下文对象
	 * @param paramString layout名字
	 * @return resourceId
	 */
	public static int getLayoutId(Context paramContext, String paramString) {
		return paramContext.getResources().getIdentifier(paramString, "layout",
				paramContext.getPackageName());
	}

	/**
	 * @param paramContext 上下文对象
	 * @param paramString String名字
	 * @return resourceId
	 */
	public static int getStringId(Context paramContext, String paramString) {
		return paramContext.getResources().getIdentifier(paramString, "string",
				paramContext.getPackageName());
	}

	/**
	 * @param paramContext 上下文对象
	 * @param paramString drawable名字
	 * @return resourceId
	 */
	public static int getDrawableId(Context paramContext, String paramString) {
		return paramContext.getResources().getIdentifier(paramString,
				"drawable", paramContext.getPackageName());
	}

	/**
	 * @param paramContext 上下文对象
	 * @param paramString style名字
	 * @return resourceId
	 */
	public static int getStyleId(Context paramContext, String paramString) {
		return paramContext.getResources().getIdentifier(paramString, "style",
				paramContext.getPackageName());
	}

	/**
	 * @param paramContext 上下文对象
	 * @param paramString viewId
	 * @return resourceId
	 */
	public static int getId(Context paramContext, String paramString) {
		return paramContext.getResources().getIdentifier(paramString, "id",
				paramContext.getPackageName());
	}

	/**
	 * @param paramContext 上下文对象
	 * @param paramString color名字
	 * @return resourceId
	 */
	public static int getColorId(Context paramContext, String paramString) {
		return paramContext.getResources().getIdentifier(paramString, "color",
				paramContext.getPackageName());
	}

	/**
	 * @param paramContext 上下文对象
	 * @param paramString StringArray名字
	 * @return resourceId
	 */
	public static int getArrayId(Context paramContext, String paramString) {
		return paramContext.getResources().getIdentifier(paramString, "array",
				paramContext.getPackageName());
	}
}
