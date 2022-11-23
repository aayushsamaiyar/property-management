package com.mycompany.propertymanagement.repository;

import com.mycompany.propertymanagement.entity.PropertyEntity;
import com.mycompany.propertymanagement.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PropertyRepository extends CrudRepository<PropertyEntity,Long> {
//    @Query("SELECT p from PropertyEntity p where p.userEntity.id =  :userId")
    List<PropertyEntity> findAllByUserEntityId(@Param("userId") Long userId);
}
