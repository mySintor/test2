package com.universe.study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Sin
 * @date 2019/04/04/02:17
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_role")
public class UserRole implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    private Integer roleId;

    private Boolean status;
}