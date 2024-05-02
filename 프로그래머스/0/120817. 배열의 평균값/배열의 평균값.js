function solution(numbers) {
    let numSum = 0;
    let answer = 0;
    for(let i = 0; i < numbers.length; i++){
        numSum += numbers[i]
    }
    answer = numSum / numbers.length
    return answer;
}