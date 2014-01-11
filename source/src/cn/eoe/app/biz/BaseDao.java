package cn.eoe.app.biz;

import org.codehaus.jackson.map.ObjectMapper;

import android.app.Activity;

/**
 * @author xiangxm
 *
 *
 *
 */
public  class BaseDao {
	ObjectMapper mObjectMapper = new ObjectMapper();

	protected Activity mActivity;
	
	public BaseDao(){};
	
	public BaseDao(Activity activity)
	{
		mActivity=activity;
	}

	
}
