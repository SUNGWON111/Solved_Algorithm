function solution(n)
{
    const strN = '0' + n;
    let answer = 0;
    for (let element of strN){
        answer += +element;
    }
    return answer;
}