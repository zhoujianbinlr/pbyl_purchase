
package com.cn.common.vo;

/**
 * 异步请求统一的响应格式
 * @Package: com.cn.framework.mvc.controller
 * @ClassName: AjaxResponse
 * @Statement: <p>
 *             </p>
 * @JDK version used:
 * @Author: zhoujb
 * @Create Date: 2016-4-2
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
public class AjaxResponse extends Response {

	private static final long serialVersionUID = 4353605099813736643L;

	public AjaxResponse() {
		super();
	}

	public AjaxResponse(String resultCode) {
		super(resultCode);
	}

	public AjaxResponse(String resultCode, String resultMessage) {
		super(resultCode, resultMessage);
	}

	public AjaxResponse(String resultCode, Object result) {
		super(resultCode, result);
	}

	public AjaxResponse(String resultCode, String resultMessage, Object result) {
		super(resultCode, resultMessage, result);
	}
}
