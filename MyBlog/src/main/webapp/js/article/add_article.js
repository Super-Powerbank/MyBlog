// 保存文章
function saveArticle(){
    //通过json格式传输数据到后台
    var param = {};

    // 收集参数 校验
    //$("#categoryId").val() 获取页面指定参数的输入值
    var categoryId = $("#categoryId").val();
    if(categoryId == '-1'){
    	autoCloseAlert("请选择栏目",500);
    	return false;
    }
    param["categoryId"] = categoryId;
    
    var title = $("#title").val();
    if(isEmpty(title)){
    	autoCloseAlert("请输入标题",500);
    	return false;
    }
    param["title"] = title;
    
    var arr = [];
    //拿到的是博文输入内容 输入内容+页面标签信息
    arr.push(UE.getEditor('editor').getContent());
    var content = arr.join("\n");
    
    // 简介
    //拿到是博文输入内容，纯字符串
    var description = UE.getEditor('editor').getContentTxt().substring(0,500);
    
    // 标签
    var tagId = $(".chosen-select").val();
    // alert(tagId);
    if(!isEmpty(tagId)){
    	var ids = (tagId+"").split("\,");
    	var tagArray = [];
    	for(var i=0;i<ids.length;i++){
    		tagObj = {"id":ids[i]};
    		// alert(tagObj.id);
    		tagArray.push(tagObj);
    	}
    	param["tagList"] = tagArray;
    	console.info(tagArray);
    }else{
    	autoCloseAlert("请输入标签",500);
    	return false;
    }
    // 保存文章
    //ajax提交数据
    //encodeURI将前端数据按照指定编码形式编码
    var data = 'param='+encodeURI(encodeURI(JSON.stringify(param)))+"&content="+encodeURI(encodeURI(content)).replace(/\&/g, "%26").replace(/\+/g, "%2B")+"&description="+encodeURI(encodeURI(description));
    //打印日志
    // autoCloseAlert(data,500);


     $.ajax({
        type : "POST",
        url : '../addarticle',
        data : data,
        success  : function(data) {
        	if(data.resultCode != 'success'){
        		autoCloseAlert(data.errorInfo,1000);
				return false;
			}else{
				// 调到列表页
				window.location.href = "../article/list";
			}
		}
    });
}

function cancelSaveArticle(){
	window.location.href = "../article/list";
}