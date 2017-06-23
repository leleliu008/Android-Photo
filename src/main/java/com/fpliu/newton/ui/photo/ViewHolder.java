package com.fpliu.newton.ui.photo;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Adapter优化
 * 
 * @author 792793182@qq.com 2015-06-11
 * 
 */
public final class ViewHolder {

	/** 条目对应的视图 */
	private View convertView;
	
	private SparseArray<View> widgetViews;
	
	private ViewHolder(int layoutId, ViewGroup parent) {
		convertView = LayoutInflater.from(parent.getContext()).inflate(layoutId, parent, false);
		convertView.setTag(layoutId, this);
		
		widgetViews = new SparseArray<>();
	}
	
	public static ViewHolder getViewHolder(int layoutId, View convertView, ViewGroup parent) {
		return (convertView == null) ? new ViewHolder(layoutId, parent) : (ViewHolder) convertView.getTag(layoutId);
	}
	
	public <T extends View> T getWidgetView(int widgetId) {
		View widgetView = widgetViews.get(widgetId);
		if (widgetView == null) {
			widgetView = convertView.findViewById(widgetId);
			widgetViews.put(widgetId, widgetView);
		}
		return (T) widgetView;
	}
	
	public View getConvertView() {
		return convertView;
	}
}
