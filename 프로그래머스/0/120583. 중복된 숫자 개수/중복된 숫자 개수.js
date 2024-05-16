function solution(array, n) {
    var answer = 0;
    for (let element of array){
        if (n === element) answer += 1;
    }
    return answer;
}