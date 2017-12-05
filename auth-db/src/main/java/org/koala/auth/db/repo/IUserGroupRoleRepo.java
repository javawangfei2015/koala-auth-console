package org.koala.auth.db.repo;

import org.koala.auth.db.po.UserGroupRolePO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Repo - 用户,用户组,角色 关联对象
 */
public interface IUserGroupRoleRepo extends JpaRepository<UserGroupRolePO, Serializable>, JpaSpecificationExecutor<UserGroupRolePO> {

}
