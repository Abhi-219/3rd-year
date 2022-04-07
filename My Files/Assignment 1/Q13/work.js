onmessage = function(e){
    let prod = 1, i = 1;
    let ans = [];
    console.log(e.data);
    for(i = 1; i <= e.data.input; i++){
        prod *= i;
        ans.push(prod);
    }
    return postMessage(ans);
}