package org.koala.auth.db.repo;

import org.koala.auth.db.po.ResourcePO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Repo - 资源
 */
public interface IResourceRepo extends JpaRepository<ResourcePO, Serializable>, JpaSpecificationExecutor<ResourcePO> {

}
