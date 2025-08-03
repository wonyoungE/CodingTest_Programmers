function solution(num, total) {
    var answer = [];
    var start = total / num - (num - 1) / 2;
    
    for(let i = 0; i < num; i++) {
        answer.push(start + i);
    }
    
    return answer;
}