package com.xhlj.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 老当益壮
 * @since 2024-01-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("Xuser")
public class Xuser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String no;

    private String name;

    private String password;


}
