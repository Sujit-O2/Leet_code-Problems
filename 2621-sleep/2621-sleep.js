/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
    return new Promise(re=>setTimeout(re,millis));
    
}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */