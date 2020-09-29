package com.itxh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataSourceProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
