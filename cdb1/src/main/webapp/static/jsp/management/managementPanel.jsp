<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../../static/css/managementPanle.css">
    <script type="text/javascript" src="../../easyUI/jquery.min.js"></script>
    <script type="text/javascript" src="../../easyUI/jquery.easyui.min.js"></script>
</head>
<body>
<div id="cc" class="easyui-layout" style="width:100%;height:840px;">
    <div data-options="region:'north',split:true" style="height:100px;">
        <div id="welcome">
            欢迎你XXX
        </div>
        <div class="welcome">
            <h1>CBD停车管理平台系统</h1>
        </div>
        <div id="cancel">
            <a id="btn" href="#" class="easyui-linkbutton">注销</a>
        </div>
    </div>
    <div data-options="region:'west',title:'导航栏',split:true" style="width:200px;">
        <div style="width:100%;height: 100%">
            <div class="easyui-accordion" data-options="selected:-1" style="height:100%;border: none" >
                <div class="manage" title="用户管理" style="padding:10px;">
                    <div class="manageOne">
                        <a  href="managementLandlady.jsp" class="easyui-linkbutton btn" target="show">包租婆车位信息管理</a>
                    </div>
                    <div class="manageOne">
                        <a  href="managementLandladyInfo.jsp" class="easyui-linkbutton btn" target="show">包租婆管理</a>
                    </div>
                    <div class="manageOne">
                        <a  href="managementRopeManInfo.jsp" class="easyui-linkbutton btn" target="show">抢租客管理</a>
                    </div>
                    <div class="manageOne">
                        <a  href="managementCompany.jsp" class="easyui-linkbutton btn" target="show">企业用户管理</a>
                    </div>
                </div>
                <div class="manage" title="合约管理" style="padding:10px;">
                    <div class="manageOne">
                        <a  href="contract.jsp" class="easyui-linkbutton btn" target="show">外部合约</a>
                    </div>
                    <div class="manageOne">
                        <a  href="lessee.jsp" class="easyui-linkbutton btn" target="show">租户合约</a>
                    </div>
                </div>
                <div class="manage" title="投诉管理" style="padding:10px;">
                    <div class="manageOne">
                        <a  href="landladyComplain.jsp" class="easyui-linkbutton btn" target="show">包租婆投诉</a>
                    </div>
                    <div class="manageOne">
                        <a  href="ropeManComplain.jsp" class="easyui-linkbutton btn" target="show">抢租客投诉</a>
                    </div>
                </div>
                <div class="manage" title="CBD车位管理" style="padding:10px;">
                    <div class="manageOne">
                        <a  href="carManagment.jsp" class="easyui-linkbutton btn" target="show">CBD车位管理</a>
                    </div>
                </div>
                <div class="manage" title="系统管理" style="padding:10px;">
                    <div class="manageOne">
                        <a  href="managementUserPanel.jsp" target="show" class="easyui-linkbutton btn">用户权限</a>
                    </div>
                    <div class="manageOne">
                        <a  href="managementChangeSelf.jsp" target="show" class="easyui-linkbutton btn">个人信息</a>
                    </div>
                    <div class="manageOne">
                        <a  href="managementChangeSelfSuper.jsp" target="show" class="easyui-linkbutton btn">个人信息</a>
                    </div>
                    <div class="manageOne">
                        <a  href="log.html" class="easyui-linkbutton btn" target="show">操作日志</a>
                    </div>
                </div>
            </div>

        </div>
    </div>
    <div data-options="region:'center',title:'详细操作'" style="background: #eee">
        <iframe style="width: 100%;height: 99%;border: none" src="#" frameborder="0" name="show"></iframe>

    </div>
    <div data-options="region:'south',split:true" style="height:100px;">
        <div style="text-align: center">
            <h2>本网站由LovoJ137部第四小组制作</h2>
        </div>
    </div>
</div>

</body>
</html>