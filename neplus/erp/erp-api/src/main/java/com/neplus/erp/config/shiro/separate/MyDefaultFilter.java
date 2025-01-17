package com.neplus.erp.config.shiro.separate;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import org.apache.shiro.web.filter.authc.AnonymousFilter;
import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.filter.authz.*;
import org.apache.shiro.web.filter.session.NoSessionCreationFilter;
import org.springframework.objenesis.instantiator.util.ClassUtils;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * Created by summer on 2019/12/19.
 */
public enum MyDefaultFilter
{

    anon(AnonymousFilter.class),
    authc(FormAuthenticationFilter.class),
    authcBasic(BasicHttpAuthenticationFilter.class),
    logout(LogoutFilter.class),
    noSessionCreation(NoSessionCreationFilter.class),
    perms(PermissionsAuthorizationFilter.class),
    port(PortFilter.class),
    rest(HttpMethodPermissionFilter.class),
    roles(RolesAuthorizationFilter.class),
    ssl(SslFilter.class),
    user(MyUserFilter.class);

    private final Class<? extends Filter> filterClass;

    private MyDefaultFilter(Class<? extends Filter> filterClass)
    {
        this.filterClass = filterClass;
    }

    public Filter newInstance()
    {
        return (Filter) ClassUtils.newInstance(this.filterClass);
    }

    public Class<? extends Filter> getFilterClass()
    {
        return this.filterClass;
    }

    public static Map<String, Filter> createInstanceMap(FilterConfig config)
    {
        Map<String, Filter> filters = new LinkedHashMap<String, Filter>(values().length);
        for (MyDefaultFilter defaultFilter : values())
        {
            Filter filter = defaultFilter.newInstance();
            if (config != null)
            {
                try
                {
                    filter.init(config);
                }
                catch (ServletException e)
                {
                    String msg = "Unable to correctly init default filter instance of type " + filter.getClass().getName();
                    throw new IllegalStateException(msg, e);
                }
            }
            filters.put(defaultFilter.name(), filter);
        }
        return filters;
    }
}
