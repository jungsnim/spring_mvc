/**
 * 
 */
Member = function(name,id,pw){
	this.name = name;
	this.id = id;
	this.pw=pw;
};
Member.prototype = {
	getName : function(){
		return this.name;
	},
	setBirth : function(strBirth){
		this.birth = new Date();
		var birthArr = strBirth.split("-");
		this.birth.setFullYear(birthArr[0],birthArr[1]-1,birthArr[2]);
		alert(birthArr);
	},
	getBirth : function(){
		return this.birth.getFullYear()+"-"+
		(this.birth.getMonth()+1)+this.birth.getDate();
	},
	getAge : function(){
		var today = new Date();
		
		return today.getFullYear()-this.birth.getFullYear();
	},
	getParty : function(){
		var today = new Date();
		var myBirth = new Date();
		myBirth.setTime(this.birth.getTime());
		myBirth.setFullYear(today.getFullYear());
		if(today.getTime() > myBirth.getTime()){
			myBirth.setFullYear(today.getFullYear()+1);
		}
		
		if(myBirth.getDay()==6)
			myBirth.setDate(myBirth.getDate()-1);
		if(myBirth.getDay()==0)
			myBirth.setDate(myBirth.getDate()-2);
		
		var dDay = (myBirth.getTime() - today.getTime())/(1000*60*60*24);
		dDay = Math.round(dDay);
		alert(dDay);
		return dDay;
	}
};