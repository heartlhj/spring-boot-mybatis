<#assign base=request.contextPath />
<div class="pageContent">
	<form action="${base}/system/resource/save" method="post"  class="pageForm required-validate" onsubmit="return validateCallback(this, dialogAjaxDone);">
        <div class="pageFormContent" layoutH="58">
    		<p>
                <label>资源名称：</label>
                <input type="text" name="resourceName" value="" placeholder="资源名称" size="20">
            </p>
    		<p>
               	<label>资源类型：</label>
                 <#list resourceTypes as resourceType>
                 <input type="radio" name="resourceType" value="${resourceType.code}" /> ${resourceType.desc}
                </#list>
            </p>
    		<p>
    			<label>路径类型：</label>
                 <#list resourcePathTypes as resourcePathType>
                 <input type="radio" name="resourcePathType" value="${resourcePathType.code}" /> ${resourcePathType.desc}
                </#list>
            </p>
    		<p>
                <label>资源路径：</label>
                <input type="text" name="resourcePath" value="" placeholder="资源路径" size="20">
            </p>
    		<p>
                <label>备注：</label>
                <input type="text" name="remark" value="" placeholder="备注" size="20">
            </p>
        </div>
        <div class="formBar">
            <ul>
                <li><div class="buttonActive"><div class="buttonContent"><button type="submit">保存</button></div></div></li>
                <li><div class="button"><div class="buttonContent"><button type="button" class="close">取消</button></div></div></li>
            </ul>
        </div>
	</form>
</div>
