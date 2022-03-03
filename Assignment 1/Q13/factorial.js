
onmessage = function(e) {
	
    var msg = e.data ;
    var n = parseInt(msg);
     
    let i=0,ans=1;;
    
    for(i=n;i>0;i--){
    	ans*=i;
    }
    
    postMessage(ans);
    
};    


