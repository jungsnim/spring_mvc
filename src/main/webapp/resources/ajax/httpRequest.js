/**
 * 
 */
var httpRequest = null;
function getXMLHttpRequest()
{
	if(window.ActiveXObject){
		try{
			return new ActiveXObject("Msxml12.XMLHTTP");
		}catch(e){
			try{
				return new ActiveXObject("Microsoft.XMLHTTP");
			}catch(e1){
				return null;
			}
		}
	}
	else if(window.XMLHttpRequest){
		return new XMLHttpRequest();
	}else{
		return null;	
	}
}

function sendRequest(url,params,callback,method)
{
	httpRequest = getXMLHttpRequest();
	
	var httpMethod = method ?method : "Get";
	if(httpMethod != "Get" && httpMethod != "Post")
		httpMethod = "Get";
	
	var httpParams = (params == null || params =="")? null : params; 
	
	var httpUrl = url;
	if(httpMethod == "Get" && httpParams != null){
		httpUrl += "?" + httpParams;
	}
	httpRequest.onreadystatechange=callback;
	
	httpRequest.open(httpMethod,httpUrl,true);
	httpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	httpRequest.send((httpMethod=="Post")?httpParams:null);
	
}
function log(msg, console_id)
{
   var console = document.getElementById(console_id);
   if(console != null)
      console.innerHTML += msg+"<br>";
}
