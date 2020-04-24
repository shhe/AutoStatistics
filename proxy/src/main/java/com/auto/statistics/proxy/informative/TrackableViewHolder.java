package com.auto.statistics.proxy.informative;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author shhe
 * @Date 2020-04-24 11:42
 * @Description:
 */
public interface TrackableViewHolder {
    /**
     * 点击 RecyclerView position 处 item 的扩展属性
     *
     * @param position 当前 item 所在位置
     * @return JSONObject
     * @throws JSONException JSON 异常
     */
    JSONObject getItemTrackProperties(int position) throws JSONException;
}
