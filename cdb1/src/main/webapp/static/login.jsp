<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="easyUI/themes/icon.css">

    <link rel="stylesheet" type="text/css" href="easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="easyUI/themes/metro/icon.css">
    <script src="js/jquery-3.1.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

    <script type="text/javascript" src="easyUI/jquery.easyui.min.js"></script>

</head>
<body>

<div style="background-image: url('img/1.jpg'); background-size: 100% 100%;width: 100%;height:660px;margin: 0px auto;">
    <br/>
    <br/>
    <form >
    <div class="text-left"  style="width:300px;margin: 0px auto; border: 1px #ccc solid; border-radius: 4px;padding: 10px">
        <div class="form-group" >
            <label for="role" >角色选择</label>
            <div class="input-group">
                <div class="input-group-addon">
                    <span class="glyphicon glyphicon-user"></span>
                </div>
                <select id="role" placeholder="请输入用户名" class=" form-control " >
                    <option value="ar">包租婆</option>
                    <option value="ar">抢租客</option>
                    <option value="ar">企业用户</option>
                    <option value="ar">管理员</option>
                    </select>
                <!--<input type="text" class="form-control" id="username" placeholder="请输入用户名" />-->
            </div>

        </div>
        <div class="form-group" >
            <label for="username" >用户名</label>
            <div class="input-group">
                <div class="input-group-addon">
                    <span class="glyphicon glyphicon-user"></span>
                </div>
                <input type="text" class="form-control" id="username" placeholder="请输入用户名" />
            </div>

        </div>
        <div class="form-group" >
            <label for="pwd" >密码</label>
            <div class="input-group">
                <div class="input-group-addon">
                    <span class="glyphicon glyphicon-lock"></span>
                </div>
                <input type="password" class="form-control" id="pwd" placeholder="请输入密码"/>
            </div>

        </div>
        <div class="form-group" >
            <label for="pwd" >验证码</label>
            <div class="input-group">
                <img style="background-color: #B3DFDA;width: 126px;height: 34px;" >
                <input type="email" class="form-control" id="exampleInputEmail1" placeholder="请输入验证码" style="width: 150px;">

                <!--<input  class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'email'"/>-->

            </div>

        </div>
        <!--<div class="form-group">

            <input type="checkbox"  id="ckpwd"/>
            <lable for="ckpwd" >记住密码</lable>
        </div>-->

        <div class="form-group text-right" >
            <button class="btn btn-primary " type="submit" style="margin-right: 30px">
                 登录
            </button>
            <button class="btn btn-danger" type="reset" style="margin-right: 50px;" onclick="$('#dlg').dialog('open')">注册</button>
        </div>
        <!--*********************** 注册窗口 ********************************************-->
        <div id="dlg" class="easyui-window" title="注册窗口" data-options="modal:true,closed:true" style="width:650px;height:380px;padding:10px;" >

            <div class="easyui-tabs" style="width:600px;height:320px;margin: 0px auto">
                <div title="包租婆注册" style="padding:10px;">
                    <form id="ff1" method="post" style="margin-left: 30px;">
                        <table cellpadding="10" style="width: 560px;height: 200px;">
                            <tr>
                                <td>用户名:</td>
                                <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"/></td>
                                <td>邮箱:</td>
                                <td><input class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'email'"/></td>

                            </tr>
                            <tr>
                                <td>密码:</td>
                                <td><input class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'email'"/></td>
                                <td>职业描述:</td>
                                <td><input class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'email'"/></td>

                            </tr>
                            <tr>
                                <td>真实姓名:</td>
                                <td><input class="easyui-textbox" type="text" name="subject" data-options="required:true"/></td>
                                <td>身份证号码:</td>
                                <td><input class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'email'"/></td>

                            </tr>
                            <tr>
                                <td>家庭地址:</td>
                                <td><input class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'email'"/></td>
                                <td>电话号码:</td>
                                <td><input class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'email'"/></td>

                            </tr>
                        </table>
                        <div style="text-align:center;padding:5px">
                            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width: 60px;margin-right: 10px;">注册</a>
                            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#dlg').dialog('close')" style="width: 60px;margin-right: 10px;">取消</a>
                        </div>
                    </form>
                </div>
                <div title="抢租客注册" style="padding:10px">
                    <form id="ff2" method="post" style="margin-left: 30px;">
                        <table cellpadding="10" style="width: 550px;height: 200px;">
                            <tr>
                                <td>用户名:</td>
                                <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"/></td>
                                <td>邮箱:</td>
                                <td><input class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'email'"/></td>

                            </tr>
                            <tr>
                                <td>密码:</td>
                                <td><input class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'email'"/></td>
                                <td>职业描述:</td>
                                <td><input class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'email'"/></td>

                            </tr>
                            <tr>
                                <td>真实姓名:</td>
                                <td><input class="easyui-textbox" type="text" name="subject" data-options="required:true"/></td>
                                <td>身份证号码:</td>
                                <td><input class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'email'"/></td>

                            </tr>
                            <tr>
                                <td>家庭地址:</td>
                                <td><input class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'email'"/></td>
                                <td>电话号码:</td>
                                <td><input class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'email'"/></td>

                            </tr>
                        </table>
                        <div style="text-align:center;padding:5px">
                            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="width: 60px;margin-right: 10px;">注册</a>
                            <a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#dlg').dialog('close')" style="width: 60px;margin-right: 10px;">取消</a>
                        </div>
                    </form>
                </div>

            </div>
            <!--*******************注册页面结束*******************************-->
        </div>
    </div>
</form>
</div>
</body>
</html>
