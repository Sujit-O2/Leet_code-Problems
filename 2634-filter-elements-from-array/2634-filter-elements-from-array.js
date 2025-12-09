/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    arr2=[];
    for( i =0;i<arr.length;i++){
        if(fn(arr[i],i)!=0){
            arr2.push(arr[i])
        }

    }
    return arr2;
    
};