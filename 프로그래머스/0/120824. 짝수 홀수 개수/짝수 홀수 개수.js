function solution(num_list) {
    var answer = [];
    let evenCount = 0;
    let oddCount = 0;
    
    for ( const element of num_list){
        if(element % 2 === 0) evenCount += 1;
        else oddCount += 1;
    }
    answer.push(evenCount), answer.push(oddCount);
    return answer;
}