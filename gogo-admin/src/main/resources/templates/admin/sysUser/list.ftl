<#include "/macro/base.ftl" />
<form id="pagerForm" method="post" action=/system/list">
    <@pagerForm />
</form>

<div class="pageHeader">
    <form rel="pagerForm" onsubmit="return navTabSearch(this);" action="/system/list" method="post">
        <div class="searchBar">
            <ul class="searchContent">
                <li>
                    <label>手机：</label>
                    <input type="text" name="userPhone" value=""/>
                </li>
            </ul>
            <div class="subBar">
                <ul>
                    <li><div class="buttonActive"><div class="buttonContent"><button type="submit">查询</button></div></div></li>
                    <li><div class="button"><div class="buttonContent"><button type="reset">清空重输</button></div></div></li>
                </ul>
            </div>
        </div>
    </form>
</div>

<div class="pageContent">
    <div class="panelBar">
        <ul class="toolBar">
            <li class="line">line</li>
            <li><a class="add" href="/admin/sysUser/add" target="dialog"><span>添加</span></a></li>
            <li class="line">line</li>
        </ul>
    </div>
    <div id="w_list_print">
        <table class="list" width="100%" targetType="navTab" asc="asc" desc="desc" layoutH="116">
            <thead>
                <tr>
                <th width="30">序号</th>
                <th>用户手机</th>
                <th>用户邮箱</th>
                <th>真实姓名</th>
                <th>用户昵称</th>
                <th>性别</th>
                <th>用户状态</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
                <#if user??>
                <#list user as bean>
                <tr>
                    <td align="center">${bean_index+1}</td>
                    <td>${bean.userPhone}</td>
                    <td>${bean.userEmail}</td>
                    <td>${bean.userRealName}</td>
                    <td>${bean.userNickName}</td>
                    <td>
                    <#list userSexEnums as userSex>
                        <#if bean.userSex == userSex.code>${userSex.desc}</#if>
                    </#list>
                    </td>
                    <td>
                    <#list userStatusEnums as userStatus>
                        <#if bean.state == userStatus.code>${userStatus.desc}</#if>
                    </#list>
                    </td>
                    <td>
                        <a title="查看" target="dialog" href="/admin/sysUser/view?id=${bean.id}" class="btnView">查看 </a>
                        <a title="编辑" target="dialog" href="/admin/sysUser/edit?id=${bean.id}" class="btnEdit">修改 </a>
                        <a title="确定要删除吗？" target="ajaxTodo" href="/admin/sysUser/delete?id=${bean.id}" class="btnDel">删除</a>
                        <a title="设置角色" target="dialog" href="/admin/sysRoleUser/set?userId=${bean.id}">【设置角色】 </a>
                    </td>
                </tr>
                </#list>
                </#if>
            </tbody>
        </table>
    </div>
</div>
