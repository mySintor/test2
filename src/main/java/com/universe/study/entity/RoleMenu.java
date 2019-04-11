package com.universe.study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Sin
 * @date 2019/04/04/02:17
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "role_menu")
public class RoleMenu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer roleId;

    private Integer menuId;
}