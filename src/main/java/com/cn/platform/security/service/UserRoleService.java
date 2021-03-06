
package com.cn.platform.security.service;

import java.util.List;

import com.cn.framework.mvc.mysql.service.BaseSQLService;
import com.cn.platform.security.entity.UserRole;

public interface UserRoleService extends BaseSQLService<UserRole, String> {

	/**
	 * @param userId
	 * @return
	 */
	List<UserRole> findUserRoleByUser(String userId);

	/**
	 * @param roleId
	 * @return
	 */
	List<UserRole> findUserRoleByRole(String roleId);

	/**
	 * @param userId
	 * @return
	 */
	List<UserRole> findUserRoleByUserList(List<String> userIds);

	/**
	 * @param roleId
	 * @return
	 */
	List<UserRole> findUserRoleByRoleList(List<String> roleIds);

}
