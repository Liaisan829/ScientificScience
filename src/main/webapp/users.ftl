<html lang="en">
<#include "base.ftl">
<#macro title> Registered Users</#macro>

<#macro content>
    Hello,
    <#if registeredUsers??>
        <#if registeredUsers?has_content>
            <#list registeredUsers as u>
                ${u.name} ${u.email}
            </#list>!
        </#if>
    </#if>
</#macro>
</html>


