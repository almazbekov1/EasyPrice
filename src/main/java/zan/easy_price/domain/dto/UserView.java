package zan.easy_price.domain.dto;

import lombok.Data;
import zan.easy_price.domain.object.ProviderObject;
import zan.easy_price.domain.object.UserObject;

import java.util.Set;

@Data
public class UserView {

    private String id;
    private UserObject user;
    private Set<String> authorities;
    private ProviderObject provider;

}
