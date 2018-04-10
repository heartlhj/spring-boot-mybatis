<#include "/macro/base.ftl" />
<form id="pagerForm" method="post" action=/system/resource/list">
    <@pagerForm />
</form>

<div class="pageHeader">
    <form rel="pagerForm" onsubmit="return navTabSearch(this);" action="/system/list" method="post">
        <div class="searchBar">
            <ul class="searchContent">
                <li>
                    <label>类型：</label>
                    <input type="text" name="resourceType" value=""/>
                </li>
                <li>
                    <label>名称：</label>
                    <input type="text" name="resourcePath" value=""/>
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
            <li><a class="add" href="/system/resource/add" target="dialog"><span>添加</span></a></li>
            <li class="line">line</li>
        </ul>
    </div>
    <div id="w_list_print">
        <table class="list" width="100%" targetType="navTab" asc="asc" desc="desc" layoutH="116">
            <thead>
                <tr>
                <th width="30">序号</th>
                <th>资源名称</th>
                <th>资源类型</th>
                <th>路径类型</th>
                <th>资源路径</th>
                <th>状态</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
                <#if resource??>
                <#list resource as bean>
                <tr>
                    <td align="center">${bean_index+1}</td>
                    <td>${bean.resourceName}</td>
                    <td>
                    <#list resourceTypes as resourceType>
                        <#if bean.resourceType == resourceType.code>${resourceType.desc}</#if>
                    </#list>
                    </td>
                     <td>
                    <#list resourcePathTypes as resourcePathType>
                        <#if bean.resourcePathType == resourcePathType.code>${resourcePathType.desc}</#if>
                    </#list>
                    </td>
                    <td>${bean.resourcePath}</td>
                    <td>
                    <#list resoureStatusEnums as resoureStatusEnum>
                        <#if bean.state == resoureStatusEnum.code>${resoureStatusEnum.desc}</#if>
                    </#list>
                    </td>
                    <td>
                        <a title="查看" target="dialog" href="/admin/sysUser/view?id=${bean.id}" class="btnView">查看 </a>
                        <a title="编辑" target="dialog" href="/admin/sysUser/edit?id=${bean.id}" class="btnEdit">修改 </a>
                        <a title="确定要删除吗？" target="ajaxTodo" href="/admin/sysUser/delete?id=${bean.id}" class="btnDel">删除</a>
                    </td>
                </tr>
                </#list>
                </#if>
            </tbody>
        </table>
    </div>
</div>
