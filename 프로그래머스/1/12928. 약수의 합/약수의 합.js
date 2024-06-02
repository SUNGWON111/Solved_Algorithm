function solution(n) {
    var answer = 0;
    const sqrtNum = Math.sqrt(n);
    for (let i = 1; i <= sqrtNum; i+=1){
        if(n % i === 0) {
            answer += (i === n/i) ? i : n/i + i;
        }
    }
    return answer
}